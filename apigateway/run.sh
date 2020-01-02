# Optimized builds
DOCKER_BUILDKIT=1 docker build -t example/apigateway -f Dockerfile.production .
docker run  -p 3005:3005 -it --rm example/apigateway

# Gradle Build 
# docker build -t example/apigateway .
# docker run -p 3005:3005 -it example/apigateway