docker kill $(docker ps -a -q)
docker-compose up -d --remove-orphans