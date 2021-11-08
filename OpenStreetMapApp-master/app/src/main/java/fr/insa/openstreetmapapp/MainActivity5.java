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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private ImageSwitcher mImageSwitcher;
    int position = 0;
    private int[] mImageIds = { R.drawable.donorm1, R.drawable.dospectr1,
            R.drawable.vovremya1, R.drawable.vovremyaspectr1, R.drawable.poslenorm1,
            R.drawable.poslespectr1, };
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ImageButton point = findViewById(R.id.point);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                startActivity(intent);
            }
        });


        mImageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);

        mImageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
        Animation inAnimation = new AlphaAnimation(0, 1);
        inAnimation.setDuration(400);
        Animation outAnimation = new AlphaAnimation(1, 0);
        outAnimation.setDuration(400);

        mImageSwitcher.setInAnimation(inAnimation);
        mImageSwitcher.setOutAnimation(outAnimation);

        mImageSwitcher.setImageResource(mImageIds[0]);

    }

    public void onSwitcherClick(View view){
        setPositionNext();
        mImageSwitcher.setImageResource(mImageIds[position]);
    }


    public void setPositionNext() {
        position++;
        if (position > mImageIds.length - 1) {
            position = 0;
        }
    }



}