Steps -

1. Create normal SpringBoot application

2. Make JAR 
    mvn package

3. Create Dockerfile with given content

4. Create Docker image -
    
    sudo docker build -t crsardar/hello-docker-spring-boot .
    
    // from the dir where th Dockerfile is located
    
5. Run an instance of the Docker image

    sudo docker run -p 8080:8080 -t crsardar/hello-docker-spring-boot

   // To release console add " &" at the end
   //Like - "sudo docker run -p 8080:8080 -t crsardar/hello-docker-spring-boot &"
    
7. Test - http://localhost:8080/hello-docker-spring-boot/

Note: 
	* Before Step 2 -
		1. Java should be installed
		2. JAVA_HOME should be set
		3. MVN_HOME/bin should be added to PATH
		(in /etc/profile)

	* Before Step 4, Docker Engine should be installed in the system
