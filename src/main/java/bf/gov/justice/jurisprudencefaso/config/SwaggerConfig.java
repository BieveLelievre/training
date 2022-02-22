package bf.gov.justice.jurisprudencefaso.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${swagger.version:0.0.0}")
    private String swaggerVersion;

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact();
        contact.setName("MJDHPC/DSI");
        contact.setUrl("http://www.justice.gov.bf");
        contact.setEmail("dsi@justice.gov.bf");
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("JURI API REST")
                        .description("Swagger UI Integration for JURI API REST.")
                        .version(swaggerVersion)
                        /*.contact(contact)*/);
    }
}
