package com.acumensubham.subham.acumen_it;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Subham on 01-03-2015.
 */
public class dabbler extends Activity {
    ImageView dabb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dabbler);
        this.dabb=((ImageView)findViewById(R.id.dabbler2));
        this.dabb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://goo.gl/wG6FOi"));
                dabbler.this.startActivity(local);
            }
        });
    }
}
