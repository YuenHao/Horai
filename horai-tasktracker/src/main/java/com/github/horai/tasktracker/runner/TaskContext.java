package com.github.horai.tasktracker.runner;

/**
 * Created by yh on 2016/11/30.
 * jobtracker传递的任务的信息及节点信息（和任务执行有关的）。
 */
public class TaskContext {

    //任务信息
    private Task task;
    //task包含的额外的任务信息
    private TaskExtInfo taskExtInfo;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskExtInfo getTaskExtInfo() {
        return taskExtInfo;
    }

    public void setTaskExtInfo(TaskExtInfo taskExtInfo) {
        this.taskExtInfo = taskExtInfo;
    }
}
