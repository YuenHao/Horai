# Horai
一个简单的，可以实现多任务，简单依赖的调度系统。

horai
    horai-core
        core    业务处理中心，具体业务逻辑可以抽取的方法全部放在这里
            node
            exception   异常中心
        register    注册中心
            zookeeper   zk注册中心
            redis       redis注册中心
        alarm       通知中心
            email       邮件通知
            SMS         短信通知
            horaiInfo   自定义通知，可以放置在数据库，可以放置在内存等待别人通过接口调用。
        DB  数据中心
            kv      nosql数据中心
            RDB     关系型数据中心
        monitor     监控中心
            JVMmonitor  jvm相关监控
            nodeMonitor 节点监控
        remoting 网络交互
            NIO     NIO中心
                netty   netty网络交互
                horaiNIO 自定义NIO
            BIO     阻塞IO中心
                http    http协议交互
        queue  队列
            horai-queue 自定义环，实现分布式
        fileSystem  文件系统
            LFS         本地文件系统
            HDFS        HDFS文件系统（Hadoop文件系统）
        logger  日志中心
            log4j   log4j日志
            slf4j   slf4j日志
            jdklogger   默认日志
        json    所有网络通信格式统一用json
            fastjson
            jackson
            horaijson   自定义json解析
        appContext 全局参数

    horai-startup   程序管理模块（启动，停止等）
        jobtracker  jobtracker管理
        tasktracker tasktracker管理
    horai-jobtracker

    horai-tasktracker