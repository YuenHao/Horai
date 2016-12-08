package com.github.horai.core.cluster;

import java.io.Serializable;

/**
 * Created by yh on 2016/12/6.
 * HoraiNode的属性 （PPE ：properties）
 */
public abstract class HoraiNodeConfig implements Serializable {

    private static final long serialVersionUID = -7508526381893921975L;
    // 节点是否可用
    private boolean avaiable = true;
    // 节点名称
    private String clusterName;
    // http监听端口
    private int httpPort;
    // NIO监听端口
    private int nioPort;
    // TODO: 2016/12/6 补充节点信息


    public boolean isAvaiable() {
        return avaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public int getNioPort() {
        return nioPort;
    }

    public void setNioPort(int nioPort) {
        this.nioPort = nioPort;
    }
}
