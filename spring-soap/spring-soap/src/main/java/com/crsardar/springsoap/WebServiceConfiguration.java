package com.crsardar.springsoap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfiguration {

    @Bean
    public ServletRegistrationBean manageDispatcherServlet(ApplicationContext applicationContext) {

        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(applicationContext);
        messageDispatcherServlet.setTransformWsdlLocations(true);

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(messageDispatcherServlet,
                "/ws/*");

        return servletRegistrationBean;
    }

    @Bean(name = "employee") // For http://localhost:8080/ws/employee.wsdl
    public DefaultWsdl11Definition getDefaultWsdl11Definition(XsdSchema courseSchema) {

        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setPortTypeName("EmpPort");
        defaultWsdl11Definition.setTargetNamespace("http://com.crsardar.springboot.soap/emp");
        defaultWsdl11Definition.setLocationUri("/ws");
        defaultWsdl11Definition.setSchema(courseSchema);

        return defaultWsdl11Definition;
    }

    @Bean
    public XsdSchema courseSchema() {
        return new SimpleXsdSchema(new ClassPathResource("emp-details.xsd"));
    }
}
