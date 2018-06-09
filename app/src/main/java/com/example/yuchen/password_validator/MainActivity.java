package com.example.yuchen.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void Validate(View view) {
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        // Match 1 rule - Very Weak
        if (Validator.stage2(editText.getText().toString()) == 1) {
            textView.setText("Very Weak");
        }
        // Match 2 rules - Weak
        if (Validator.stage2(editText.getText().toString()) == 2) {
            textView.setText("Weak");
        }
        // Match 3 rules - Not Strong
        if (Validator.stage2(editText.getText().toString()) == 3) {
            textView.setText("Not Strong");
        }
        // Match 4 rules - Strong
        if (Validator.stage2(editText.getText().toString()) == 4) {
            textView.setText("Strong");
        }
        // Match 5 rules - Very Strong
        if (Validator.stage2(editText.getText().toString()) == 5) {
            textView.setText("Very Strong");
        }
    }
}