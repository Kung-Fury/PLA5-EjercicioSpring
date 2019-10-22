package cadenas;

public class Invertir implements ICodificar{

	@Override
	public String codificar(String cadena) {
	    String invertida = ""; 
        for(int i = cadena.length() - 1; i >= 0; i--)
            invertida = invertida + cadena.charAt(i);
        return invertida;
	}

	@Override
	public String decodificar(String cadena) {
		String invertida = ""; 
        for(int i = cadena.length() - 1; i >= 0; i--)
            invertida = invertida + cadena.charAt(i);
        return invertida;
	}

}
