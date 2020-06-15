package com.example.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Main2Activity extends AppCompatActivity {
    LinearLayout ly;
    RelativeLayout view;
    ImageView imgv;
    private TextView tvjudul, tvdesk1, tvdesk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ly =findViewById(R.id.view);
        imgv = findViewById(R.id.imgbaner);
        tvjudul = findViewById(R.id.tvjudul);
        tvdesk1 = findViewById(R.id.tvdesk1);
        tvdesk2 = findViewById(R.id.tvdesk2);

        if(getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            int foto = Integer.parseInt(bundle.getString("foto"));
            String judul = String.valueOf(bundle.getString("judul"));
            String desk1 = String.valueOf(bundle.getString("desk1"));
            String desk2 = String.valueOf(bundle.getString("desk2"));


            Glide.with(getApplicationContext())
                    .load(foto)
                    .apply(new RequestOptions().override(350, 550))
                    .into(imgv);

            tvjudul.setText(judul);
            tvdesk1.setText(desk1);
            tvdesk2.setText(desk2);
        }

        Animation up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_top);

        Animation right = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_right);

        ly.startAnimation(up);

        imgv.startAnimation(right);
    }
}
