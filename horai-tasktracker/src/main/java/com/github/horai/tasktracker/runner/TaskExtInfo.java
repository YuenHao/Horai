package com.github.horai.tasktracker.runner;

/**
 * Created by yh on 2016/11/30.
 * 额外的任务信息，一般为tasktracker信息或在tasktracker上生成的信息
 */
public class TaskExtInfo {

    // 任务在本节点已经重复的次数
    private int retryTimes = 0;

    // 任务执行日志存放地址
    private String taskLoaPath;

    // 任务日志最大长度

    private int logSize;

    public int getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(int retryTimes) {
        this.retryTimes = retryTimes;
    }

    public String getTaskLoaPath() {
        return taskLoaPath;
    }

    public void setTaskLoaPath(String taskLoaPath) {
        this.taskLoaPath = taskLoaPath;
    }

    public int getLogSize() {
        return logSize;
    }

    public void setLogSize(int logSize) {
        this.logSize = logSize;
    }
}
