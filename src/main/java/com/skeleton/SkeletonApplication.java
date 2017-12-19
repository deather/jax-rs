package com.skeleton;

import java.util.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

@ApplicationPath("/api")
public class SkeletonApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(JacksonJsonProvider.class);
		classes.add(JaxbAnnotationIntrospector.class);
		return Collections.unmodifiableSet(classes);
	}

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		properties.put("jersey.config.server.provider.packages", this.getClass().getPackage().getName());
		properties.put("jersey.config.disableMoxyJson", true);
		properties.put("jersey.config.disableJsonProcessing", true);
		return Collections.unmodifiableMap(properties);
	}

}
