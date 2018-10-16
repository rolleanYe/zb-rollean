package com.rollean.zb.common.util;

import java.util.Date;

/**
 * Created by rollean.
 */
public class DateUtil {
    public static Date addMinutes(Date date, long minutes) {
        return addSeconds(date, minutes * 60L);
    }

    public static Date addSeconds(Date date1, long secs) {
        return new Date(date1.getTime() + secs * 1000L);
    }


}
