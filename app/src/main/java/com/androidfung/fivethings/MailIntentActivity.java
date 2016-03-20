package com.androidfung.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MailIntentActivity extends AppCompatActivity {

    private Button mButtonNext, mButtonPerv;
    private EditText mEditTextSubject, mEditTextTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_intent);

        mButtonNext = (Button) findViewById(R.id.buttonNext);
        mButtonPerv = (Button) findViewById(R.id.buttonPerv);

        mEditTextSubject = (EditText) findViewById(R.id.editTextSubject);
        mEditTextTo = (EditText) findViewById(R.id.editTextTo);

        Button buttonSend = (Button) findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, mEditTextTo.getText()); // recipients
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, mEditTextSubject.getText());
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
                emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));
// You can also attach multiple items by passing an ArrayList of Uris

                startActivity(emailIntent);
            }
        });


        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HttpIntentActivity.class);
                startActivity(intent);
            }
        });

        mButtonPerv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MapsIntentActivity.class);
                startActivity(intent);
            }
        });


    }
}
