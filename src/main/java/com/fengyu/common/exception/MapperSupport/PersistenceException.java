package com.fengyu.common.exception.MapperSupport;

import com.fengyu.common.exception.MapperSupport.Constant.PersistenceExceptionType;

/**
 * Created by admin on 2016/6/24.
 */
public class PersistenceException extends AbstractException {

    private PersistenceExceptionType type;
    private Object data;

    public PersistenceException(Throwable ex,PersistenceExceptionType type,Object data){
        super(ex);
        this.type = type;
        this.data = data;
    }

    @Override
    public String getExceptionType() {
        return "PersistenceExceptionType";
    }

    @Override
    public PersistenceExceptionType getUserDefindType() {
        return this.type;
    }

    public PersistenceException(PersistenceExceptionType type,Object data){
        this(null,type,data);
    }

    public  Object getData(){
        return  data;
    }
}
