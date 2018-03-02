package com.example.sbehe_000.dbzv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by sbehe_000 on 10/10/2017.
 */

public class LevelActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton buttonEasy;
    private ImageButton buttonMedium;
    private ImageButton buttonHard;
    public int level_mode; //Use level_mode as a reference to determine the level in Game_Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);


        //getting the button
        buttonEasy = (ImageButton) findViewById(R.id.buttonEasy);
        buttonMedium = (ImageButton) findViewById(R.id.buttonMedium);
        buttonHard = (ImageButton) findViewById(R.id.buttonHard);

        //adding a click listener
        buttonEasy.setOnClickListener(this);
        buttonMedium.setOnClickListener(this);
        buttonHard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Set the level based on the button the user clicks and start the Game class.
        if ( v == buttonEasy){
            level_mode = 1;
            startActivity(new Intent(LevelActivity.this, GameActivity.class));
        }
        if( v == buttonMedium){
            level_mode = 2;
            startActivity(new Intent(LevelActivity.this, GameActivity.class));
        }
        if(v == buttonHard){
            level_mode = 3;
            startActivity(new Intent(LevelActivity.this,GameActivity.class));
        }
    }
}
