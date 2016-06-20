FROM ubuntu:latest

MAINTAINER  tanm

RUN apt-get update

RUN apt-get install default-jre -y

RUN apt-get install default-jdk -y

RUN apt-get install maven -y

ADD pom.xml /app/

ADD src/ /app/src/

WORKDIR /app/

RUN mvn package

EXPOSE  8080

CMD ["java","-jar","target/demo-0.0.1-SNAPSHOT.jar"]
