package com.example.seg2105_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seg2105_project.Client_Registration;
import com.example.seg2105_project.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnClient;
    Button btnCook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClient = (Button) findViewById(R.id.btnClient);
        btnCook = (Button) findViewById(R.id.btnCook);

        btnClient.setOnClickListener(this);
        btnCook.setOnClickListener(this);

    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnClient:
                startActivity(new Intent(this,Client_Registration.class));
                break;
            case R.id.btnCook:
                startActivity(new Intent(this,Cook_Registration.class));
                break;

        }
    }
}