Maven Jetty plugin + logback
===

Simplest web app application for logging with log back

To create war file

```
mvn clean package
```

To run the application

```
mvn jetty:run -Dlogback.configurationFile=file:///Users/massimo/.bva/config/logback.xml
```


Call the following servlet to see log

```
http://localhost:8080/webapp-2.5/time
```


