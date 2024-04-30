package usuario.api.nova.doc;


import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguracoes {

    private Contact contato() {
        return new Contact(
                "jadeilton",
                "http://www.jaderasta.com.br",
                "jade@rasta.com.br");
    }
}
