package com.fengyu.modules.webservice.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fengyu.common.config.Global;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
    private static final String ARTICLE_IMAGES_PATH = Global.getConfig("imagesPath");

    /**
     * 图片上传
     *
     * @param fileInputStream
     * @param disposition
     * @return
     */
    @POST
    @Path("uploadimage/{type}")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String uploadimage1(
                                @PathParam("type") String type,
                                @FormDataParam("file") java.io.InputStream fileInputStream,
                               @FormDataParam("file") FormDataContentDisposition disposition) {
        String imageName = Calendar.getInstance().getTimeInMillis()
                + disposition.getFileName();

        Date dt=new Date();
        SimpleDateFormat matter1=new SimpleDateFormat("yyyyMMdd");

        File file = new File(ARTICLE_IMAGES_PATH +type +"/"+ matter1.format(dt)+"/"+imageName);
        try {
            //使用common io的文件写入操作
            FileUtils.copyInputStreamToFile(fileInputStream, file);

        }catch (IOException ex) {
            throw new WebActionException(WebExceptionType.UPLOADINVALIDIMG,imageName);
        }

        return null;
    }

}
