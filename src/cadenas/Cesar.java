package cadenas;

public class Cesar implements ICodificar {

	@Override
	public String codificar(String cadena) {
		String cifrado = "";
		int paso = 2;
		char letra;
		
	    for(int i=0; i < cadena.length();i++) 
        {
            letra = cadena.charAt(i);
            
            if(letra >= 'a' && letra <= 'z') 
            {
             letra = (char) (letra + paso);
             if(letra > 'z') {
                letra = (char) (letra+'a'-'z'-1);
             }
             cifrado = cifrado + letra;
            }
            
            else if(letra >= 'A' && letra <= 'Z') {
             letra = (char) (letra + paso);    
                
             if(letra > 'Z') {
                 letra = (char) (letra+'A'-'Z'-1);
             }
             cifrado = cifrado + letra;
            }
            else {
             cifrado = cifrado + letra;   
            }
        
    }
		
		return cifrado;
	}

	@Override
	public String decodificar(String cadena) {
		String cifrado = "";
		int paso = -2;
		char letra;
		
	    for(int i=0; i < cadena.length();i++) 
        {
            letra = cadena.charAt(i);
            
            if(letra >= 'a' && letra <= 'z') 
            {
             letra = (char) (letra + paso);
             if(letra > 'z') {
                letra = (char) (letra+'a'-'z'-1);
             }
             cifrado = cifrado + letra;
            }
            
            else if(letra >= 'A' && letra <= 'Z') {
             letra = (char) (letra + paso);    
                
             if(letra > 'Z') {
                 letra = (char) (letra+'A'-'Z'-1);
             }
             cifrado = cifrado + letra;
            }
            else {
             cifrado = cifrado + letra;   
            }
        
    }

		return cifrado;
	}
}
