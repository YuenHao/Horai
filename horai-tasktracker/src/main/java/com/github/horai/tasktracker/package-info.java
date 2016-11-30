/**
 * Created by yh on 2016/11/30.
 * tasktracker是任务具体执行的节点。
 * 主要任务是执行任务。
 * 功能有接受任务，执行任务，终止任务，重试任务，判断任务状态，与jobtracker保持心跳等，更新zk状态等。
 */
package com.github.horai.tasktracker;