package ca.bcit.techpro.jason.physicssimulation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_menu);
    }

    public void startGame(final View view){
        Intent i = new Intent(MainMenu.this, Game.class);
        startActivity(i);
    }

    public void startSettings(final View view){
        Intent i = new Intent(MainMenu.this, SettingsMenu.class);
        startActivity(i);
    }
}

