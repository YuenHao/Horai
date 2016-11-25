package com.github.horai.startup.jobtracker;

import com.github.horai.core.commons.utils.StringUtils;
import com.github.horai.core.exception.CfgException;

import java.io.*;
import java.util.Properties;

/**
 * Created by yh on 2016/11/24.
 * jobtrackercfg加载类
 */
public class JobTrackerCfgLoader {

    public static JobTrackerCfg load(String confPath) throws CfgException {

        String cfgPath = confPath + "/jobtracker.cfg";
        String log4jPath = confPath + "jobtrackerLog.cfg";

        Properties conf = new Properties();
        File file = new File(cfgPath);
        InputStream is = null;

        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conf.load(is);
        } catch (IOException e) {
            throw new CfgException("can't found = " + cfgPath);
        }

        JobTrackerCfg jobCfg = new JobTrackerCfg();
        String registryAddress = conf.getProperty("registryAddress");
        if (StringUtils.isEmpty(registryAddress)) {
            throw new CfgException("registryAddress can't be null");
        }
        return jobCfg;

    }
}
