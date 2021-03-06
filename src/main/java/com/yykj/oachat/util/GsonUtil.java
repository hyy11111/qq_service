package com.yykj.oachat.util;

import com.google.gson.Gson;

/**
 * @author hyy
 * @date 2017/11/30
 */
public class GsonUtil {

    public static class GsonHolder{
        private static final Gson INSTANCE = new Gson();
    }

    public static Gson getInstance(){
        return GsonHolder.INSTANCE;
    }
}
