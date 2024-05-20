[![Scala CI](https://github.com/alessandrocandolini/shaxl/actions/workflows/ci.yml/badge.svg)](https://github.com/alessandrocandolini/shaxl/actions/workflows/ci.yml)

# shaxl

## Run

To run unit tests
```shell
sbt test
```

To run integration tests
```shell
sbt it/test
```

To run the project through sbt
```shell
sbt run
```

## Build fat jar 

The project uses  [sbt-assembly](https://github.com/sbt/sbt-assembly) to create a "fat" jar
```
sbt assembly
```
The generated jar is `target/shaxl.jar`

The fat jar can be run locally using
```
java -jar target/shaxl.jar
```
