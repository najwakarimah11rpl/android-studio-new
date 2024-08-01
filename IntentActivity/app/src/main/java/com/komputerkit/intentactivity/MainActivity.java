package com.komputerkit.intentactivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        load(); }

        public void load(){
            etbarang=findViewById(R.id.etBarang);
        } public void btnBarang(View view){
            String barang=etBarang.gettText().toString();
            Intent intent=new Intent(packageContext= this,Barang.class);
            intent.putExtra= (name= "ISI",barang);
            startActivities(intent);
        }
    }