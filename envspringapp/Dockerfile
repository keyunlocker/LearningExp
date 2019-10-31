FROM openjdk:8-jre-alpine
#Port the container listens on
EXPOSE 8081
COPY target/envspringapp-v1.jar /envspringapp-v1.jar
#CMD to be executed when docker is run.
ENTRYPOINT ["java","-jar","envspringapp-v1.jar"]