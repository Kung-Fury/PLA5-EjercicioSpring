package cadenas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cadenas")

public class ConfigCesar {
	
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar cesar() {
		return new Cesar();
	}

	@Bean
	public Codificador codifCesar(Palabras palabras, Cesar cesar) {	
		return new Codificador(palabras(), cesar());
	}
}
