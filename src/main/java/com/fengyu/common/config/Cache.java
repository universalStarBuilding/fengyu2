package com.fengyu.common.config;

/**
 * Created by admin on 2016/6/23.
 */
public class Cache {

    private static String imgCodeCache;      //图形验证码
    private static String phoneCodeCache;    //手机验证码

    public static String getImgCodeCache() {
        return imgCodeCache;
    }

    public static void setImgCodeCache(String imgCodeCache) {
        Cache.imgCodeCache = imgCodeCache;
    }

    public static String getPhoneCodeCache() {
        return phoneCodeCache;
    }

    public static void setPhoneCodeCache(String phoneCodeCache) {
        Cache.phoneCodeCache = phoneCodeCache;
    }
}
