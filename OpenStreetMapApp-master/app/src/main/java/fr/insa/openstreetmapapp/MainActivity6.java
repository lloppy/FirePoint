package fr.insa.openstreetmapapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;

public class MainActivity6 extends AppCompatActivity {
    private ImageSwitcher mImageSwitcher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ImageButton point = findViewById(R.id.point);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);

        mImageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
        Animation inAnimation = new AlphaAnimation(0, 1);
        inAnimation.setDuration(500);
        Animation outAnimation = new AlphaAnimation(1, 0);
        outAnimation.setDuration(500);

        mImageSwitcher.setInAnimation(inAnimation);
        mImageSwitcher.setOutAnimation(outAnimation);
    }

    public void onSwitcherClick(View view) {
        mImageSwitcher.showNext();

    }
}