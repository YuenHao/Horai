package com.github.horai.tasktracker.runner;

/**
 * Created by yh on 2016/11/30.
 * task的状态。
 */
public enum TaskState {
    EXECUTE_SUCCESS,    // 执行成功,这种情况 直接反馈客户端
    EXECUTE_FAILED,     // 执行失败,这种情况,直接反馈给客户端,不重新执行
    EXECUTE_LATER,      // 稍后重新执行,这种情况, 不反馈客户端,稍后重新执行,不过有最大重试次数
    EXECUTE_EXCEPTION,  // 执行异常, 这中情况也会重试
    EXECUTE_KILL        //任务被kill
}
