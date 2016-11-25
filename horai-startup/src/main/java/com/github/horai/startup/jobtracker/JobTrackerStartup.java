package com.github.horai.startup.jobtracker;

/**
 * Created by yh on 2016/11/24.
 * JobTracker 启动类
 */
public class JobTrackerStartup {

    public static void main(String[] args) {
        try {

            String confPath = args[0];
            JobTrackerCfg jobCfg = JobTrackerCfgLoader.load(confPath);

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
