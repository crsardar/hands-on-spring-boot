# handson-java-spring-mvn/hello-spring-boot
Hands on Spring Boot REST APIs that produces XML & JSON responses.

1. Run the main method of App
2. http://localhost:8080//hello-spring-boot/person-json     // Produces JSON
3. http://localhost:8080//hello-spring-boot/person-xml      // Produces XML

Content Negotiation - Get JSON and XML response from same end point :

    http://localhost:8080//hello-spring-boot/person
    In PostMan :
        For JSON add headers - Accept:application/json 
        For XML add headers - Accept:application/xml
 