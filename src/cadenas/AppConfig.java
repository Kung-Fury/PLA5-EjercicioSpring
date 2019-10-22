package cadenas;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigInvertir.class, ConfigCesar.class})

public class AppConfig {

}
