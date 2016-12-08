package com.github.horai.core;

import com.github.horai.core.cluster.HoraiNodeConfig;

/**
 * Created by yh on 2016/11/21.
 * 中文:应用的全局上下文信息，抽象类
 * English:AppContext
 */
public abstract class AppContext {

    // 节点配置信息
    private HoraiNodeConfig config;

    public HoraiNodeConfig getConfig() {
        return config;
    }

    public void setConfig(HoraiNodeConfig config) {
        this.config = config;
    }
}
