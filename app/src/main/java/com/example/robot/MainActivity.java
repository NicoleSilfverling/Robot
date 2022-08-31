package com.example.robot;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button1);
        txv = (TextView)findViewById(R.id.tx);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }
}