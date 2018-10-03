package com.devera.joseangelo.deverajoseangelolab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process (View v) {
        Intent i = null, chooser = null;

        if(v.getId()== R.id.btnActivity1){
            i = new Intent(this, Activity1.class);
            startActivity(i);
        }

        else if(v.getId()==R.id.btnMapIntramuros){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.589853,120.974650"));
            chooser = Intent.createChooser(i,"Choose Application for Map");
            startActivity(chooser);
        }
    }
}
