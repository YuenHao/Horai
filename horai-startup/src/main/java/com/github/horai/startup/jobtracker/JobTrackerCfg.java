package com.github.horai.startup.jobtracker;

import java.util.Map;

/**
 * Created by yh on 2016/11/24.
 * JobTracker 配置文件
 * 错误
 */
public class JobTrackerCfg  {

    private String registryAddress;

    private int listenPort;

    private String clusterName;

    private Map<String, String> configs;

    public String getRegistryAddress() {
        return registryAddress;
    }

    public void setRegistryAddress(String registryAddress) {
        this.registryAddress = registryAddress;
    }

    public int getListenPort() {
        return listenPort;
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Map<String, String> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, String> configs) {
        this.configs = configs;
    }
}
