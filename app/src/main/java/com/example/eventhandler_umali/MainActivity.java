package com.example.eventhandler_umali;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import kotlin.contracts.Returns;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        EditText edtName = findViewById(R.id.edtName);
        TextView txtresult = findViewById(R.id.txtresult);
        Button btnHello = findViewById(R.id.btnHello);

        btnHello.setOnClickListener(v-> {
            String name = edtName.getText().toString().trim();
            if (name.isEmpty()) {
                Toast.makeText(this, "Enter your ex-name", Toast.LENGTH_SHORT).show();
            }else {
                txtresult.setText("Hello ," + name + "!");
            }
        });

    }
}