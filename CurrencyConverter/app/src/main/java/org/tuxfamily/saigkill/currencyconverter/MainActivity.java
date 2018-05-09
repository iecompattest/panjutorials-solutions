package org.tuxfamily.saigkill.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked (View view) {
        EditText inputCur = findViewById(R.id.inputCurrency_editText);
        String fixedInput = inputCur.getText().toString();
        //String text = fixedInput ; // example String
        double value = Double.parseDouble(fixedInput);
        double output = value * 1.1375;
        Toast.makeText(this, "Pfund: " + output, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
