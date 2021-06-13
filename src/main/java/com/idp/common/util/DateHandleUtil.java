package com.idp.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandleUtil {
    /**
     * 获取当前时间
     * @return
     */
    public static String getNowDate(){
        String temp_str="";
        Date dt = new Date();
        //最后的aa表示“上午”或“下午”    HH表示24小时制    如果换成hh表示12小时制
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        temp_str=sdf.format(dt);
        return temp_str;
    }

    public static void main(String[] args) {
        System.out.println(getNowDate());
    }
}
