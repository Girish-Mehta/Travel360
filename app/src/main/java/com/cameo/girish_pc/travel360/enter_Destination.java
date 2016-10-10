package com.cameo.girish_pc.travel360;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class enter_Destination extends AppCompatActivity {

    public EditText des;
    public String loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter__destination);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               des = (EditText)findViewById(R.id.editText);
               loc = des.getText().toString();
               Intent i = new Intent(enter_Destination.this, weather_Update.class);
               startActivity(i);
            }
        });

        FloatingActionButton friend = (FloatingActionButton) findViewById(R.id.friend);
        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(enter_Destination.this, mapActivity.class);
                startActivity(i);
            }
        });
    }


}
