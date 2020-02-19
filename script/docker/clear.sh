#!/bin/bash

cd $(dirname $0)

docker rmi foo-service bar-service eureka-sample sc-gateway-sample
