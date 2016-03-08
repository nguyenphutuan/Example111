package com.example.nguye.example111;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    TextView textView2;
    ImageView iv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView3);
        textView2=(TextView)findViewById(R.id.textView5);
        btn=(Button)findViewById(R.id.button);

        iv=(ImageView)findViewById(R.id.imageView2);
        Bundle b=getIntent().getBundleExtra("data");
        textView.setText(b.getString("soa"));
        textView2.setText(b.getString("soc"));
        Picasso.with(this).load(b.getString("sob")).into(iv);
        btn.setOnClickListener(this);
        ///////////////
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));//set color cho action bar


        LayoutInflater mInflater = LayoutInflater.from(this);//tu doan nay->
        View mCustomView = mInflater.inflate(R.layout.action_bar, null);
//        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
//        mTitleTextView.setText("My Own Title");
        Button imageButton = (Button) mCustomView.findViewById(R.id.button2);
        imageButton.setOnClickListener(this);
        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);//den het day->dung cho custom action bar
        //////////////////



    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button){
            Intent i=new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(i);
        }
        else {
            finish();
        }


    }
}
