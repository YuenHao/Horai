package com.github.horai.core.logger;

/**
 * Created by yWX377796 on 2016/12/5.
 * 日志工厂
 */
public class LoggerFactory {

    private LoggerFactory() {}

    private static volatile LoggerAdapter LOGGER_ADAPTER;

    public static Logger getLogger(Class<?> clazz) {
        return null;
    }
}

