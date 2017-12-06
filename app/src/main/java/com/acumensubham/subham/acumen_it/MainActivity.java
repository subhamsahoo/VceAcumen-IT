package com.acumensubham.subham.acumen_it;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
    ImageView events,dabbler,facebook,vasavi,about,aboutapp,youtube,sponsers,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.events=((ImageView)findViewById(R.id.events));
        this.facebook=((ImageView)findViewById(R.id.facebook));
        this.vasavi=((ImageView)findViewById(R.id.vasavi));
        this.about=((ImageView)findViewById(R.id.about));
        this.aboutapp=((ImageView)findViewById(R.id.aboutapp));
        this.youtube=((ImageView)findViewById(R.id.youtube));
        this.sponsers=((ImageView)findViewById(R.id.imageView6));
        this.dabbler=((ImageView)findViewById(R.id.google));
        this.contact=((ImageView)findViewById(R.id.imageView5));
        this.events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(MainActivity.this,eventactivity.class);
                MainActivity.this.startActivity(lIntent);
            }
        });
        this.facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.facebook.com/pages/Acumen-IT15/339433559598354"));
                MainActivity.this.startActivity(local);
            }
        });
        this.vasavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liIntent=new Intent(MainActivity.this,vasaviactivity.class);
                MainActivity.this.startActivity(liIntent);

            }
        });
       this.about.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent liaIntent=new Intent(MainActivity.this,aboutactivity.class);
               MainActivity.this.startActivity(liaIntent);

           }
       });
        this.aboutapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent=new Intent(MainActivity.this,aboutapp.class);
                MainActivity.this.startActivity(liaIntent);
            }
        });
        this.youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.youtube.com/channel/UC3leStl5d8LERUaQm0rtsYg/feed"));
                MainActivity.this.startActivity(local);
            }
        });
        this.sponsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent=new Intent(MainActivity.this,sponser.class);
                MainActivity.this.startActivity(liaIntent);

            }
        });

        this.contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liaIntent=new Intent(MainActivity.this,contact.class);
                MainActivity.this.startActivity(liaIntent);

            }
        });
        this.dabbler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent=new Intent(MainActivity.this,dabbler.class);
                MainActivity.this.startActivity(lIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
