package com.github.horai.core.exception;

/**
 * Created by yh on 2016/11/24.
 * 配置文件异常.
 */
public class CfgException extends Exception {


    public CfgException() {
        super();
    }

    public CfgException(String message) {
        super(message);
    }

    public CfgException(String message, Throwable cause) {
        super(message, cause);
    }

    public CfgException(Throwable cause) {
        super(cause);
    }

    /**
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     * @since 1.7
     */
    protected CfgException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
