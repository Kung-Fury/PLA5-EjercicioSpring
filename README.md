Vamos a realizar un programa en Spring que va a tener los siguientes elementos:

Un interfaz IProcesar que obligue a implementar las funciones:

	public ArrayList<String> dividir(String cadena); 

	public String unir(ArrayList<String> cadenas); 

Un interfaz ICodificar que obligue a implementar las siguientes funciones:

public String codificar(String cadena);

	public String decodificar(String cadena);

Crearemos dos clases que implementen IProcesar:

Palabras: Divide la cadena en 'palabras' (el espacio, no tenemos en cuenta otros caracteres) al dividir y las junta con un espacio al unir.

(Ejemplo: "hola, que tal"->["hola,","que","tal"]) 

Bloques: Tiene una longitud predeterminada de 4 y divide la cadena en bloques de esa longitud y para unirlas simplemente las vuelve a poner en fila.

(Ejemplo: "hola, que tal"->["hola,"," que"," tal"])

Crearemos dos clases que implementen ICodificacion:

Invertir: Codificar invierte la cadena y decodificar hace lo mismo. Ejemplo codificar("hola")->"aloh"

Cesar: Tiene una propiedad paso que vale 2 y realiza una codificación del tipo Cesar (https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar). Como el paso es 2 si codificar("ab")->"cd". Deberemos pasar todo a mayúsculas para simplificar y codificar sólo las letras.

Crearemos una clase Codificador con dos variables privadas del tipo IProcesar e ICodificacion. Estas variables se le pasarán en el constructor. La clase, además, incorporará una función codificar que hará lo siguiente:

- Recibe una cadena

- La divide en trozos con el método dividir de IProcesar

- Codifica cada uno de los elementos con el método codificar de Icodificacion

- Une los trozos con el método unir de IProcesar y los devuelve.

Incorporará otra función decodificar que hará lo mismo pero decodificando.

Una vez creadas para probarlas desde el main vamos a crear dos archivos de configuración. Uno de ellos utilizará la clase Palabras e Invertir como valores para el constructor de Codificador y el otro la clase Palabras y Cesar. Desde el Main probamos que todo funcione correctamente.

Todo lo haremos con annotations, sin archivo XML
