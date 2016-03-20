package com.androidfung.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HttpIntentActivity extends AppCompatActivity {

    Button mButtonGo, mButtonPerv, mButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_intent);
        mButtonGo = (Button) findViewById(R.id.buttonGo);
        mButtonNext = (Button) findViewById(R.id.buttonNext);
        mButtonPerv = (Button) findViewById(R.id.buttonPerv);

        mButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.google.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MarketIntentActivity.class);
                startActivity(intent);
            }
        });

        mButtonPerv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MailIntentActivity.class);
                startActivity(intent);
            }
        });
    }
}
