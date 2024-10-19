FROM openjdk:17-jdk
COPY . /opt
WORKDIR /opt
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "./target/full-stack-java-0.0.1-SNAPSHOT.jar"]