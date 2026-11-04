FROM eclipse-temurin:21-jre
ADD target/AnalyseProject-0.0.1-SNAPSHOT.jar AnalyseProject-0.0.1-SNAPSHOT.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "AnalyseProject-0.0.1-SNAPSHOT.jar"]
