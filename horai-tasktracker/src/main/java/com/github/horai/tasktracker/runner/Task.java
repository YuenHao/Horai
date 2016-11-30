package com.github.horai.tasktracker.runner;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yh on 2016/11/30.
 * 任务提交至tasktracker的信息
 */
public abstract class Task implements Serializable{

    //任务唯一标示
    private String taskId;
    //节点类型
    private TaskType taskType;
    //最大重试次数
    private int maxRetryTimes = 0;
    //以重试次数
    private int retryTimes;
    //执行节点组
    private String taskTrackerNodeGroup;
    //已经执行过的节点
    private List<String> execNodeList;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public int getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(int maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public int getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(int retryTimes) {
        this.retryTimes = retryTimes;
    }

    public String getTaskTrackerNodeGroup() {
        return taskTrackerNodeGroup;
    }

    public void setTaskTrackerNodeGroup(String taskTrackerNodeGroup) {
        this.taskTrackerNodeGroup = taskTrackerNodeGroup;
    }

    public List<String> getExecNodeList() {
        return execNodeList;
    }

    public void setExecNodeList(List<String> execNodeList) {
        this.execNodeList = execNodeList;
    }
}
