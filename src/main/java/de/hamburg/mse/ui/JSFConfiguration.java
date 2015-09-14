package de.hamburg.mse.ui;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.faces.config.FacesInitializer;

@Configuration
public class JSFConfiguration implements ServletContextInitializer {

	@Bean
	public ServletRegistrationBean facesServletRegistration() {

		ServletRegistrationBean servletRegistrationBean = new JsfServletRegistrationBean();

		return servletRegistrationBean;
	}

	public class JsfServletRegistrationBean extends ServletRegistrationBean {

		public JsfServletRegistrationBean() {
			super();
		}

		@Override
		public void onStartup(ServletContext servletContext) throws ServletException {

			FacesInitializer facesInitializer = new FacesInitializer();

			Set<Class<?>> clazz = new HashSet<Class<?>>();
			clazz.add(JSFConfiguration.class);
			facesInitializer.onStartup(clazz, servletContext);
		}
	}

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		sc.setInitParameter("primefaces.THEME", "Dark");
		sc.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
		sc.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
		sc.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
	}
}