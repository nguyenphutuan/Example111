package com.example.nguye.example111;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by nguyen phu tuan on 3/7/2016.
 */
public class custuomlistview extends ArrayAdapter<SinhVien> {
    Context context;
    int resLayout;
    List<SinhVien> listNavItems;
    public custuomlistview(Context context, int resource, List<SinhVien> listNavItems) {
        super(context, resource, listNavItems);
        this.context=context;
        this.resLayout=resource;
        this.listNavItems=listNavItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=View.inflate(context,resLayout,null);


        TextView texview=(TextView)v.findViewById(R.id.textView2);
        TextView texview2=(TextView)v.findViewById(R.id.textView4);
        ImageView imgview=(ImageView)v.findViewById(R.id.imageView);

        SinhVien navItem=listNavItems.get(position);
        texview.setText(navItem.getTen());
        texview2.setText(navItem.getTuoi()+"");
        Picasso.with(context).load(navItem.getHinh()).into(imgview);

        return v;
    }
}
