package com.github.horai.core.cluster;

/**
 * Created by yh on 2016/12/6.
 * horai系统的运行节点接口。
 */
public interface HoraiNode {

    /**
     * 启动节点
     */
    void start();

    /**
     * 停止节点
     */
    void stop();

}
