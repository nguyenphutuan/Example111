package com.example.nguye.example111;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView3);
        textView2=(TextView)findViewById(R.id.textView5);
        iv=(ImageView)findViewById(R.id.imageView2);
        Bundle b=getIntent().getBundleExtra("data");
        textView.setText(b.getString("soa"));
        textView2.setText(b.getString("soc"));
        Picasso.with(this).load(b.getString("sob")).into(iv);
    }
}
