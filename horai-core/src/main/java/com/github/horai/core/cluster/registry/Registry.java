package com.github.horai.core.cluster.registry;

import com.github.horai.core.cluster.AbstractHoraiNodePPE;
import com.github.horai.core.cluster.HoraiNode;

/**
 * Created by yh on 2016/12/8.
 * 节点注册接口
 */
public interface Registry<T extends AbstractHoraiNodePPE> {

    /**
     * 节点注册
     * @param nodePPE
     * @return
     */
    boolean register(T nodePPE);

    /**
     * 取消节点注册
     * @param nodePPE
     * @return
     */
    boolean unregister(T nodePPE);

    /**
     * 监听节点
     * @param nodePPE
     * @return
     */
    boolean subscribe(T nodePPE);

    /**
     * 取消监听节点
     * @param nodePPE
     * @return
     */
    boolean unsubscribe(T nodePPE);
}
