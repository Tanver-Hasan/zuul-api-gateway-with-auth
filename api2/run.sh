# Optimized builds
DOCKER_BUILDKIT=1 docker build -t example/api2 -f Dockerfile.production .
docker run  -p 3012:3012 -it --rm example/api2

# Gradle Build 
# docker build -t example/api2 .
# docker run -p 3012:3012 -it example/api2