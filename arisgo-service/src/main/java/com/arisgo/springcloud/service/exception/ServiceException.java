package com.arisgo.springcloud.service.exception;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-22 22:30
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -308961887015474198L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
