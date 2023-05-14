package com.compiladores.wordbridge.translator;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.compiladores.wordbridge.translator.customtranslator.WordBridgeCustomSpanishToEnglishTranslator;
import com.compiladores.wordbridge.translator.customtranslator.WordBridgeCustomTranslator;
import com.compiladores.wordbridge.translator.errorhandling.WordBridgeCustomErrorsListener;
import com.compiladores.wordbridge.translator.errorhandling.WordBridgeCustomErrorsTable;
import com.compiladores.wordbridge.translator.symbolhandling.WordBridgeCustomSymbolsTable;
import com.compiladores.wordbridge.translator.symbolhandling.WordBridgeCustomVisitor;
import com.compiladores.wordbridge.translator.vocabulary.spanish.WordBridgeCustomSpanishDictionary;

public class App extends JFrame {
	
	private static JTextArea textAreaInput;
	private static JTextArea textAreaOutput;
	private static JTable tableSymbol;
    private static JTable tableError;
    
	private final String DICTIONARY_PATH = "Diccionario.csv";
    
    private final String[] SYMBOL_TABLE_COLUMNS = {"ID", "Token", "Lexema"};
    private final String[] ERROR_TABLE_COLUMNS = {"Linea", "Columna", "Mensaje"};
    
    private final DefaultTableModel EMPTY_SYMBOL_TABLE_MODEL = new DefaultTableModel(new String[][]{}, SYMBOL_TABLE_COLUMNS);
    private final DefaultTableModel EMPTY_ERROR_TABLE_MODEL = new DefaultTableModel(new String[][]{}, ERROR_TABLE_COLUMNS);

    public App() {
        initComponents();
    }

    private void initComponents() {
    	// Configuración de la ventana
    	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	setTitle("WordBridge");
    	setPreferredSize(new Dimension(1000, 450));

    	// Creación de la label para el área de texto de la entrada
    	JLabel labelInputTextArea = new JLabel("Ingresar texto");
    	labelInputTextArea.setHorizontalAlignment(JLabel.CENTER);

    	// Creación del área de texto de entrada
    	textAreaInput = new JTextArea();
    	textAreaInput.setRows(10);
    	textAreaInput.getDocument().addDocumentListener(new DocumentListener() {
    		@Override
            public void insertUpdate(DocumentEvent e) {
    			translate();
    		}
            @Override
            public void removeUpdate(DocumentEvent e) {
                translate();
            }
			@Override
			public void changedUpdate(DocumentEvent e) {}
    		
    	});
    	JScrollPane scrollInputTextArea = new JScrollPane(textAreaInput);
    	
    	// Creación de la label para el área de texto de la salida
    	JLabel labelOutputTextArea = new JLabel("Traducción");
    	labelOutputTextArea.setHorizontalAlignment(JLabel.CENTER);

    	// Creación del área de texto de salida
    	textAreaOutput = new JTextArea();
    	textAreaOutput.setRows(10);
    	textAreaOutput.setEditable(false);
    	JScrollPane scrollOutputTextArea = new JScrollPane(textAreaOutput);

    	// Creación de la etiqueta para la tabla de simbolos
    	JLabel labelSymbolTable = new JLabel("Tabla de Simbolos");
    	labelSymbolTable.setHorizontalAlignment(JLabel.CENTER);

    	// Creación de la tabla de simbolos
    	tableSymbol = new JTable(EMPTY_SYMBOL_TABLE_MODEL);
    	JScrollPane scrollSymbolTable = new JScrollPane(tableSymbol);

    	// Creación de la etiqueta para la tabla de errores
    	JLabel labelErrorTable = new JLabel("Tabla de Errores");
    	labelErrorTable.setHorizontalAlignment(JLabel.CENTER);

    	// Creación de la tabla de errores
    	tableError = new JTable(EMPTY_ERROR_TABLE_MODEL);
    	JScrollPane scrollErrorTable = new JScrollPane(tableError);

    	// Creación del panel para la tabla de símbolos y su etiqueta
    	JPanel panelSymbolTable = new JPanel(new BorderLayout());
    	panelSymbolTable.add(labelSymbolTable, BorderLayout.NORTH);
    	panelSymbolTable.add(scrollSymbolTable, BorderLayout.CENTER);

    	// Creación del panel para la tabla de errores y su etiqueta
    	JPanel panelTableError = new JPanel(new BorderLayout());
    	panelTableError.add(labelErrorTable, BorderLayout.NORTH);
    	panelTableError.add(scrollErrorTable, BorderLayout.CENTER);

    	// Creación del panel para el área de texto de la entrada
    	JPanel panelInputTextArea = new JPanel(new BorderLayout());
    	panelInputTextArea.add(labelInputTextArea, BorderLayout.NORTH);
    	panelInputTextArea.add(scrollInputTextArea, BorderLayout.CENTER);
    	
    	// Creación del panel para el área de texto de la salida
    	JPanel panelOutputTextArea = new JPanel(new BorderLayout());
    	panelOutputTextArea.add(labelOutputTextArea, BorderLayout.NORTH);
    	panelOutputTextArea.add(scrollOutputTextArea, BorderLayout.CENTER);
    	
    	// Creación del panel para las áreas de texto
    	JPanel panelTextAreas = new JPanel(new GridLayout(1, 2));
    	panelTextAreas.add(panelInputTextArea, BorderLayout.WEST);
    	panelTextAreas.add(panelOutputTextArea, BorderLayout.EAST);
    	
    	// Creación del panel para las tablas
    	JPanel panelTables = new JPanel(new GridLayout(1, 2));
    	panelTables.add(panelSymbolTable, BorderLayout.WEST);
    	panelTables.add(panelTableError, BorderLayout.EAST);

    	// Creación del panel principal para las dos tablas y el área de texto
    	JPanel panelMain = new JPanel(new GridLayout(2, 1));
    	panelMain.add(panelTextAreas, BorderLayout.NORTH);
    	panelMain.add(panelTables, BorderLayout.CENTER);

    	// Configuración del layout y agregado de componentes
    	JPanel panel = new JPanel(new BorderLayout());
    	panel.add(panelMain, BorderLayout.CENTER);

    	getContentPane().setLayout(new BorderLayout());
    	getContentPane().add(panel, BorderLayout.CENTER);

    	pack();
    }

    private void translate() {
    	
    	// Se obtiene el codigo ingresado en el area de texto
    	String inputCode = textAreaInput.getText();

    	// Se crea un ANTLRInputStream a partir del codigo obtenido anteriormente
    	ANTLRInputStream inputStream = new ANTLRInputStream(inputCode);

    	// Se crea un lexer para analizar los tokens del codigo
    	WordBridgeLexer lexer = new WordBridgeLexer(inputStream);

    	// Se crea un CommonTokenStream a partir del lexer creado anteriormente
    	CommonTokenStream tokens = new CommonTokenStream(lexer);

    	// Se crea un parser para analizar la estructura del codigo
    	WordBridgeParser parser = new WordBridgeParser(tokens);
    	
    	// Se crea un objeto para la tabla de errores
    	WordBridgeCustomErrorsTable errorsTable = new WordBridgeCustomErrorsTable();

    	// Se crea un WordBridgeCustomErrorListener para manejar los errores de analisis
    	WordBridgeCustomErrorsListener errorsListener = new WordBridgeCustomErrorsListener(errorsTable);

    	// Se remueven los listeners de error por defecto y se agrega el listener personalizado
    	parser.removeErrorListeners();
    	parser.addErrorListener(errorsListener);

    	// Se obtiene el arbol de parseo a partir del codigo analizado por el parser
    	WordBridgeParser.TextContext tree = parser.text();

	    // Se crea un objeto para la tabla de simbolos
	    WordBridgeCustomSymbolsTable symbolsTable = new WordBridgeCustomSymbolsTable();
	    
	    // Se crea el dictionario correspondiente, se carga el diccionario en memoria y luego se crea el traductor
	    WordBridgeCustomSpanishDictionary spanishToEnglishDictionary = new WordBridgeCustomSpanishDictionary(DICTIONARY_PATH);
	    spanishToEnglishDictionary.loadDictionary();
	    WordBridgeCustomTranslator spanishToEnglishTranslator = new WordBridgeCustomSpanishToEnglishTranslator(spanishToEnglishDictionary);
	    
    	// Se crea un WordBridgeCustomVisitor para visitar el arbol de parseo y generar el codigo de salida
    	WordBridgeCustomVisitor visitor = new WordBridgeCustomVisitor(spanishToEnglishTranslator, symbolsTable);
    	String translation = visitor.visit(tree);
    	
    	// Se muestra la tabla de simbolos en una tabla grafica
    	Object[][] tableSymbolData = symbolsTable.getSymbolsTable();
    	tableSymbol.setModel(new DefaultTableModel(tableSymbolData, SYMBOL_TABLE_COLUMNS));
    	
    	// Se muestran en la interfaz grafica los errors capturados
	    Object[][] tableErrorData = errorsTable.getErrorsTable();
	    if (errorsTable.hasErrors()) {
	    	tableError.setModel(new DefaultTableModel(tableErrorData, ERROR_TABLE_COLUMNS));	    	
	    } else {
	    	tableError.setModel(EMPTY_ERROR_TABLE_MODEL);
	    }

    	// Se muestra la traduccion en el area de texto de salida
    	textAreaOutput.setText(translation);
    	
    }

    public static void main(String[] args) {
        App form = new App();
        form.setVisible(true);
    }
}