package com.intentpress.twofragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MobileNameFragment extends ListFragment {
    String[] mobileNme = new String[] {"Samsung", "Iphone", "Nokia Lumia", "BlackBerry"};
    String[] OsVeriosn = new String[]{"Android","IOS","Windows","BlackBerry 10"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_mobile_name, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, mobileNme);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        MobileOsDetailsFragment detailFragment = (MobileOsDetailsFragment)getFragmentManager().findFragmentById(R.id.fargment_latest_version);
        detailFragment.mobileOs.setText(mobileNme[position]);
        detailFragment.OsVersion.setText(OsVeriosn[position]);
        getListView().setSelector(android.R.color.holo_green_light);
    }
}
