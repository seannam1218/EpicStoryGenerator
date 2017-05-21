package com.example.sean.epicstorygenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class generatorActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);

        TextView nameView = (TextView) findViewById(R.id.resultNameTV);
        name = getIntent().getExtras().getString("userName");

        nameView.setText("Hello " + name + ", fill out the following questions to generate your story.");
    }

    public void onClickElementsSubmit (View v) {
        EditText adj = (EditText) findViewById(R.id.adjET);
        EditText weapon = (EditText) findViewById(R.id.weaponET);
        EditText monster = (EditText) findViewById(R.id.monsterET);

        Intent storyIntent = new Intent(generatorActivity.this, StoryActivity.class);
        storyIntent.putExtra("userName", name);
        storyIntent.putExtra("adj", adj.getText().toString());
        storyIntent.putExtra("weapon", weapon.getText().toString());
        storyIntent.putExtra("monster", monster.getText().toString());

        startActivity(storyIntent);
    }
}
