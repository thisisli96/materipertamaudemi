package com.example.mrpeter1.materipertamaudemi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public void pencetdong (View view){
//        EditText textuser = (EditText) findViewById(R.id.textuser);
//         Log.i("username",textuser.getText().toString());
//    }

    EditText textuser, textpassword;
    Button pencetdong;
    String namadeh = "";
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
                namadeh = textuser.getText().toString();
                Toast.makeText(getApplicationContext(),"hi there "+ namadeh, Toast.LENGTH_SHORT).show();

                Log.i("username", textuser.getText().toString() );
                Log.i("password", textpassword.getText().toString() );
                Log.i("INFO", "BUTTON TERTEKAN" );



            }
        });






    }
}
