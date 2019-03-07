---
title: Redis 安装
date: 2019-03-06
---

# Redis 安装

<!-- TOC depthFrom:2 depthTo:3 -->

- [安装](#安装)
- [启动](#启动)
- [脚本](#脚本)

<!-- /TOC -->

## 安装

安装步骤如下：

（1）下载并解压到本地

进入官网下载地址：https://redis.io/download ，选择合适的版本下载。

我选择的是最新稳定版本 4.0.8：http://download.redis.io/releases/redis-4.0.8.tar.gz

我个人喜欢存放在：`/opt/redis`

```
wget -O /opt/redis/redis-4.0.8.tar.gz http://download.redis.io/releases/redis-4.0.8.tar.gz
cd /opt/redis
tar zxvf redis-4.0.8.tar.gz
```

（2）编译安装

执行以下命令：

```
cd /opt/redis/redis-4.0.8
make
```

## 启动

**启动 redis 服务**

```
cd /opt/redis/redis-4.0.8/src
./redis-server
```

**启动 redis 客户端**

```
cd /opt/redis/redis-4.0.8/src
./redis-cli
```

## 脚本

以上两种安装方式，我都写了脚本去执行：

| [安装脚本](https://github.com/dunwu/linux/tree/master/codes/deploy/tool/redis) |
