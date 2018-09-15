package com.example.nishida.sqlitegps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String textLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLog = "測位日時：2018-09-15 20:23:59\n緯　度　：123.456789\n経　度　：123.456789";
        textView = (TextView) findViewById(R.id.text_view);
        textView.setText(textLog);

    }
}
