package com.fengyu.common.exception.MapperSupport;

import com.fengyu.common.exception.MapperSupport.Constant.PersistenceExceptionType;

/**
 * Created by admin on 2016/6/24.
 */
public abstract class AbstractException extends RuntimeException{


    public AbstractException(Throwable ex){
        super(ex);
    }

    public abstract String getExceptionType();
    public abstract PersistenceExceptionType getUserDefindExType();

}
