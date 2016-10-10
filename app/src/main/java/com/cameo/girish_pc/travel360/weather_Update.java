package com.cameo.girish_pc.travel360;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.Time;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class weather_Update extends AppCompatActivity {

//    public String user_Destination;
//    private static int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather__update);

        FloatingActionButton uplod = (FloatingActionButton) findViewById(R.id.uplod);
        uplod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(weather_Update.this, "Upload currently Unavailable", Toast.LENGTH_SHORT).show();
            }
        });

        TextView click_Action = (TextView)findViewById(R.id.textView);
        click_Action.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view)
           {
               Intent i = new Intent(weather_Update.this, weather_Output.class);
               startActivity(i);
           }
        });

        //Toast.makeText(weather_Update.this, "Destination: "+user_Destination, Toast.LENGTH_LONG).show();

        //Array list to store destinations
        ArrayList<String> user_Locations = new ArrayList<String>();

        //Layout object to push in locations
        LinearLayout ContentView = (LinearLayout)findViewById(R.id.weather_Update);

        //add location to array(pos)
        user_Locations.add("Tried to get destination printed here");
        //create new textview to print location
        TextView tv_obj = new TextView(this);
        //set text of text view with value = location
        tv_obj.setText(user_Locations.get(0));
        //add text view to the layout
        ContentView.addView(tv_obj);


    }
}
