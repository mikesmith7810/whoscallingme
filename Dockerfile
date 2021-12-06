FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE1
ARG JAR_FILE2
COPY ${JAR_FILE1} app.jar
COPY ${JAR_FILE2} app2.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8888/udp
EXPOSE 8888/tcp