package com.ben.climatecrash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class crashregister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crashregister);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void Openmain(View view){
        Intent intent = new Intent(crashregister.this, Crasmain.class);
        startActivity(intent);
    }

    public void toast(View view){
        Toast.makeText(this, "Account ready!", Toast.LENGTH_SHORT).show();
    }

    public void pass(View view){
        Toast.makeText(this, "Contraseña creada!", Toast.LENGTH_SHORT).show();
    }
}
