package com.oswaldofm17.tipcalc.fragments;

/**
 * Created by oswaldofm on 10/13/16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.oswaldofm17.tipcalc.R;

public class TipHistoryListFragment extends Fragment implements TipHistoryListFragmentListener{
    public TipHistoryListFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tip_history_list, container, false);
    }

    @Override
    public void action(String str) {
        Toast.makeText(getActivity(), str, Toast.LENGTH_SHORT).show();

    }
}