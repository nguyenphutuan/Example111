package com.example.nguye.example111;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nguyen phu tuan on 3/7/2016.
 */
public class fragment1 extends Fragment {
    ListView lv1,lv2,lv3;
    custuomlistview adapter1;
    custuomlistview adapter2;
    custuomlistview adapter3;
    List<SinhVien> arraylist1=new ArrayList<SinhVien>();
    List<SinhVien> arraylist2=new ArrayList<SinhVien>();
    List<SinhVien> arraylist3=new ArrayList<SinhVien>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment1,container,false);

        lv2=(ListView)v.findViewById(R.id.listfrag2);
        lv1=(ListView)v.findViewById(R.id.listfrag1);
        lv3=(ListView)v.findViewById(R.id.listfrag3);

        arraylist1.add(new SinhVien("Home", "http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg", ""));
        arraylist1.add(new SinhVien("Setting", "http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg", "1"));
        arraylist1.add(new SinhVien("About", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","2"));
        arraylist1.add(new SinhVien("Nice","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg",""));
        arraylist1.add(new SinhVien("Beautufull","http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg",""));

        adapter1=new custuomlistview(getContext(),R.layout.customlistviewxml,arraylist1);
        lv1.setAdapter(adapter1);
////////
        arraylist2.add(new SinhVien("Home", "http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg", ""));
        arraylist2.add(new SinhVien("Setting", "http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg", "1"));
        arraylist2.add(new SinhVien("About", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","2"));
        arraylist2.add(new SinhVien("Nice","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg",""));
        arraylist2.add(new SinhVien("Beautufull", "http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg", ""));
        arraylist2.add(new SinhVien("wonderfull", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","6"));
        arraylist2.add(new SinhVien("Home", "http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg", ""));
        arraylist2.add(new SinhVien("Setting","http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg","1"));
        arraylist2.add(new SinhVien("About", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","2"));
        arraylist2.add(new SinhVien("Nice","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg","7"));
        adapter2=new custuomlistview(getContext(),R.layout.customlistviewxml2,arraylist2);
        lv2.setAdapter(adapter2);
/////////
        arraylist3.add(new SinhVien("Home", "http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg", "5"));
        arraylist3.add(new SinhVien("Setting", "http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg", "1"));
        arraylist3.add(new SinhVien("About", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","2"));
        arraylist3.add(new SinhVien("Nice","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg",""));
        arraylist3.add(new SinhVien("Beautufull","http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg",""));

        adapter3=new custuomlistview(getContext(),R.layout.customlistviewxml3,arraylist3);
        lv3.setAdapter(adapter3);


        return v;
    }
}
