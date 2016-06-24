package com.fengyu.common.exception.MapperSupport;

/**
 * Created by admin on 2016/6/24.
 */
public abstract class AbstractException extends RuntimeException{

    public AbstractException(Throwable ex){
        super(ex);
    }

    public abstract String getExceptionType();
}
