# Swagger Aggregation Sample

> Swagger 文档聚合示例工程

## Spring Cloud Gateway

确保以下端口未被占用：`18080, 18081, 18082, 18090, 18091 `

1. 启动 `eureka`（http://localhost:127.0.0.1:18080）
2. 启动 `foo-service`（http://localhost:127.0.0.1:18081）
3. 启动 `bar-service`（http://localhost:127.0.0.1:18082）
4. 启动 `sc-gateway-sample`（http://localhost:127.0.0.1:18090）

通过网关查看各服务 swagger 文档

    $ open localhost:127.0.0.1:18090/swagger-ui.html
