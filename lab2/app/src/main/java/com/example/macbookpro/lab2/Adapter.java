package com.example.macbookpro.lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Integer> {

    private List<Integer> textSizes;

    Context contextGlobal;

    TextView textSize;

    private final LayoutInflater mInflater;

    public Adapter(Context context) {
        super(context, R.layout.itemlist);
        contextGlobal = context;

        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setData(List<Integer> data) {

        clear();
        if (data != null) {
            addAll(data);
            notifyDataSetChanged();
        }
        textSizes = data;
    }

    public Integer getItem(int position) {
        return textSizes.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View view;
        if (convertView == null) {
            view =  mInflater.inflate(R.layout.itemlist, parent, false);
        } else {
            view = convertView;
        }

        textSize = (TextView) view.findViewById(R.id.textElement);
        Integer currentSize = getItem(position);
        textSize.setText(String.valueOf(currentSize));

        return view;
    }
}
