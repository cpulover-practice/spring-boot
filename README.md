# List of practiced topics

## Configuration
1. Visit [Spring Initializr](https://start.spring.io/)
2. Add dependencies
3. Download file and unzip
4. Import existing Maven project

---

## Dependencies
### Spring Web 
- Description: Spring MVC (including Spring REST) + embedded Tomcat
- Bind path variable to request method parameter: @PathVariable vs @RequestParam 
[[DemoRestController]()]

### Spring Boot DevTools 
- Description: supports automatic reloading app when making changes.

### Spring Boot Actuator
- Description: supporta built in (or custom) endpoints to monitor and manage app
- Built-in endpoints 
[[URL](https://docs.spring.io/spring-boot/docs/1.5.x/reference/html/production-ready-endpoints.html)]
  - ```/actuator/health```
  - ```/actuator/info```
- Only ```/health``` and ```/info``` are exposed by default
- Update ```application.properties``` to customize ```/info``` endpoint  
- Add ```management.endpoints.web.exposure.include/exclude``` to expose/exclude endpoints 
[[application.properties](https://github.com/cpulover-practice/spring-boot/blob/master/src/main/resources/application.properties)]

### Lombok

### Spring Data JPA

### REST Repository (Spring Data REST)

### Spring Security
- Automaticaly secure REST endpoints (except ```actuator/info``` and ```actuator/health```). 
- Defaut account:
  - Username: user
  - Password: generated security password in the console
- Disable security: ```@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })```

---

## Project Structure
- Maven Wrapper files: ```mvnw```, ```mvnw.cmd```
- Application properties file
- ```/templates``` directory
- ```/static``` directory

---

## Notes
- *__@SpringBootApplication__* 
- *```scanBasePackages```*
- Place main app class in the root package above other packages.
- Run Spring Boot app as Java app instead of on server, because the server is already embedded inside the app.
- Inject values from application.properties file with *__@Value__* 
[[FunRestController](https://github.com/cpulover-practice/spring-boot/blob/master/src/main/java/com/cpulover/springboot/rest/FunRestController.java)]
- Do not use ```src/main/webapp``` directory if the app is packaged as a JAR
- Override Java version in POM file
- List of common properties 
[[URL](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#common-application-properties)]



