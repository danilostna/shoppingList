FROM openjdk:11
LABEL maintainer="danilostna@gamail.com"
VOLUME /main-app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prd", "-jar", "/app.jar"]