package com.github.horai.tasktracker.runner;

import com.github.horai.tasktracker.TaskTrackerContext;

import java.util.concurrent.atomic.AtomicBoolean;

import static com.github.horai.tasktracker.runner.TaskState.*;

/**
 * Created by yh on 2016/11/30.
 * taskrunner的代理
 */
public class TaskRunnerAgent implements Runnable {
    // taskrunner实现类
    private TaskRunner taskRunner;
    // 节点数据
    private TaskTrackerContext taskTrackerContext;
    // 任务被终止标志
    private AtomicBoolean interrupted = new AtomicBoolean();
    // 任务信息
    private TaskContext taskContext;
    //任务完成后执行函数。
    private TaskRunnerCallBack taskRunnerCallBack;

    private static TaskContext convertContext2TaskContext(
            TaskTrackerContext taskTrackerContext,
            Task task) {
        TaskContext taskContext = new TaskContext();
        TaskExtInfo taskExtInfo = new TaskExtInfo();
        // TODO: 2016/12/6  转换逻辑


        taskContext.setTask(task);
        return taskContext;
    }

    public TaskRunnerAgent(TaskTrackerContext taskTrackerContext,
                      Task task, TaskRunnerCallBack taskrunnerCallBack) {
        this.taskTrackerContext = taskTrackerContext;
        this.taskContext = convertContext2TaskContext(taskTrackerContext, task);
    }

    @Override
    public void run() {
        TaskResult taskResult = taskRunner.run(taskContext);

        switch (taskResult.getTaskState()) {
            case EXECUTE_SUCCESS:
                // TODO: 2016/12/6 任务成功处理逻辑
                break;
            case EXECUTE_FAILED:
                // TODO: 2016/12/6 任务失败处理逻辑
                break;
            case EXECUTE_LATER:
                // TODO: 2016/12/6 任务重试处理逻辑
                break;
            case EXECUTE_EXCEPTION:
                // TODO: 2016/12/6 任务异常处理逻辑
                break;
            case EXECUTE_KILL:
                // // TODO: 2016/12/6 任务被终止处理逻辑
                break;
            default:
                // TODO: 2016/12/6 其它情况处理逻辑
                break;
        }
    }
}
