package com.oswaldofm17.tipcalc.fragments;

import com.oswaldofm17.tipcalc.entity.TipRecord;

/**
 * Created by oswaldofm on 10/13/16.
 */

public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
