package com.fengyu.modules.webservice.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.model.AccBasic;
import com.fengyu.modules.service.account.AccBasicService;
import org.apache.commons.io.FileUtils;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.server.mvc.Viewable;
import org.omg.CORBA.portable.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by guozheng on 2016/6/23.
 */
@Component
@Path("/common")
public class UploadController {
    /**
     * Constants operating with images
     */
    private static final String ARTICLE_IMAGES_PATH = "c:/upload/";

    /**
     * 第一种方式上传
     *
     * @param fileInputStream
     * @param disposition
     * @return
     */
    @POST
    @Path("uploadimage")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String uploadimage1(@FormDataParam("file") java.io.InputStream fileInputStream,
                               @FormDataParam("file") FormDataContentDisposition disposition) {
        String imageName = Calendar.getInstance().getTimeInMillis()
                + disposition.getFileName();

        File file = new File(ARTICLE_IMAGES_PATH + imageName);
        try {
            //使用common io的文件写入操作
            FileUtils.copyInputStreamToFile(fileInputStream, file);
            //原来自己的文件写入操作
            //saveFile(fileInputStream, file);
        } catch (IOException ex) {
         //   Logger.getLogger(UploadImageResource.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
