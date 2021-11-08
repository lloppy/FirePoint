package fr.insa.openstreetmapapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.lang.reflect.Array;

public class MainActivity3 extends AppCompatActivity {

private ImageButton imageBtn;
private int[] mImageIds = {R.drawable.vovremya, R.drawable.vovremyaspectr, R.drawable.dospectr, };
private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ImageButton point = findViewById(R.id.point);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

//        imageBtn = findViewById(R.id.imageBtn);
//        imageBtn.setImageResource(mImageIds[index]);
//
//        imageBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                index += 1;
//
//            }
//        });
    }
}