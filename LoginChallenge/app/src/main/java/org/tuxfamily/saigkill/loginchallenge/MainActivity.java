package org.tuxfamily.saigkill.loginchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickedButton(View view) {
        ImageView imgview=(ImageView) findViewById(R.id.imageView);
        imgview.setImageResource(R.drawable.Tux);
    }
}
