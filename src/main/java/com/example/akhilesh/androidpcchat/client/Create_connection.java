package com.example.akhilesh.androidpcchat.client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akhilesh.androidpcchat.R;

public class Create_connection extends AppCompatActivity {
    Button connect;
    EditText IP;
    EditText port;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_connection);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.launch1);

        IP=(EditText)findViewById(R.id.IP);
        port=(EditText)findViewById(R.id.port);

        connect=(Button)findViewById(R.id.Connect);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = IP.getText().toString();
                String s2 = port.getText().toString();
                if (s1.equals("") || s2.equals("")) {
                    Toast.makeText(getApplicationContext(), "Field Vacant", Toast.LENGTH_SHORT).show();
                    return;
                } else {

                    Toast.makeText(getApplicationContext(),"Connecting to server",Toast.LENGTH_SHORT).show();
                    Intent connect = new Intent("com.prashant.adesara.socket.client.MyActivity");
                    Create_connection.this.startActivity(connect);
                }
            }
        });

    }

    public String getIP(){
            String s1=IP.getText().toString();
        return s1;
    }

}
