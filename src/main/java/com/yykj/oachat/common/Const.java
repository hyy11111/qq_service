package com.yykj.oachat.common;

/**
 * Created by hyy on 2017/11/27.
 * @author hyy
 */
public class Const {

    public interface Status{
        int SUCCESS = 1;
        int FAILED = 0;
    }

    public interface StatusDetail{
        String SUCCESS_DETAIL = "操作成功！";
        String FAILED_DETAIL = "操作失败！";
    }

    public interface Sign{
        int REQUEST = 1;
        int RESPONSE = 2;
        int NOTICE = 3;
    }

    public static final int PORT = 52621;
}
