package com.jjimenezpj;

import org.primefaces.webapp.filter.FileUploadFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.faces.webapp.FacesServlet;
import javax.servlet.MultipartConfigElement;

/**
 * Clase Principal de la aplicación
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //Necesario para que PRIMEFACES + JSF funcione
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(new Class[]{Application.class});
    }

    @Bean
    public FilterRegistrationBean fileUploadFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.addUrlPatterns("*.jsf");
        registrationBean.setFilter(new FileUploadFilter());
        return registrationBean;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(MultipartConfigElement multipartConfigElement) {
        FacesServlet servlet = new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.jsf");
        servletRegistrationBean.setMultipartConfig(multipartConfigElement);
        return servletRegistrationBean;
    }

}
