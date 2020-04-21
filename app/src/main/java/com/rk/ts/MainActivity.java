package com.rk.ts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    TextSwitcher TS_1_IDJAVA;
    Button B_1_IDJAVA, B_2_IDJAVA;

    String[] NamaNamaMahasiswa = {
            "Meldiva Ratna",
            "Suyatno",
            "Roger Michael",
            "Nama Saya Siapa",
            "Mesm",
            "Rizka Aisyah",
            "Zainal Abidin"
    };

    int Posisi = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TS_1_IDJAVA = findViewById(R.id.TS_1_IDXML);
        B_1_IDJAVA = findViewById(R.id.B_1_IDXML);
        B_2_IDJAVA = findViewById(R.id.B_2_IDXML);

        TS_1_IDJAVA.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView TV = new TextView(getApplicationContext());
                TV.setTextSize(18);
                TV.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                TV.setGravity(Gravity.CENTER);
                return TV;
            }
        });

        B_1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Posisi > 0) {
                    Posisi = Posisi - 1;
                    TS_1_IDJAVA.setText(NamaNamaMahasiswa[Posisi]);
                }
            }
        });

        B_2_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Posisi < NamaNamaMahasiswa.length - 1) {
                    Posisi = Posisi + 1;
                    TS_1_IDJAVA.setText(NamaNamaMahasiswa[Posisi]);
                }
            }
        });

    }
}
