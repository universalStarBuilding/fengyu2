package com.fengyu.modules.webservice.project;


import com.fengyu.common.persistence.AuthenticationResult;
import com.fengyu.common.security.JwtUtil;
import com.fengyu.common.session.VirtualSession;
import com.fengyu.common.session.VirtualSessionManager;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.model.User;
import com.fengyu.modules.service.user.UserService;
import org.glassfish.jersey.server.mvc.Viewable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Component
@Path("/project")
public class ProjectController {


    /**
     *发起项目
     * @param user
     * @return
     */
    @POST
    @Path("publish")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String publish(User user)
    {
        return null;
    }



}
