package com.intentpress.fragmentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FragmentListAdapter extends BaseAdapter {
    public String nameString[] = {"Steve", "Arnold", "Rock", "Jimmy", "John"};
    public FragmentListView fragment;
    public TextView textview;
    public FragmentListAdapter(FragmentListView fragment){
        this.fragment = fragment;
    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li =(LayoutInflater)fragment.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v= li.inflate(R.layout.activity_list_view, null);
        textview = (TextView)v.findViewById(R.id.text_view);
        textview.setText(nameString[position]);
        return v;
    }
}
