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
public class eventactivity extends Activity {

    Animation zoom;
    ImageView code,logic,sports,paper,poster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventactivity);
        this.code=((ImageView)findViewById(R.id.code));
        this.logic=((ImageView)findViewById(R.id.logic));
        this.sports=((ImageView)findViewById(R.id.sports));
        this.paper=((ImageView)findViewById(R.id.paper));
        this.poster=((ImageView)findViewById(R.id.poster));
        zoom=AnimationUtils.loadAnimation(this,R.anim.zoomin);
        code.startAnimation(zoom);
        logic.startAnimation(zoom);
        sports.startAnimation(zoom);
        paper.startAnimation(zoom);
        poster.startAnimation(zoom);

        this.code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(eventactivity.this,codeacticity.class);
                eventactivity.this.startActivity(lIntent);
            }
        });
        this.logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(eventactivity.this,logicmagicactivity.class);
                eventactivity.this.startActivity(ab);
            }
        });
        this.sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc=new Intent(eventactivity.this,sportsactivity.class);
                eventactivity.this.startActivity(abc);
            }
        });
        this.paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc=new Intent(eventactivity.this,paperactivity.class);
                eventactivity.this.startActivity(abc);
            }
        });
        this.poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc=new Intent(eventactivity.this,posteractivity.class);
                eventactivity.this.startActivity(abc);
            }
        });

    }


}
