# List of practiced topics

## Configuration
1. Visit [Spring Initializr](https://start.spring.io/)
2. Add dependencies
   - Spring Web: Spring MVC + embedded Tomcat.
   - Spring Boot DevTools: support automatic reloading app when making changes.
   - Spring Boot Actuator: support built in (or custom) endpoints that let you monitor and manage app
3. Download file and unzip
4. Import existing Maven project

---

## Concepts
- *__@SpringBootApplication__*, *```scanBasePackages```*
#### Spring Boot Actuator
- Built-in endpoints 
[[URL](https://docs.spring.io/spring-boot/docs/1.5.x/reference/html/production-ready-endpoints.html)]
  - ```/actuator/health```
  - ```/actuator/info```
- Only /health and /infog are exposed by default
- Update ```application.properties``` to customize ```/info``` endpoint  
- Add ```management.endpoints.web.exposure.include/exclude``` to expose/exclude endpoints 
[[application.properties](https://github.com/cpulover-practice/spring-boot/blob/master/src/main/resources/application.properties)]
- Add Spring Security to secure REST endpoints (except ```/info``` and ```/health```). Defaut account:
  - Username: user
  - Password: generated security password in the console

---

## Project Structure
1. Maven Wrapper files: ```mvnw```, ```mvnw.cmd```
2. Application properties file
3. ```/templates``` directory
4. ```/static``` directory

---

## Notes/Tips
- Place main app class in the root package above other packages.
- Run Spring Boot app as Java app instead of on server, because the server is already embedded inside the app.
- Inject values from application.properties file with *__@Value__* 
[[FunRestController](https://github.com/cpulover-practice/spring-boot/blob/master/src/main/java/com/cpulover/springboot/rest/FunRestController.java)]
- Do not use ```src/main/webapp``` directory if the app is packaged as a JAR
- Override Java version in POM file
- List of common properties 
[[URL](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#common-application-properties)]



