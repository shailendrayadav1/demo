# Just for demo purposes obviously
# FROM httpd:2.4-alpine
# COPY ./index.html /usr/local/apache2/htdocs/

FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 80
ADD demo-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]