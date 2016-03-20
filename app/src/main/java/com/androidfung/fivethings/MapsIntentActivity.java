package com.androidfung.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapsIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_intent);

        Button buttonGo = (Button) findViewById(R.id.buttonGo);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);
        Button buttonPerv = (Button) findViewById(R.id.buttonPerv);

        final EditText editTextLocation = (EditText) findViewById(R.id.editTextLocation);

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// Map point based on address
                Uri location = Uri.parse("geo:0,0?q=" + editTextLocation.getText());
// Or map point based on latitude/longitude
// Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MailIntentActivity.class);
                startActivity(intent);
            }
        });

        buttonPerv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
