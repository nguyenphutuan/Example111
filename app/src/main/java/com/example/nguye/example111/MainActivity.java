package com.example.nguye.example111;

import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {
    DrawerLayout drawerLayout;
    RelativeLayout drawerPane;
    ListView LvNav;

    List<SinhVien> arraylistsinhvien;
    List<Fragment> Listfragment;

    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//lenh nay chinh la hien cai nut menu

        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerPane= (RelativeLayout) findViewById(R.id.drawer_pane);
        LvNav=(ListView)findViewById(R.id.nav_lixt);

        arraylistsinhvien=new ArrayList<SinhVien>();

        arraylistsinhvien.add(new SinhVien("Home", "http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg", ""));
        arraylistsinhvien.add(new SinhVien("Setting", "http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg", "1"));
        arraylistsinhvien.add(new SinhVien("About", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","2"));
        arraylistsinhvien.add(new SinhVien("Nice","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg",""));
        arraylistsinhvien.add(new SinhVien("Beautufull","http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg",""));
        arraylistsinhvien.add(new SinhVien("wonderfull", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","6"));
        arraylistsinhvien.add(new SinhVien("Home","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg",""));
        arraylistsinhvien.add(new SinhVien("Setting","http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg","1"));
        arraylistsinhvien.add(new SinhVien("About", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","2"));
        arraylistsinhvien.add(new SinhVien("Nice","http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg",""));
        arraylistsinhvien.add(new SinhVien("Beautufull","http://thuvienhinh.net/wp-content/uploads/2015/12/tuyen-tap-hinh-anh-girl-xinh-cute-cuc-dang-yeu-nhin-la-me-4.jpg",""));
        arraylistsinhvien.add(new SinhVien("wonderfull", "http://thuvienanhdep.net/wp-content/uploads/2015/11/nhung-hinh-anh-girl-xinh-de-thuong-trong-nhu-nhung-nang-cong-chua-2.jpg","6"));
        custuomlistview navListAdapter= new custuomlistview(this,R.layout.customlistviewxml,arraylistsinhvien);
        LvNav.setAdapter(navListAdapter);///////////////////

        Listfragment=new ArrayList<Fragment>();

        Listfragment.add(new fragment1());
        Listfragment.add(new fragment2());
        Listfragment.add(new fragment3());
        //load first fragment as default
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_content,Listfragment.get(0)).commit();
        setTitle(arraylistsinhvien.get(0).getTen());
        LvNav.setItemChecked(0, true);
        drawerLayout.closeDrawer(drawerPane);

        LvNav.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.main_content, Listfragment.get(position)).commit();
//                setTitle(arraylistsinhvien.get(position).getTen());
//                LvNav.setItemChecked(position, true);
//                drawerLayout.closeDrawer(drawerPane);
                Intent i=new Intent(getApplication(),Main2Activity.class);
                Bundle bundle = new Bundle();

                bundle.putString("soa",arraylistsinhvien.get(position).getTen());
                bundle.putString("sob",arraylistsinhvien.get(position).getHinh());
                bundle.putString("soc",arraylistsinhvien.get(position).getTuoi()+"");
                i.putExtra("data", bundle);
                startActivity(i);

            }
        });


        actionBarDrawerToggle=new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.drawer_opened,R.string.drawer_closed){
            @Override
            public void onDrawerOpened(View drawerView) {
                invalidateOptionsMenu();
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                invalidateOptionsMenu();
                super.onDrawerClosed(drawerView);
            }

        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//bat buoc phai co 2 cai ham mune nay
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {//cai nay de the hien di chuyen trang thai cua menu
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
}