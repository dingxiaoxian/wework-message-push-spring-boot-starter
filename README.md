# Response Spring Boot Starter

[maven中央仓库地址](https://search.maven.org/artifact/tech.xiaoxian.wework/wework-message-push-spring-boot-starter)

## 功能描述

本项目支持企业微信信息发送

## 使用方法

### maven

```xml

<dependency>
    <groupId>tech.xiaoxian.wework</groupId>
    <artifactId>wework-message-push-spring-boot-starter</artifactId>
    <version>1.0.0</version>
    <type>pom</type>
</dependency>
```

### gradle

```groovy
implementation 'tech.xiaoxian.wework:wework-message-push-spring-boot-starter:1.0.0'
```

## starter 配置方法

默认情况下，仅需使用包管理工具导入本包即可使用，额外配置包含application.yml配置

```yaml
wework:
  corp-id: 企业微信ID
  agent-id: 企业微信自建应用id
  app_secret: 企业微信自建应用秘钥
  api-url: 默认为企业微信api的地址,可调整为公网代理地址
```
