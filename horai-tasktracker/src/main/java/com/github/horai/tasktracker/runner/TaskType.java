package com.github.horai.tasktracker.runner;

/**
 * Created by yh on 2016/11/30.
 * 任务类型
 */
public enum TaskType {
    SHELL,// shell任务
    URL,//URl任务
    SQL,//SQL任务
    JAR,//JAR包
    HIVE,//hive任务
    SPARK_SQL,//spark_sql任务
    MAPREDUCE //mapreduce任务
}
