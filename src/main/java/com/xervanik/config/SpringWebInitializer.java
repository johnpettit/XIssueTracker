package com.xervanik.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * <h1>SpringWebInitializer</h1>
 * SpringWebInitializer
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-15
 */
public class SpringWebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebMVCConfig.class);
        context.setServletContext(servletContext);

        // Spring MVC front controller
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}