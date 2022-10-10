package com.hilworking.esportnewsfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MobileLegend extends AppCompatActivity {
    private TextView MobileLegend1, MobileLegend2, MobileLegend3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_legend);
        MobileLegend1 = findViewById(R.id.MobileLegend1);
        MobileLegend2 = findViewById(R.id.MobileLegend2);
        MobileLegend3 = findViewById(R.id.MobileLegend3);

        MobileLegend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.oneesports.id/mobile-legends/bigetron-beta-juara-mdl-id-s6/");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}