package cadenas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cadenas")

public class ConfigInvertir {
	
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar invertir() {
		return new Invertir();
	}

	@Bean
	public Codificador codifInv(Palabras palabras, Invertir invertir) {	
		return new Codificador(palabras(), invertir());
	}
}
