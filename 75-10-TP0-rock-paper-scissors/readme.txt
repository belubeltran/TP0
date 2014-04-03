Rock Paper Scissors (con Fire) v2.0 02/04/2014

GENERAL
--------------------------------------------------------------------------------
Se cambió por completo el diseño de la primer versión, y además se relajaron 
ciertas condiciones para poder lograr el cambio. 

Cambios realizados:
- Se implementó una interfaz Element que la implementan Rock, Paper, Scissors y
Fire.
- Se creó una clase Referee, encargada de decidir al ganador en cada partida
jugada.
- Se creó una clase Rules responsable de obtener las reglas y guardarlas para su
futuro uso por Referee.

DETALLE DE LOS CAMBIOS
--------------------------------------------------------------------------------
- La interfaz Element tiene un método VS() en el cual, en la implementación,
el encargado debe utilizar a la clase Referee para decidir cuál es el elemento
ganador.
- La clase Referee se ocupa de mirar en una tabla (cargada previamente por
Rules) si el elemento en cuestión le gana o no al que se enfrenta. 
Devuelve el correspondiente elemento.
- La clase Rules se encarga de leer de un archivo XML las reglas del juego, es 
decir, una lista de los elementos a los que le gana cada elemento. No es necesario
guardar además la lista de los elementos contra los que pierde, ya que el 
problema es simétrico. Para leer el archivo XML, se utiliza el parser XML SAX.

CONDICIONES RELAJADAS
--------------------------------------------------------------------------------
- Los métodos dejaron de tener una única línea de código, ya que no era posible
la lectura del archivo XML por ejemplo con una única línea de código.
- Se utilizaron ocacionalmente sentencias IF, ya que al leer del archivo XML las 
reglas, era necesario saber de que Element provenía cierta regla.
- Se utilizó try/catch en la lectura del archivo, ya que el lector seleccionado
para realizar esta tarea lo requería.

CONCLUSIONES DEL NUEVO DISEÑO
--------------------------------------------------------------------------------
Al agregar la nueva regla al juego (Fire), fue más fácil la refactorización del 
código para incluirla. Se tuvo que modificar solamente la clase Rules, además del
archivo de reglas XML.

--------------------------------------------------------------------------------
NOTA: Se agrega la carpeta doc con el correspondiente javadoc adentro. 
--------------------------------------------------------------------------------
Belén Beltrán.
