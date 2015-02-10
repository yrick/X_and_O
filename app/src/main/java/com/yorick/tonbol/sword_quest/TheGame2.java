package com.yorick.tonbol.sword_quest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class TheGame2 extends ActionBarActivity {

    public void x_movement1 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView12);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_1);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement2 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView11);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_2);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement3 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView13);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_3);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement4 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView15);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_4);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement5 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView14);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_5);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement6 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView19);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_6);
        ImageView1.startAnimation(mAnim);
    }
    public void x_movement7 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView21);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_7);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement8 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView20);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_8);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement9 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView22);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_9);
        ImageView1.startAnimation(mAnim);
    }

    public void x_movement10 (View view) {
        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView23);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.move_x_10);
        ImageView1.startAnimation(mAnim);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game2);

        Intent intent2 = getIntent();
        String PlayerName = intent2.getExtras().getString("NamePlayer");

        TextView UserNameDisplay = (TextView) findViewById(R.id.UserNameDisplay);
        UserNameDisplay.append(PlayerName);
        x_movement1(null);
        x_movement2(null);
        x_movement3(null);
        x_movement4(null);
        x_movement5(null);
        x_movement6(null);
        x_movement7(null);
        x_movement8(null);
        x_movement9(null);
        x_movement10(null);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_the_game2, menu);
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



    public void swing_sword_right (View view) {
        ImageView mImageView = (ImageView) findViewById(R.id.game_view);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.animation_view);

        mImageView.startAnimation(mAnim);
    }

    public void swing_sword_left (View view) {
        ImageView mImageView = (ImageView) findViewById(R.id.game_view);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.swingleft);

        mImageView.startAnimation(mAnim);
    }

    public void GOGOGO (View view) {
        ImageView mImageView = (ImageView) findViewById(R.id.game_view);

        Animation mAnim = AnimationUtils.loadAnimation(this, R.anim.gogogo);

        mImageView.startAnimation(mAnim);
    }

}
