
**Build and Run Image**

docker build --build-arg "JAR_FILE1=target/hackathon-0.0.1-SNAPSHOT.jar" -t hackathon:first .

docker run --name hackathon --rm -p 8888:8888 hackathon:first

