package com.example.sean.epicstorygenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    private String name;
    private String adj;
    private String weapon;
    private String monster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        name = getIntent().getExtras().getString("userName");
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        adj = getIntent().getExtras().getString("adj");
        adj = adj.substring(0, 1).toUpperCase() + adj.substring(1);
        weapon = getIntent().getExtras().getString("weapon");
        monster = getIntent().getExtras().getString("monster");
        monster = monster.substring(0, 1).toUpperCase() + monster.substring(1);

        TextView storyView = (TextView) findViewById(R.id.storyTV);

        storyView.setText(
                "There once was a time when this world was overtaken by atrocious monsters led by their leader, " + monster + ". " +
                "Darkness enveloped this world, and kingdoms burned one after the other. " +
                "All seemed lost for humanity, and it soon became apparent that the only hero that could save this world then was " + name
                + " the " + adj + ". " + name + " rose from the ashes of the fallen, and stood face to face with " + monster + ". "
                + "Oh and his " + weapon + " was pretty legit as well. However, " + monster + " was like fricking powerful, " +
                "so he straight up backhand slapped " + name + " and punched his balls. Our hero, " + name +
                ", ran away with his shitty " + weapon + ". The End."
        );
    }

    public void onClickRegenerate(View v) {
        Button b = (Button) v;
        Intent firstPage = new Intent(StoryActivity.this, InputActivity.class);
        startActivity(firstPage);
    }
}
