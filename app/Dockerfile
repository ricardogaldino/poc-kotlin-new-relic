FROM adoptopenjdk:11-jre-hotspot as builder
WORKDIR application
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract


FROM adoptopenjdk:11-jre-hotspot
WORKDIR application
COPY ./newrelic/newrelic.yml .
COPY ./newrelic/newrelic.jar .
COPY --from=builder application/dependencies ./
COPY --from=builder application/spring-boot-loader ./
COPY --from=builder application/snapshot-dependencies/ application/application/ ./
ENTRYPOINT ["java", "-javaagent:newrelic.jar", "-Dnewrelic.environment=$NEW_RELIC_ENV", "-noverify", "-Xmx512m", "-XX:TieredStopAtLevel=1", "-XX:+AlwaysPreTouch", "org.springframework.boot.loader.JarLauncher"]
EXPOSE 8080