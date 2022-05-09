# Deploy "Hello World"

### Run Docker
1. docker build --tag=message-server:latest .
2. docker run -e SPRING_PROFILES_ACTIVE=local -p 8087:8080 message-server:latest