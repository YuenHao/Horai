package com.github.horai.tasktracker.runner;

/**
 * Created by yh on 2016/11/30.
 * 任务执行的接口
 */
public interface TaskRunner {

    TaskResult run(TaskContext taskContext);
}
