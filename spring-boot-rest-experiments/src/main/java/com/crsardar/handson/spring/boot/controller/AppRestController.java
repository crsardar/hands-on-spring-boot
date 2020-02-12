package com.crsardar.handson.spring.boot.controller;

import com.crsardar.handson.spring.boot.com.crsardar.handson.spring.boot.model.Person;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
public class AppRestController
{
    /*
    For http://localhost:8080//spring-boot-rest-experiments/person.json
        http://localhost:8080//spring-boot-rest-experiments/person.xml
     */
    @RequestMapping(value = "person", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Person getPersonXML()
    {
        Person person = new Person();
        person.setId(1);
        person.setFirstName("Ohmkar");
        person.setLastName("Shiva");
        person.setVillage("Kailash");
        person.setCountry("India");

        return person;
    }

    @Autowired
    CloseableHttpClient closeableHttpClient;

    @RequestMapping(method = RequestMethod.GET)
    public String test() throws Exception
    {
        HttpGet httpGet = new HttpGet("https://api.github.com/search/repositories?q=angular");

        CloseableHttpResponse httpResponse = closeableHttpClient.execute(httpGet);

        System.out.println("GET Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();

        // print result
        System.out.println(response.toString());

        return "/spring-boot-rest-experiments : Is Up & Running!";
    }
}
