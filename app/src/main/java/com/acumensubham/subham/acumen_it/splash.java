package com.acumensubham.subham.acumen_it;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Subham on 20-02-2015.
 */
public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread t = new Thread() {
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();

                }finally {
                    Intent open=new Intent("com.example.subham.acumen_it.MAINACTIVITY");
                    startActivity(open);
                }
            }
        };
        t.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}