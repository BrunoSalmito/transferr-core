package br.com.transferr.core;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.transferr.rest.providers.JacksonConfigProvider;

@Component
@ApplicationPath("rest")
public class ApplicationJerseyConfig extends ResourceConfig {

	public ApplicationJerseyConfig() {
		packages("br.com.transferr.rest");
		//setProperties(getPropertiesFor());
		register(JacksonConfigProvider.class);
		System.out.println("********* Init Jersey Application ...... OK **********");
	}
	
	/*
    private Map<String, Object> getPropertiesFor() {
        final Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages",
                       "br.com.transferr.rest.providers");
        return properties;
    }
    */
}
