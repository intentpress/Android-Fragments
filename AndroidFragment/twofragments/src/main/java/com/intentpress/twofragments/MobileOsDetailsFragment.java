package com.intentpress.twofragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MobileOsDetailsFragment extends Fragment {
    public TextView mobileOs, OsVersion;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mobile_os_detail, container, false);
        mobileOs= (TextView) view.findViewById(R.id.mobile_os);
        OsVersion= (TextView)view.findViewById(R.id.os_version);
        return view;
    }
}
