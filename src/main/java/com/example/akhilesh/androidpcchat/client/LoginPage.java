package com.example.akhilesh.androidpcchat.client;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akhilesh.androidpcchat.R;

public class LoginPage extends AppCompatActivity {
    Button Ok;
    EditText log_edtext;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.launch1);


        log_edtext=(EditText)findViewById(R.id.log_edtext);
        pass=(EditText)findViewById(R.id.pass);
        Ok=(Button)findViewById(R.id.Ok);
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String s1=log_edtext.getText().toString();
                String s2=pass.getText().toString();
                if(s1.equals("")||s2.equals("")){
                    Toast.makeText(getApplicationContext(),"Field Vacant",Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(log_edtext.getText().toString().equals("admin")&&pass.getText().toString().equals("admin")) {

                    Intent Ok = new Intent(LoginPage.this,Create_connection.class);
                    LoginPage.this.startActivity(Ok);

                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
