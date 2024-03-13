FROM openjdk:17

EXPOSE 8080

COPY ./target/aws-demo.jar aws-demo.jar

ENTRYPOINT ["java", "-jar","aws-demo.jar"]