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
public class logicmagicactivity extends Activity {
    ImageView cstrike,chak,testuwits,orchestra;
    Animation zoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logicmagic);
        this.cstrike=((ImageView)findViewById(R.id.cstrike));
        this.chak=((ImageView)findViewById(R.id.chakravyuh));
        this.testuwits=((ImageView)findViewById(R.id.testurwits));
        this.orchestra=((ImageView)findViewById(R.id.orchestra));
        zoom=AnimationUtils.loadAnimation(this,R.anim.zoomin);
        chak.startAnimation(zoom);
        cstrike.startAnimation(zoom);
        testuwits.startAnimation(zoom);
        orchestra.startAnimation(zoom);
        this.cstrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(logicmagicactivity.this,cstrikeactivity.class);
                logicmagicactivity.this.startActivity(lIntent);
            }
        });
        this.chak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(logicmagicactivity.this,chakravyuhactivity.class);
                logicmagicactivity.this.startActivity(lIntent);
            }
        });
        this.testuwits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(logicmagicactivity.this,testurwits.class);
                logicmagicactivity.this.startActivity(lIntent);
            }
        });
        this.orchestra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(logicmagicactivity.this,orchestrateactivity.class);
                logicmagicactivity.this.startActivity(lIntent);
            }
        });
    }
}
