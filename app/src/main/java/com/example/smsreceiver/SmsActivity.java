package com.example.smsreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent(getIntent());
        EditText senderText = findViewById(R.id.senderText);
        EditText contentsText = findViewById(R.id.contentsText);
        EditText receivedDateText = findViewById(R.id.receivedDateText);

        String sender = intent.getStringExtra("sender");
        senderText.setText(sender);
        String contents = intent.getStringExtra("contents");
        contentsText.setText(contents);
        String receivedDate = intent.getStringExtra("receivedDate");
        receivedDateText.setText(receivedDate);

    }
}
