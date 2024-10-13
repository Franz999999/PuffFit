package com.example.pufffitt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    TextView loginTitle;
    EditText uNameInp;
    EditText passInp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loginTitle = (TextView) findViewById(R.id.title);
        uNameInp = (EditText) findViewById(R.id.uNameInput);
        passInp = (EditText) findViewById(R.id.passInput);
    }

    public void login(View view) {
        if (matches(uNameInp, "Franz")  && matches(passInp, "cisco")) {
            setContentView(R.layout.home);
        } else {
            loginTitle.setText("Geh");
        }

        Uri uri = Uri.parse("https://youtu.be/BbeeuzU5Qc8?feature=shared");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private boolean matches(EditText s1, String s2) {
        return s1.getText().toString().equals(s2);
    }
}