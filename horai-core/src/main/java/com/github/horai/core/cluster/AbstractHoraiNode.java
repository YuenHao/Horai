package com.github.horai.core.cluster;

import com.github.horai.core.AppContext;
import com.github.horai.core.cluster.registry.HoraiNodeConfig;
import com.github.horai.core.cluster.registry.Registry;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by yh on 2016/12/6.
 * 抽象horai节点
 */
public abstract class AbstractHoraiNode<T extends AbstractHoraiNodePPE,
        C extends AppContext> implements HoraiNode {

    // 注册中心
    protected Registry registry;

    // 节点属性
    protected T nodePPE;

    // 节点配置
    protected HoraiNodeConfig config;

    // 程序运行信息
    protected C appContext;

    // 程序运行状态切换标志
    protected AtomicBoolean started = new AtomicBoolean(false);

    public AbstractHoraiNode() {
        // TODO: 2016/12/6 初始化
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
