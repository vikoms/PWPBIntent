package com.example.pwpbintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button implicit;
    Button explicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        explicit = (Button) findViewById(R.id.explicitIntent);
        explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, ActivityIntent.class);
                startActivity(explicit);
            }
        });
        implicit = (Button) findViewById(R.id.implicitIntent);
        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/"));
                startActivity(implicit);
            }
        });
    }

}
