package com.hilworking.esportnewsfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    private TextView textViewTren;
    private ImageView MobileLegend, PubgMobile, FreeFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        textViewTren = findViewById(R.id.textViewTren);
        MobileLegend = findViewById(R.id.MobilLegend);
        PubgMobile = findViewById(R.id.PubgMonile);
        FreeFire = findViewById(R.id.ApiGratis);

        MobileLegend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, MobileLegend.class);
                startActivity(intent);
            }
        });

        PubgMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, PubgMobile.class);
                startActivity(intent);
            }
        });
        FreeFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, FreeFire.class);
                startActivity(intent);
            }
        });

        textViewTren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://www.hitekno.com/games/2022/10/01/223600/sejarah-baru-evos-legends-gagal-lolos-playoff-mpl-season-10");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}