package com.example.demet.projefinansal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Created by demet on 5.11.2017.
     */


        public TextView registerTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            registerTextView = (TextView) findViewById(R.id.registerTextView);
            registerTextView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                    startActivity(i);
                }
            });
        }

    }
