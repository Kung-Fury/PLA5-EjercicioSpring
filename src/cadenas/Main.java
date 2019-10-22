package cadenas;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cadenas.AppConfig;


public class Main {
	
		public static void main(String[] args) {
			
			// Inserta el archivo de configuración general que incluye ConfigInvertir y ConfigCesar
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			Codificador codigoInv = context.getBean("codifInv", Codificador.class);
					
			String cadena_inv = "";
			String cadena_cesar = "";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Inserte texto para codificación con inversión");
			cadena_inv = sc.nextLine();
			
			// Muestra la codificación mediante inversión de cadenas de letras
			System.out.println("Muestra codificación por inversión");
			System.out.println(codigoInv.codificar(cadena_inv));
			cadena_inv = codigoInv.codificar(cadena_inv);
			
			Codificador codigoCesar = context.getBean("codifCesar", Codificador.class);
			
			System.out.println("Inserte texto para codificación César");
			cadena_cesar = sc.nextLine();
			
			// Muestra la codificación Cesar
			System.out.println("Muestra codificación César");
			System.out.println(codigoCesar.codificar(cadena_cesar));
			cadena_cesar = codigoInv.codificar(cadena_cesar);
			
			// Muestra la decodificación de la cadena codificada por inversión
			System.out.println("Muestra decodificación por inversión");
			System.out.println(codigoInv.decodificar(cadena_inv));
			
			// Muestra la decodificación César
			System.out.println("Muestra decodificación César");
			System.out.println(codigoInv.decodificar(cadena_cesar));
			
			sc.close();
			context.close();
		}
}
