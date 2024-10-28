# Stage 1: Build
FROM openjdk:24-bullseye as build

# Install necessary tools
RUN apt-get update && apt-get install -y vim wget && rm -rf /var/lib/apt/lists/*

# Stage 2: Final Image
FROM dinokeke/spring-docker:0.0.1

# Copy Java from the build stage
COPY --from=build /usr/local/openjdk-24 /usr/local/openjdk-24

# Set JAVA_HOME environment variable
ENV JAVA_HOME=/usr/local/openjdk-24
ENV PATH="$JAVA_HOME/bin:$PATH"

EXPOSE 3000

ENTRYPOINT ["java", "org.springframework.boot.devtools.RemoteSpringApplication"]

