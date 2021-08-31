package com.example.cottonpriceprediction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Spinner state, variety, year, month;
    Button predict;
    RequiredData requiredData;
    ArrayList<Integer> yearArray = new ArrayList<>();
    ArrayList<String> varieties = new ArrayList<>();

    int[] sr = new int[1];
    int[] vr=new int[1];
   int[] m = new int[1];
    int[] y = new int[1];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        requiredData = new RequiredData();
        state = findViewById(R.id.state);
        variety = findViewById(R.id.variety);
        year = findViewById(R.id.year);
        month = findViewById(R.id.month);
        predict = findViewById(R.id.predict);
String selectedText[] = new String[4] ;
        state.setEnabled(true);
        variety.setEnabled(false);
        ArrayList<String> s = new ArrayList<>();

        s = requiredData.getStates();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,s);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(arrayAdapter);
        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                variety.setEnabled(true);
                sr[0] = position;
                selectedText[0] = state.getSelectedItem().toString();
                ArrayList<String> v = new ArrayList<>();
                v = (ArrayList<String>) requiredData.getVarieties().get(position);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,v);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                variety.setAdapter(arrayAdapter);



            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        variety.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedText[1] = variety.getSelectedItem().toString();
                vr[0] = requiredData.getVarietyRank(selectedText[1]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

       ArrayList<Integer> yearList = new ArrayList<>();
       yearList.add(Calendar.getInstance().get(Calendar.YEAR));
        Toast.makeText(this, "yearlist "+ yearList.get(0), Toast.LENGTH_SHORT).show();
        ArrayAdapter<Integer> yearAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,yearList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        year.setAdapter(yearAdapter);
        year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedText[2] = year.getSelectedItem().toString();
                y[0] = Integer.parseInt(year.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        int cmonth = Calendar.getInstance().get(Calendar.MONTH);
        ArrayList<String> mlist = new ArrayList<>();
        for(int i = cmonth+1 ; i<12 ;i++)
        {
            mlist.add(requiredData.getMonth(i));


        }

        ArrayAdapter<String> monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,mlist);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        month.setAdapter(monthAdapter);
        month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                m[0] = cmonth+1 + position;
                selectedText[3] = month.getSelectedItem().toString();

                Toast.makeText(MainActivity.this, "selected month" + m[0], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

 predict.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {


//             Toast.makeText(MainActivity.this, "button clicked" + y[0], Toast.LENGTH_SHORT).show();
             String serverUrl = "http://192.168.1.5:8000/Prediction?year="+y[0]+"&month="+m[0]+"&state="+sr[0]+"&variety="+vr[0];
             RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
             StringRequest stringRequest = new StringRequest(Request.Method.GET, serverUrl,new Response.Listener<String>() {
                 @Override
                 public void onResponse(String response)  {


                     Log.i("TAG", "Response: "+response);
//                     Toast.makeText(MainActivity.this, "Response: "+response, Toast.LENGTH_LONG).show();

                   Intent intent  = new Intent(MainActivity.this,PredictionActivity.class);
                   intent.putExtra("inputs", selectedText);

                   startActivity(intent);


                 }
             }, new Response.ErrorListener() {
                 @Override
                 public void onErrorResponse(VolleyError error) {
                     Log.i("TAG", "Error: "+error.getMessage());
                     Toast.makeText(MainActivity.this, "Error: "+error.getMessage(), Toast.LENGTH_LONG).show();

                 }
             });
             requestQueue.add(stringRequest);






     }
 });


    }
}