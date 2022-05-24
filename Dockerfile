FROM maven:3.8.5-openjdk-18 AS MAVEN_BUILD
WORKDIR /build
COPY pom.xml /build/
COPY src /build/src
RUN mvn clean package

#Run Stage
FROM openjdk:18
COPY --from=MAVEN_BUILD build/target/*.jar *.jar
EXPOSE 8080
CMD ["java", "-jar", "*.jar"]