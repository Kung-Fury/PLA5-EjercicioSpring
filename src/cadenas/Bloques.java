package cadenas;

import java.util.ArrayList;
import cadenas.Palabras;


public class Bloques implements IProcesar {
	
	int long_bloques = 4;
	Palabras palabras = new Palabras();
	
	@Override
	public ArrayList<String> dividir(String cadena) {
		ArrayList<String> bloques = new ArrayList<String>();
		ArrayList<String> palabras_aux = new ArrayList<String>();
		String bloque = "";
		palabras_aux = palabras.dividir(cadena);
		int pos_bloque_init = 0;
		int pos_bloque_fin;
		for (int i = pos_bloque_init; i < (palabras_aux.size() / long_bloques); i++) {
			pos_bloque_init = i*long_bloques;
			pos_bloque_fin = (i+1)*long_bloques;	
			bloque = bloque + palabras_aux.subList(pos_bloque_init, pos_bloque_fin);
			bloques.add(bloque);
			bloque = "";
			}
		return bloques;
	}

	@Override
	public String unir(ArrayList<String> cadenas) {
		String bloques = "";
		for (int i = 0; i < cadenas.size(); i++) {
			bloques = bloques + cadenas.get(i).concat(" ");
		}
		return bloques;
	}
}
