package com.github.horai.core.cluster;

import com.github.horai.core.AppContext;
import com.github.horai.core.cluster.registry.Registry;
import com.github.horai.core.logger.Logger;
import com.github.horai.core.logger.LoggerFactory;
import com.github.horai.core.support.AliveKeeping;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by yh on 2016/12/6.
 * 抽象horai节点
 */
public abstract class AbstractHoraiNode<T extends HoraiNodeConfig,
        C extends AppContext> implements HoraiNode {

    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractHoraiNode.class);

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
    final public void start() {

        try {
            if (started.compareAndSet(false, true)) {

                // TODO: 2016/12/8 验证配置项

                // TODO: 2016/12/8 初始化配置

                initHttpServer();

                remotingStart();

                // TODO: 2016/12/8 初始化注册中心

                AliveKeeping.start();

                LOGGER.info("start success!");

            }
        } catch (Throwable e) {
            LOGGER.error("start failed . " + e.toString());
        }


    }

    /**
     * 初始化HTTP端口
     */
    private void initHttpServer() {
        int port = appContext.getConfig().getHttpPort();
    }

    /**
     * 初始化NIO端口
     */
    protected abstract void remotingStart();

    @Override
    final public void stop() {

    }
}
