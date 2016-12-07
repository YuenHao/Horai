package com.github.horai.tasktracker.runner;

import com.github.horai.tasktracker.network.info.TaskResponse;

/**
 * Created by yh on 2016/11/30.
 * 任务执行完成后的操作。
 * 主要逻辑是向jobtracker发送信息，然后再从jobtracker获取新任务，可以复用线程。
 * 若Jobtracker未返回任务信息，则线程结束。
 */
public interface TaskRunnerCallBack {

    /**
     * 任务完成执行操作
     * @param response tasktracker向jobtracker返回的任务信息
     * @return jobtracker收到任务信息并返回新任务，若返回值未null，
     * 则线程结束。
     */
    public Task runComplete(TaskResponse taskResponse);
}
