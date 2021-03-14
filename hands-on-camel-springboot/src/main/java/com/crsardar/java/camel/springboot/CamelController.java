package com.crsardar.java.camel.springboot;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

@Component
public class CamelController extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .contextPath("/").port(8080)
                .apiContextPath("/api-doc")
                .apiProperty("api.title", "Person APIs")
                .apiProperty("api.version", "0.1")
                .apiProperty("cors", "true");


        rest("/person")
                .description("Per rest service")
                .consumes("application/json")
                .produces("application/json")

                .get("/{id}").description("Per user by id").outType(Person.class)
                .param().name("id").type(RestParamType.path)
                .description("The id of the user to get").dataType("int").endParam()
                .to("bean:personService?method=getPerson(${header.id})")

                .put().description("Updates or create a Person").type(Person.class)
                .param().name("body").type(RestParamType.body)
                .description("The person to update or create").endParam()
                .to("bean:personService?method=addPerson")

                .get("/all").description("Find all person").outType(Person[].class)
                .to("bean:personService?method=getPersons");

    }
}