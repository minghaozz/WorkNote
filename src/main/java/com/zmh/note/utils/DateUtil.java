package com.zmh.note.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 张铭浩
 * @since 2019/8/22 16:10
 */
public class DateUtil {
  public static String format(String d) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = simpleDateFormat.parse(d);
    String s = simpleDateFormat.format(date);
    return s;
  }
}
