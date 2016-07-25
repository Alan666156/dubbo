
spring boot + dubbo + zookeeper

Zookeeper作为Dubbo服务的注册中心，Dubbo原先基于数据库的注册中心，没采用Zookeeper，Zookeeper一个分布式的服务框架，是树型的目录服务的数据存储，能做到集群管理数据 ，这里能很好的作为Dubbo服务的注册中心，Dubbo能与Zookeeper做到集群部署，当提供者出现断电等异常停机时，Zookeeper注册中心能自动删除提供者信息，当提供者重启时，能自动恢复注册数据，以及订阅请求。

模块说明：

dubbo-provider 模块暴露服务的服务提供方
dubbo-consumer 模块为调用远程服务的消费者
dubbo-service  模块中声明需要暴露的服务接口(可将该模块使用maven打包后，以sdk的方式提供给需要接入的消费者使用)

