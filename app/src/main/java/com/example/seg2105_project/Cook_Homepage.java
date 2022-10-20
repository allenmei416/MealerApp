package com.example.seg2105_project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Cook homepage lets you know you're logged in as a cook and lets you back out to the register/login page
 */
public class Cook_Homepage extends AppCompatActivity  implements View.OnClickListener{
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook_homepage);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);
    }

    /**
     * onClick listens for a button to click and starts the corresponding activity
     * @param v
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnLogout){
            Intent intent = new Intent(this, Register_Login_Page.class);
            startActivity(intent);
        }
    }
}