package com.intentpress.fragmentlistview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentListView extends Fragment {
    public ListView listView;
    public FragmentListView(){
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_fragment, container, false);
        listView=(ListView)v.findViewById(R.id.listView);
        FragmentListAdapter adapter=new FragmentListAdapter(this);
        listView.setAdapter(adapter);
        return v;
    }
}
