package com.hhyg.TyClosing.fragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.hhyg.TyClosing.R;

/**
 * Created by user on 2017/6/28.
 */

public class LoadingDialogFragment extends DialogFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        View view = inflater.inflate(R.layout.dialog_loading,container);
        return view;
    }
}
