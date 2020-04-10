Steps -

1. Create normal SpringBoot application

2. Make JAR 
    mvn package

3. Create Dockerfile with given content

4. Create Docker image -
    
    docker build -t crsardar/hello-docker-spring-boot       
    
    // from the dir where th Dockerfile is located
    
5. Run an instance of the Docker image

    docker run -p 8080:8080 -t crsardar/hello-docker-spring-boot
    
7. Test - http://localhost:8080/hello-docker-spring-boot/