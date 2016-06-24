package com.fengyu.common.exception.MapperSupport;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by admin on 2016/6/24.
 */
@Provider
public class ExceptionMapperSupport implements ExceptionMapper<Throwable>{


    @Override
    public Response toResponse(Throwable exception) {
        exception.printStackTrace();
        return Response.status(500).entity(exception).type("application/json").build();
    }
}
