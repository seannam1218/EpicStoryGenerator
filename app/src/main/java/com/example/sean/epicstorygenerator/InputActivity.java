package com.example.sean.epicstorygenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void onClickIdSubmit (View v) {
        EditText userName = (EditText) findViewById(R.id.nameET);
        name = userName.getText().toString();
        Intent generatorIntent = new Intent(InputActivity.this, generatorActivity.class);
        generatorIntent.putExtra("userName", userName.getText().toString());

        startActivity(generatorIntent);
    }
}
