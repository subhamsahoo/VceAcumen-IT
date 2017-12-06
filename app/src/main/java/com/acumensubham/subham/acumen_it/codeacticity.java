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
public class codeacticity extends Activity {
    ImageView kode,mosiac,cshoot,tic;
    Animation zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codeactivity);
        this.kode=((ImageView)findViewById(R.id.kodernan));
        this.mosiac=((ImageView)findViewById(R.id.mosiac));
        this.cshoot=((ImageView)findViewById(R.id.cshoot));
        this.tic=((ImageView)findViewById(R.id.tictac));
        zoom=AnimationUtils.loadAnimation(this,R.anim.zoomin);
        kode.startAnimation(zoom);
        mosiac.startAnimation(zoom);
        cshoot.startAnimation(zoom);
        tic.startAnimation(zoom);
       this.kode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(codeacticity.this,kodernanactivity.class);
                codeacticity.this.startActivity(lIntent);
            }
        });
        this.mosiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(codeacticity.this,mosiacactivity.class);
                codeacticity.this.startActivity(lIntent);
            }
        });
        this.cshoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(codeacticity.this,cshootactivity.class);
                codeacticity.this.startActivity(lIntent);
            }
        });
        this.tic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(codeacticity.this,tictacactivity.class);
                codeacticity.this.startActivity(lIntent);
            }
        });
    }
}
