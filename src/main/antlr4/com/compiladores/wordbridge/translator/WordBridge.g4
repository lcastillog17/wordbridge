grammar WordBridge;

// Regla para reconocer un conjunto de parrafos
text: (paragraph (new_line paragraph)* new_line*)?;

// Regla inicial para reconocer un párrafo
paragraph: new_line* sentence (sentence)*;

// Regla para reconocer una oración afirmativa simple
sentence: statement;

// Regla para reconocer una oración afirmativa
statement: subject predicate? dot? white_space?; 

// Reglas para reconocer cada uno de los elementos de la oración
subject: (article white_space)? noun (white_space adjective)?;

// Regla para reconocer un predicado
predicate: white_space verb object;

// Regla para reconocer un objeto
object: (white_space adverb)? (white_space article)? (white_space noun)? (white_space adjective)?;

noun: NOUN;
adjective: POSSESSIVE_ADJECTIVE | DEMONSTRATIVE_ADJECTIVE | QUALIFYING_ADJECTIVE | CARDINAL_ADJECTIVE | ORDINAL_ADJECTIVE | INDEFINITE_ADJECTIVE;
article: DEFINITE_ARTICLE | INDEFINITE_ARTICLE;
pronoun: PERSONAL_PRONOUN | NUMERAL_PRONOUN | DEMOSTRATIVE_PRONOUN | INTERROGATIVE_PRONOUN;
verb: PRESENT_TENSE_VERB;
adverb: TIME_ADVERB | PLACE_ADVERB | QUANTITY_ADVERB | MODE_ADVERB | AFFIRMATION_ADVERB | NEGATION_ADVERB | DOUBT_ADVERB;
preposition: PREPOSITION;
conjunction: COORDINATING_CONJUNCTION | SUBORDINANT_CONJUNCTION;
interjection: INTERJECTION;
contraction: CONTRACTION;
dot: DOT;
new_line: NEW_LINE;
white_space: WHITE_SPACE;

// SUSTANTIVOS
NOUN: 'tiempo' | 'persona' | 'año' | 'día' | 'manera' | 'país' | 'vida' | 'mano' | 'parte' | 'caso' | 'grupo' | 'problema' | 'hecho' | 'sistema' | 'lugar' | 'trabajo' | 'manera' | 'programa' | 'historia' | 'juego' | 'familia' | 'gobierno' | 'compañía' | 'número' | 'sistema' | 'semana' | 'empresa' | 'punto' | 'casa' | 'país' | 'historia' | 'partido' | 'información' | 'universidad' | 'ciudad' | 'equipo' | 'mercado' | 'manera' | 'nivel' | 'lugar' | 'plan' | 'proceso' | 'servicio' | 'estudio' | 'vida' | 'medio' | 'razón' | 'momento' | 'persona' | 'lugar';

// ADJETIVOS
POSSESSIVE_ADJECTIVE: 'mi' | 'tu' | 'su' | 'nuestro' | 'nuestra' | 'vuestro' | 'vuestra' | 'su';
DEMONSTRATIVE_ADJECTIVE: 'este' | 'ese' | 'aquel' | 'estos' | 'esos' | 'aquellos' | 'esta' | 'esa' | 'aquella' | 'estas' | 'esas' | 'aquellas';
QUALIFYING_ADJECTIVE: 'bueno' | 'buena' | 'malo' | 'mala' | 'grande' | 'pequeño' | 'pequeña' | 'importante' | 'fácil' | 'difícil' | 'nuevo' | 'nueva' | 'viejo' | 'vieja' | 'hermoso' | 'hermosa' | 'feo' | 'fea' | 'feliz' | 'triste' | 'interesante' | 'aburrido' | 'aburrida' | 'rico' | 'rica' | 'pobre' | 'inteligente' | 'tonto' | 'tonta' | 'valiente' | 'cobarde';
CARDINAL_ADJECTIVE: 'uno' | 'dos' | 'tres' | 'cuatro' | 'cinco' | 'seis' | 'siete' | 'ocho' | 'nueve' | 'diez';
ORDINAL_ADJECTIVE: 'primero' | 'segundo' | 'tercero' | 'cuarto' | 'quinto' | 'sexto' | 'séptimo' | 'octavo' | 'noveno' | 'décimo' | 'primera' | 'segunda' | 'tercera' | 'cuarta' | 'quinta' | 'sexta' | 'séptima' | 'octava' | 'novena' | 'décima';
INDEFINITE_ADJECTIVE: 'otro' | 'varios' | 'muchos' | 'pocos' | 'algún' | 'ninguno' | 'cierto' | 'cualquier' | 'otra' | 'varias' | 'muchas' | 'pocas' | 'algúna' | 'ninguna' | 'cierta' | 'cualquiera';

// ARTICULOS
DEFINITE_ARTICLE: 'el' | 'la' | 'los' | 'las';
INDEFINITE_ARTICLE: 'un' | 'una' | 'unos' | 'unas';

// PRONOMBRES
PERSONAL_PRONOUN: 'yo' | 'tú' | 'él' | 'ella' | 'usted' | 'nosotros' | 'nosotras' | 'vosotros' | 'vosotras' | 'ellos' | 'ellas' | 'ustedes';
NUMERAL_PRONOUN: 'uno' | 'una' | 'dos' | 'tres' | 'cuántos' | 'cuántas';
DEMOSTRATIVE_PRONOUN: 'este' | 'esta' | 'ese' | 'esa' | 'aquel' | 'aquella' | 'estos' | 'estas' | 'esos' | 'esas' | 'aquellos' | 'aquellas';
INTERROGATIVE_PRONOUN: 'quién' | 'quienes' | 'qué' | 'cuál' | 'cuáles' | 'cuánto' | 'cuánta';

// VERBOS
PRESENT_TENSE_VERB:
// PRIMERA PERSONA
'soy' | 'estoy' | 'tengo' | 'hago' | 'digo' | 'voy' | 'veo' | 'sé' | 'puedo' | 'pongo' | 'quiero' | 'vengo' | 'doy' | 'parezco' | 'llevo' | 'gusto' | 'oigo' | 'pienso' | 'salgo' | 'encuentro' | 'miro' | 'como' | 'vivo' | 'siento' | 'hablo' | 'sigo' | 'creo' | 'recibo' | 'juego' | 'trabajo' | 'escribo' | 'conozco' | 'dejo' | 'comienzo' | 'necesito' | 'estudio' | 'llevo' | 'cojo' | 'abro' | 'cierro' | 'llego' | 'termino' | 'camino' | 'pregunto' | 'escucho' | 'viajo' | 'compro' | 'entiendo' | 'espero' | 'llevo' |
// TERCERA PERSONA
'es' | 'está' | 'tiene' | 'hace' | 'dice' | 'va' | 've' | 'sabe' | 'puede' | 'pone' | 'quiere' | 'viene' | 'da' | 'parece' | 'lleva' | 'gusta' | 'oye' | 'piensa' | 'sale' | 'encuentra' | 'mira' | 'come' | 'vive' | 'siente' | 'habla' | 'sigue' | 'cree' | 'recibe' | 'juega' | 'trabaja' | 'escribe' | 'conoce' | 'deja' | 'comienza' | 'necesita' | 'estudia' | 'lleva' | 'coge' | 'abre' | 'cierra' | 'llega' | 'termina' | 'camina' | 'pregunta' | 'escucha' | 'viaja' | 'compra' | 'entiende' | 'espera' | 'lleva' |
;

// ADVERBIOS
TIME_ADVERB: 'ahora' | 'luego' | 'después' | 'pronto' | 'siempre' | 'nunca' | 'todavía' | 'ya' | 'ayer' | 'hoy' | 'mañana' | 'tarde' | 'temprano';
PLACE_ADVERB: 'aquí' | 'allí' | 'cerca' | 'lejos' | 'dentro' | 'fuera' | 'arriba' | 'abajo' | 'adelante' | 'atrás' | 'encima' | 'debajo';
QUANTITY_ADVERB: 'muy' | 'bastante' | 'poco' | 'mucho' | 'demasiado' | 'casi' | 'solo' | 'todo' | 'nada' | 'algo' | 'más' | 'menos' | 'tanto';
MODE_ADVERB: 'bien' | 'mal' | 'rápido' | 'despacio' | 'fácilmente' | 'lentamente' | 'claramente' | 'simplemente' | 'directamente' | 'suavemente' | 'fuertemente' | 'silenciosamente';
AFFIRMATION_ADVERB: 'sí' | 'también' | 'ciertamente' | 'efectivamente' | 'indudablemente' | 'obviamente' | 'realmente' | 'verdaderamente' | 'seguro' | 'por supuesto' | 'sin duda' | 'evidentemente';
NEGATION_ADVERB: 'no' | 'nunca' | 'jamás' | 'tampoco' | 'de ninguna manera' | 'en absoluto' | 'ni' | 'negativamente' | 'nada' | 'nadie' | 'ningún' | 'ninguna' | 'sin';
DOUBT_ADVERB: 'quizás' | 'tal vez' | 'acaso' | 'probablemente' | 'posiblemente' | 'seguramente' | 'quizá' | 'a lo mejor' | 'dudoso' | 'incierto' | 'puede ser' | 'quién sabe';

// PREPOSICIONES
PREPOSITION: 'a' | 'ante' | 'bajo' | 'cabe' | 'con' | 'contra' | 'de' | 'desde' | 'durante' | 'en' | 'entre' | 'hacia' | 'hasta' | 'mediante' | 'para' | 'por' | 'según' | 'sin' | 'sobre' | 'tras';

// CONJUNCIONES
COORDINATING_CONJUNCTION: 'y' | 'o' | 'ni' | 'pero' | 'aunque' | 'sino' | 'más' | 'bien' | 'sino que' | 'ya que';
SUBORDINANT_CONJUNCTION: 'que' | 'si' | 'cuando' | 'como' | 'porque' | 'aunque' | 'mientras' | 'antes' | 'después' | 'mientras que';

// INTERJECCIONES
INTERJECTION: '¡hola!' | '¡adiós!' | '¡ay!' | '¡ah!' | '¡oh!' | '¡uf!' | '¡vaya!' | '¡bravo!' | '¡felicidades!' | '¡guau!';

// CONTRACCIONES
CONTRACTION: 'al' | 'del';

DOT: '.';

NEW_LINE: '\r'? '\n';

WHITE_SPACE: [ \t]+;

UNRECOGNIZED: . -> skip;
