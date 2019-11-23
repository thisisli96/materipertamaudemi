package com.example.mrpeter1.materipertamaudemi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText textuser, textpassword;
    Button pencetdong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textuser = findViewById(R.id.textuser);
        textpassword = findViewById(R.id.textpassword);
        pencetdong = findViewById(R.id.pencetdong);

        pencetdong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hi there", Toast.LENGTH_SHORT).show();

            }
        });






    }
}
