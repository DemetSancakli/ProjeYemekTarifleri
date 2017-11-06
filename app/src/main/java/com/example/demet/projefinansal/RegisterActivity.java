package com.example.demet.projefinansal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by demet on 5.11.2017.
 */

public class RegisterActivity extends Activity {

    public TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        loginTextView = (TextView) findViewById(R.id.loginTextView);
        loginTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

          }
        });
    }
}
