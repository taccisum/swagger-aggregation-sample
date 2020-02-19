# Swagger Aggregation Sample

> Swagger 文档聚合示例工程

## Spring Cloud Gateway

### 进程启动

确保以下端口未被占用：`8080, 8081, 8082, 8761, 18080, 18081, 18082, 18761`

1. 启动 `eureka`（http://localhost:127.0.0.1:8761）
2. 启动 `foo-service`（http://localhost:127.0.0.1:8080）
3. 启动 `bar-service`（http://localhost:127.0.0.1:8081）
4. 启动 `sc-gateway-sample`（http://localhost:127.0.0.1:8082）

通过网关查看各服务 swagger 文档

    $ open localhost:127.0.0.1:8082/swagger-ui.html

### Docker 启动

    $ sh script/docker/start.sh

通过网关查看各服务 swagger 文档

    $ open localhost:127.0.0.1:8082/swagger-ui.html

停止相关容器

    $ sh script/docker/stop.sh

清理相关镜像

    $ sh script/docker/clear.sh
