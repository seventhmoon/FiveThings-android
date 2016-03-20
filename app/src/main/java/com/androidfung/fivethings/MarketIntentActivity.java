package com.androidfung.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MarketIntentActivity extends AppCompatActivity {

    Button mButtonGo, mButtonPerv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_intent);

        mButtonGo = (Button) findViewById(R.id.buttonGo);
        mButtonPerv = (Button) findViewById(R.id.buttonPerv);

        //org.gdg.frisbee.android

        mButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=org.gdg.frisbee.android");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        mButtonPerv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HttpIntentActivity.class);
                startActivity(intent);
            }
        });
    }
}
