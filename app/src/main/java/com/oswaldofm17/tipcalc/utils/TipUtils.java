package com.oswaldofm17.tipcalc.utils;

import com.oswaldofm17.tipcalc.entity.TipRecord;

import java.text.SimpleDateFormat;

/**
 * Created by oswaldofm on 11/3/16.
 */

public class TipUtils {

    public static double getTip(TipRecord tipRecord) {
        return tipRecord.getBill() * (tipRecord.getTipPercentage()/100d);
    }

    public static String getDateFormated(TipRecord tipRecord) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(tipRecord.getTimestamp());
    }
}
