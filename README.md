### Summary

This project is a simple demenostration of micoservice achitectere. It uses API gateway (Netflix Zuul) as the frontdoor for bacend API 

#### Architecture 

#### Generate Gradle wrapper 

```
./gradlew wrapper 
```
#### Gradle Build 

```
./gradlew build   OR gradle build
```
#### Generate executable  Jar file

```
./gradlew bootJar
```
#### Run executable Jar File

```
java -jar build/libs/  PROJEC_TNAME
```

#### Run application 

Navigate to project directory

```
./gradlew clean bootRun
```


#### Clear gradele cache and recompile project

```
rm -rf ~/.gradle/caches/
./gradlew clean build
./gradlew --refresh-dependencies

```