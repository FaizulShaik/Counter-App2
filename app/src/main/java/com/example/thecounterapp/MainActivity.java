package com.example.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText counter;
    Button button;
    TextView welcome;
    int counter_text = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=findViewById(R.id.counter_app);
        welcome=findViewById(R.id.welcome_text);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText(""+increaseCounter());
                welcome.setText("");
                Toast.makeText(MainActivity.this, "Number is increasing", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public int increaseCounter(){
        return ++counter_text;
    }
}