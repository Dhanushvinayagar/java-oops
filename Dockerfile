FROM eclipse-temurin:25

WORKDIR /app

COPY . .

# RUN javac src/*.java
RUN find src -name "*.java" | xargs javac

CMD ["java", "-cp", "src", "Main"]

# docker build --no-cache -t my-java-app .
# docker run my-java-app