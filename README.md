# spring-boot-ai-ollama

[![Java CI with Gradle](https://github.com/hendisantika/spring-boot-ai-ollama/actions/workflows/gradle.yml/badge.svg)](https://github.com/hendisantika/spring-boot-ai-ollama/actions/workflows/gradle.yml)

A simple Spring Boot REST API that sends prompts to a local LLM through [Ollama](https://ollama.com) using [Spring AI](https://spring.io/projects/spring-ai).

### Tech stack

- Java 25
- Spring Boot 4.1.1
- Spring AI 2.0.1 (`spring-ai-starter-model-ollama`)
- Gradle 9.8.1 (wrapper included)
- Ollama with the `llama3.2:3b` model

### Things todo list

1. Install JDK 25 (e.g. [Temurin](https://adoptium.net/temurin/releases/?version=25)).
2. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-ai-ollama.git`
3. Navigate to the folder: `cd spring-boot-ai-ollama`
4. Download Ollama App based on your OS here: https://ollama.com/download
5. Pull and run the model: `ollama run llama3.2:3b`
6. Exit the Ollama prompt with `/bye` (the Ollama server keeps running in the background on `http://localhost:11434`).
7. Run the application: `./gradlew clean bootRun`
8. Open your favorite browser: http://localhost:8080/ask?prompt=Spring%20Boot%204

   Or use curl:

   ```shell
   curl "http://localhost:8080/ask?prompt=What%20is%20Spring%20AI%3F"
   ```

### Configuration

`src/main/resources/application.properties`:

```properties
spring.application.name=spring-boot-ai-ollama
spring.ai.ollama.chat.options.model=llama3.2:3b
```

To use another model, pull it with Ollama (`ollama pull <model>`) and change `spring.ai.ollama.chat.options.model`.
If Ollama is not running on the default address, set `spring.ai.ollama.base-url`.

### Build & test

```shell
./gradlew build
```

The GitHub Actions workflow (`.github/workflows/gradle.yml`) builds and tests the project on JDK 25 (Temurin) for every push and pull request to `main`.
