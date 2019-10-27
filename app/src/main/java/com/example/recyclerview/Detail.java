package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Detail extends AppCompatActivity {
    CircleImageView imgProfile;
    TextView tvName, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgProfile = findViewById(R.id.imgProfile);
        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);

        Bundle bundle = getIntent().getExtras();


        if(bundle!=null){
            imgProfile.setImageResource(bundle.getInt("imgid"));
            tvName.setText(bundle.getString("name"));
            tvPhone.setText(bundle.getString("phone"));

        }
    }
}
