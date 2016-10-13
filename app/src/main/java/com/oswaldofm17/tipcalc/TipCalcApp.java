package com.oswaldofm17.tipcalc;

import android.app.Application;

/**
 * Created by oswaldofm on 10/12/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "http://www.github.com";

    public String getAboutUrl() {
        return ABOUT_URL;

    }
}