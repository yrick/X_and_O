package com.yorick.tonbol.sword_quest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class TheGame extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game);


        Intent intent1 = getIntent();
        String PlayerName = intent1.getExtras().getString("NamePlayer");

        TextView thisIsYourName = (TextView)
                findViewById(R.id.PlayerNameDisplay);

        thisIsYourName.append(PlayerName);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_the_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startGame(View view) {
        Intent intent2 = new Intent(this, TheGame2.class);

        Intent intent1 = getIntent();
        String PlayerName = intent1.getExtras().getString("NamePlayer");

        intent2.putExtra("NamePlayer", PlayerName);
        startActivity(intent2);
    }
}
