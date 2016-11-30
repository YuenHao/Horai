package com.github.horai.tasktracker.runner;

/**
 * Created by yh on 2016/11/30.
 * task的返回结果
 */
public class TaskResult {

    //task状态
    private TaskState taskState;
    //任务返回信息
    private String msg;
    //任务日志
    private String logPath;

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }
}
