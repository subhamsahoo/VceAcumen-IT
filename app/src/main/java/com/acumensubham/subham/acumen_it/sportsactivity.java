package com.acumensubham.subham.acumen_it;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Subham on 20-02-2015.
 */
public class sportsactivity extends Activity {
    ImageView ader,loop,techhunt,techtrinics,ladder;
    Animation zoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportsactivity);
        this.ader=((ImageView)findViewById(R.id.adernaline));
        this.loop=((ImageView)findViewById(R.id.loop));
        this.techhunt=((ImageView)findViewById(R.id.techhunt));
        this.techtrinics=((ImageView)findViewById(R.id.techtrins));
        this.ladder=((ImageView)findViewById(R.id.ladder));
        zoom=AnimationUtils.loadAnimation(this,R.anim.zoomin);
        ader.startAnimation(zoom);
        loop.startAnimation(zoom);
        techhunt.startAnimation(zoom);
        techtrinics.startAnimation(zoom);
        ladder.startAnimation(zoom);
        this.ader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(sportsactivity.this,adernalineactivity.class);
                sportsactivity.this.startActivity(lIntent);
            }
        });
        this.loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(sportsactivity.this,loopactivity.class);
                sportsactivity.this.startActivity(lIntent);
            }
        });
        this.techhunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(sportsactivity.this,techhuntactivity.class);
                sportsactivity.this.startActivity(lIntent);
            }
        });
        this.techtrinics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(sportsactivity.this,techtrinicsactivity.class);
                sportsactivity.this.startActivity(lIntent);
            }
        });

        this.ladder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(sportsactivity.this,ladderactivity.class);
                sportsactivity.this.startActivity(lIntent);
            }
        });
    }
}
