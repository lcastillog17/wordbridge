grammar WordBridge;

// Regla para reconocer un conjunto de parrafos
text: (paragraph (new_line paragraph)* new_line*)?;

// Regla inicial para reconocer un párrafo
paragraph: new_line* sentence (dot white_space sentence)* dot?;

// Regla para reconocer una oración
sentence: statement;

// Regla para reconocer una oración afirmativa
statement: subject (white_space predicate)?; 

// Reglas para reconocer cada uno de los elementos de la oración
subject: article white_space noun (white_space adjective)?;

// Regla para reconocer un predicado
predicate: verb (white_space object)?;

// Regla para reconocer un objeto
object: (adverb white_space)? (article white_space)? (adjective white_space)? noun;

verb: VERB;

article: ARTICLE;

adjective: ADJECTIVE;

noun: NOUN;

adverb: ADVERB;

preposition: PREPOSITION;

conjunction: CONJUNCTION;

interjection: INTERJECTION;

contraction: CONTRACTION;

dot: DOT;

new_line: NEW_LINE;

white_space: WHITE_SPACE;

PRONOMBRE: 'yo' | 'tú' | 'él' | 'ella' | 'nosotros' | 'vosotros' | 'ellos' | 'ellas' ;

VERB: 'corre' | 'salta' | 'canta' | 'come' | 'duerme' | 'está' | 'es' | 'ha' ;

ARTICLE: 'el' | 'la' | 'los' | 'las' | 'un' | 'una' | 'unos' | 'unas' ;

ADJECTIVE: 'rojo' | 'azul' | 'grande' | 'pequeño' | 'bello' | 'feo' | 'delicioso' | 'horrible' ;

NOUN: 'perro' | 'gato' | 'árbol' | 'montaña' | 'amor' | 'odio' | 'silla' | 'mesa' | 'comida';

ADVERB: 'rápidamente' | 'lentamente' | 'bien' | 'mal' | 'siempre' | 'nunca' | 'aquí' | 'allí' ;

PREPOSITION: 'a' | 'de' | 'en' | 'por' | 'para' | 'con' | 'sin' | 'hacia' ;

CONJUNCTION: 'y' | 'o' | 'pero' | 'porque' | 'aunque' | 'si' | 'cuando' | 'mientras' ;

INTERJECTION: '¡hola!' | '¡adiós!' | '¡ay!' | '¡ouch!' | '¡viva!' | '¡oh!' | '¡uf!' ;

CONTRACTION: 'al' | 'del' | 'alguno' | 'alguna' | 'algunos' | 'algunas' | 'de' | 'por' ;

DOT: '.';

NEW_LINE: '\r'? '\n';

WHITE_SPACE: [ \t]+;

UNRECOGNIZED: . -> skip;
