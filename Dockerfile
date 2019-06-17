FROM abrtech/alpine-oraclejdk8
VOLUME /tmp
ADD target/search-1.0.jar search.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/search.jar"]