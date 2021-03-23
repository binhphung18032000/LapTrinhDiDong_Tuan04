package com.example.buoi3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NationAdapter extends BaseAdapter {

    Context context;
    ArrayList<Nation> DuLieu;

    public NationAdapter(Context context, ArrayList<Nation> duLieu) {
        this.context = context;
        this.DuLieu = duLieu;
    }

    @Override
    public int getCount() {
        return DuLieu.size();
    }

    @Override
    public Object getItem(int i) {
        return DuLieu.get(i);
    }

    @Override
    public long getItemId(int i) {
        return DuLieu.indexOf(i);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_1dong, null);

        ImageView hinh = convertView.findViewById(R.id.imgFlag);
        TextView tennuoc = convertView.findViewById(R.id.tvNationName);
        TextView danso = convertView.findViewById(R.id.tvPopulation);

        Nation nation = DuLieu.get(position);

        hinh.setImageResource(nation.hinh);
        tennuoc.setText(nation.tennuoc);
        danso.setText(nation.danso);

        return convertView;
    }
}
