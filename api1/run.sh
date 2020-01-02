# Optimized builds
DOCKER_BUILDKIT=1 docker build -t example/api1 -f Dockerfile.production .
docker run  -p 3011:3011 -it --rm example/api1

# Gradle Build 
# docker build -t example/api1 .
# docker run -p 3011:3011 -it example/api1

