package com.example.activitytransition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randGen();
            }
        });
    }
    private void randGen(){
        Toast t = Toast.makeText(this,"Ecchi!",Toast.LENGTH_SHORT);
        int random = rng.nextInt(6) + 1;
        switch (random){
            case 1: img.setImageResource(R.drawable.zero);
                t.setText("Ecchi!");
                t.show();
                break;
            case 2: img.setImageResource(R.drawable.deku);
                t.setText("Midoriya Shounen");
                t.show();
                break;
            case 3: img.setImageResource(R.drawable.haik);
                t.setText("Orange Naruto");
                t.show();
                break;
            case 4: img.setImageResource(R.drawable.megumin);
                t.setText("Best girl");
                t.show();
                break;
            case 5: img.setImageResource(R.drawable.naruto);
                t.setText("Rasengan 4 life");
                t.show();
                break;
            case 6: img.setImageResource(R.drawable.phonekaguya);
                t.setText("Kawaii koto");
                t.show();
                break;
        }
    }
}
