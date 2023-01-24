package qa.annenko.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/api.properties")
public interface ApiConfig extends Config {

    @DefaultValue("https://reqres.in")
    String baseUrl();
}
