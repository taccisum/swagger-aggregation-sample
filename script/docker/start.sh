#!/bin/bash

cd $(dirname $0)

cd ../../

mvn clean package -DskipTests

if [[ $? -eq 0 ]];then
    cd -
    docker-compose up -d
fi

