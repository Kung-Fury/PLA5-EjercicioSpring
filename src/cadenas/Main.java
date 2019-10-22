package cadenas;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cadenas.AppConfig;


public class Main {
	
		public static void main(String[] args) {
			
			// Inserta el archivo de configuraci�n general que incluye ConfigInvertir y ConfigCesar
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			Codificador codigoInv = context.getBean("codifInv", Codificador.class);
					
			String cadena_inv = "";
			String cadena_cesar = "";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Inserte texto para codificaci�n con inversi�n");
			cadena_inv = sc.nextLine();
			
			// Muestra la codificaci�n mediante inversi�n de cadenas de letras
			System.out.println("Muestra codificaci�n por inversi�n");
			System.out.println(codigoInv.codificar(cadena_inv));
			cadena_inv = codigoInv.codificar(cadena_inv);
			
			Codificador codigoCesar = context.getBean("codifCesar", Codificador.class);
			
			System.out.println("Inserte texto para codificaci�n C�sar");
			cadena_cesar = sc.nextLine();
			
			// Muestra la codificaci�n Cesar
			System.out.println("Muestra codificaci�n C�sar");
			System.out.println(codigoCesar.codificar(cadena_cesar));
			cadena_cesar = codigoInv.codificar(cadena_cesar);
			
			// Muestra la decodificaci�n de la cadena codificada por inversi�n
			System.out.println("Muestra decodificaci�n por inversi�n");
			System.out.println(codigoInv.decodificar(cadena_inv));
			
			// Muestra la decodificaci�n C�sar
			System.out.println("Muestra decodificaci�n C�sar");
			System.out.println(codigoInv.decodificar(cadena_cesar));
			
			sc.close();
			context.close();
		}
}
