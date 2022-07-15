package com.cpy.userdboperation.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*
* 工具类
*
* */
public class DateTool {

    /*
    * 日期封装
    * */
    public static Date specificationDate(String date) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
        return sf.parse(date);

    }
}
