package com.example.rainer.taschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btndiv;
    private TextView output;
    private EditText dividend, divisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btndiv = (Button) findViewById(R.id.buttondividiere);
        output = (TextView) findViewById(R.id.output);
        dividend = (EditText) findViewById(R.id.dividend);
        divisor = (EditText) findViewById(R.id.divisor);

        btndiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1 = dividend.getText().toString();
        String n2 = divisor.getText().toString();

        switch (v.getId()){
            case R.id.buttondividiere:
                try {
                    int division = Integer.parseInt(n1) / Integer.parseInt(n2);
                    output.setText(String.valueOf(division));
                } catch (Exception e){
                    output.setText("Division nicht möglich!");

            }
        }

    }
}
