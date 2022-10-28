package org.revalida.example.spring_jersey_demo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.revalida.example.spring_jersey_demo.controller.AccountController;
import org.springframework.stereotype.Component;


@Component
@ApplicationPath("/api")
public class JerseyAppConfig extends ResourceConfig {

	public JerseyAppConfig() {
		//packages("org.revalida.example.spring_jersey_demo.controller");
		register(AccountController.class);
	}
}
