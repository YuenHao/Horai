package com.github.horai.core.logger;

import com.github.horai.core.constant.HoraiExtConfig;
import com.github.horai.core.spi.SPI;

/**
 * Created by yWX377796 on 2016/12/5.
 * 日志输出器？
 */
@SPI(key = HoraiExtConfig.HORAI_LOGGER, defValue = "slf4j")
public interface LoggerAdapter {

    /**
     * 获取日志输出器
     * @param key 分类键的类
     * @return 日志输出器，
     */
    Logger getLogger(Class<?> key);

    /**
     * 获取日志输出器,可自定义
     * @param key 分类键的类
     * @return 日志输出器，
     */
    Logger getLogger(String key);
}
