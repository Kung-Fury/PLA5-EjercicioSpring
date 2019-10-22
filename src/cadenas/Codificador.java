package cadenas;

import java.util.ArrayList;

public class Codificador {
	private IProcesar procesar;
	private ICodificar codificacion;
	
	public Codificador(IProcesar procesar, ICodificar codificacion) {
		super();
		this.procesar = procesar;
		this.codificacion = codificacion;
	}
	
	public IProcesar getProcesar() {
		return procesar;
	}

	public void setProcesar(IProcesar procesar) {
		this.procesar = procesar;
	}

	public ICodificar getCodificacion() {
		return codificacion;
	}

	public void setCodificacion(ICodificar codificacion) {
		this.codificacion = codificacion;
	}

	public String codificar(String cadena) {
		ArrayList<String> cadena_aux = new ArrayList<String>();
		String cadena_final = "";
		
		for (int i = 0; i < procesar.dividir(cadena).size(); i++) {
			cadena_aux.add(codificacion.codificar(procesar.dividir(cadena).get(i)));
		}
		cadena_final = procesar.unir(cadena_aux);	

		return cadena_final;
	}
	
	public String decodificar(String cadena) {
		ArrayList<String> cadena_aux = new ArrayList<String>();
		String cadena_final = "";
		
		for (int i = 0; i < procesar.dividir(cadena).size(); i++) {
			cadena_aux.add(codificacion.decodificar(procesar.dividir(cadena).get(i)));
		}
		cadena_final = procesar.unir(cadena_aux);	

		return cadena_final;
	}
}
