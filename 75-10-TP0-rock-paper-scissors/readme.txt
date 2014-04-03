Rock Paper Scissors (con Fire) v2.0 02/04/2014

GENERAL
--------------------------------------------------------------------------------
Se cambi� por completo el dise�o de la primer versi�n, y adem�s se relajaron 
ciertas condiciones para poder lograr el cambio. 

Cambios realizados:
- Se implement� una interfaz Element que la implementan Rock, Paper, Scissors y
Fire.
- Se cre� una clase Referee, encargada de decidir al ganador en cada partida
jugada.
- Se cre� una clase Rules responsable de obtener las reglas y guardarlas para su
futuro uso por Referee.

DETALLE DE LOS CAMBIOS
--------------------------------------------------------------------------------
- La interfaz Element tiene un m�todo VS() en el cual, en la implementaci�n,
el encargado debe utilizar a la clase Referee para decidir cu�l es el elemento
ganador.
- La clase Referee se ocupa de mirar en una tabla (cargada previamente por
Rules) si el elemento en cuesti�n le gana o no al que se enfrenta. 
Devuelve el correspondiente elemento.
- La clase Rules se encarga de leer de un archivo XML las reglas del juego, es 
decir, una lista de los elementos a los que le gana cada elemento. No es necesario
guardar adem�s la lista de los elementos contra los que pierde, ya que el 
problema es sim�trico. Para leer el archivo XML, se utiliza el parser XML SAX.

CONDICIONES RELAJADAS
--------------------------------------------------------------------------------
- Los m�todos dejaron de tener una �nica l�nea de c�digo, ya que no era posible
la lectura del archivo XML por ejemplo con una �nica l�nea de c�digo.
- Se utilizaron ocacionalmente sentencias IF, ya que al leer del archivo XML las 
reglas, era necesario saber de que Element proven�a cierta regla.
- Se utiliz� try/catch en la lectura del archivo, ya que el lector seleccionado
para realizar esta tarea lo requer�a.

CONCLUSIONES DEL NUEVO DISE�O
--------------------------------------------------------------------------------
Al agregar la nueva regla al juego (Fire), fue m�s f�cil la refactorizaci�n del 
c�digo para incluirla. Se tuvo que modificar solamente la clase Rules, adem�s del
archivo de reglas XML.

--------------------------------------------------------------------------------
NOTA: Se agrega la carpeta doc con el correspondiente javadoc adentro. 
--------------------------------------------------------------------------------
Bel�n Beltr�n.
