package com.atomdrive.root.atomdrive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button settings;
    TextView settingsTxt;
    Button d1counter;
    TextView d1percent;
    Button d2counter;
    TextView d2percent;
    Button d3counter;
    TextView d3percent;
    int d1per;
    int d2per;
    int d3per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settings = (Button)findViewById(R.id.settings);
        settingsTxt = (TextView)findViewById(R.id.settingsTxt);
        settings.setOnClickListener(this);
        d1per = 10;
        d2per = 10;
        d3per = 10;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.settings)
            settingsTxt.setText("Settings");
        else if(view.getId()==R.id.d1counter) {
            d1per+=10;
            d1percent.setText(""+d1per);
        }
        else if(view.getId()==R.id.d2counter) {
            d2per+=10;
            d2percent.setText(""+d2per);
        }
        else if(view.getId()==R.id.d3counter) {
            d3per+=10;
            d3percent.setText(""+d3per);
        }
    }

}
