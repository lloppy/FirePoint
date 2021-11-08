package fr.insa.openstreetmapapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.IconOverlay;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.OverlayItem;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private MapView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration.getInstance().load( getApplicationContext(),
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()));
        setContentView(R.layout.activity_main);
        map =  findViewById(R.id.map);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ImageButton point = findViewById(R.id.point);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


        map.setTileSource(TileSourceFactory.MAPNIK);    //render
        map.setBuiltInZoomControls(true);               //zoomable
        GeoPoint startPoint = new GeoPoint(56.835656, 59.945106);
        IMapController mapController = map.getController();
        mapController.setZoom(13.0);
        mapController.setCenter(startPoint);


//0
        ArrayList<OverlayItem> items = new ArrayList<>();
        OverlayItem home = new OverlayItem("Таватуй", "Загородный оздоровительный центр", startPoint);
        items.add(home);
        //items.add(new OverlayItem("qlqpart", "lol", new GeoPoint(43.570815, 1.466282)));

//1 ревда
        ArrayList<OverlayItem> items1 = new ArrayList<>();
        items1.add(new OverlayItem("г. Ревда", "Год пожара: 2021", new GeoPoint(56.835656, 59.945106)));

//5 глухое
        ArrayList<OverlayItem> items5 = new ArrayList<>();
        items5.add(new OverlayItem("оз. Глухое", "Год пожара: 2021", new GeoPoint(56.801801, 60.269843)));

//2 2020 год
        ArrayList<OverlayItem> items2 = new ArrayList<>();
        items2.add(new OverlayItem("оз. Черновское", "Год пожара: 2020", new GeoPoint(57.067843, 60.219314)));
        items2.add(new OverlayItem("бол. Мочаловское", "Год пожара: 2020", new GeoPoint(56.413978, 60.414719)));
        items2.add(new OverlayItem("пос. Белореченский", "Год пожара: 2020", new GeoPoint(56.678299, 61.366617)));
        items2.add(new OverlayItem("село Мугай", "Год пожара: 2020", new GeoPoint(58.384606, 61.607078)));


//3 2021 год
        ArrayList<OverlayItem> items3 = new ArrayList<>();
        OverlayItem home3 = new OverlayItem("д. Хомутовка", "Год пожара: 2021", new GeoPoint(56.857428, 59.817252));
        items3.add(home3);
        items3.add(new OverlayItem("гора Волчиха", "Год пожара: 2021", new GeoPoint(56.827617, 60.004370)));
        items3.add(new OverlayItem("гора Каменная", "Год пожара: 2021", new GeoPoint(56.751949, 60.006031)));
        items3.add(new OverlayItem("СНТ Мирный", "Год пожара: 2021", new GeoPoint(56.820710, 60.274385)));

//4 2019 год
        ArrayList<OverlayItem> items4 = new ArrayList<>();
        items4.add(new OverlayItem("пос. Полуночное", "Год пожара: 2019", new GeoPoint(60.854555, 60.462438)));
        items4.add(new OverlayItem("пос. Денежкино", "Год пожара: 2019", new GeoPoint(60.226448, 60.384999)));
        items4.add(new OverlayItem("пос. Каменка", "Год пожара: 2019", new GeoPoint(59.329915, 59.621751)));
        items4.add(new OverlayItem("г. Туринск", "Год пожара: 2019", new GeoPoint(58.083962, 63.695185)));
        items4.add(new OverlayItem("г. Алапаевск", "Год пожара: 2019", new GeoPoint(57.831038, 61.849164)));


//6 2018 год
        ArrayList<OverlayItem> items6 = new ArrayList<>();
        items6.add(new OverlayItem("пос. Чёрный яр", "Год пожара: 2018", new GeoPoint(59.501029, 59.732474)));
        items6.add(new OverlayItem("пос. Встреча", "Год пожара: 2018", new GeoPoint(58.010883, 60.462438)));
        items6.add(new OverlayItem("село Калиновское", "Год пожара: 2018", new GeoPoint(56.858995, 62.520717)));
        items6.add(new OverlayItem("гора Марков Камень", "Год пожара: 2018", new GeoPoint(56.431619, 60.504706)));
        items6.add(new OverlayItem("село Слобода", "Год пожара: 2018", new GeoPoint(57.010939, 59.543287)));


//7 2017 год
        ArrayList<OverlayItem> items7 = new ArrayList<>();
        items7.add(new OverlayItem("дер. Монастырка", "Год пожара: 2017", new GeoPoint(59.175243, 61.543994)));
        items7.add(new OverlayItem("г. Волчанск", "Год пожара: 2017", new GeoPoint(59.952894, 59.987661)));
        items7.add(new OverlayItem("пос. Кытлым", "Год пожара: 2017", new GeoPoint(59.489766, 59.175348)));
        items7.add(new OverlayItem("пос. Сигнальный", "Год пожара: 2017", new GeoPoint(58.806679, 59.797374)));
        items7.add(new OverlayItem("село Щелкун", "Год пожара: 2017", new GeoPoint(56.313686, 60.957243)));

//1
        ItemizedOverlayWithFocus<OverlayItem> mOverlay1 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items1, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home1) {
                Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });


//5
        ItemizedOverlayWithFocus<OverlayItem> mOverlay5 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items5, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home1) {
                Intent intent = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });


//0
        ItemizedOverlayWithFocus<OverlayItem> mOverlay = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });


//2
        ItemizedOverlayWithFocus<OverlayItem> mOverlay2 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items2, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home2) {
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });


//7
        ItemizedOverlayWithFocus<OverlayItem> mOverlay7 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items7, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home7) {
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });


//6
        ItemizedOverlayWithFocus<OverlayItem> mOverlay6 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items6, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home2) {
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });


//4
        ItemizedOverlayWithFocus<OverlayItem> mOverlay4 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items4, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home4) {
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });



//empty3
        ItemizedOverlayWithFocus<OverlayItem> mOverlay3 = new ItemizedOverlayWithFocus<OverlayItem>(getApplicationContext(),
                items3, new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem home3) {
                return true;
            }

            @Override
            public boolean onItemLongPress(int index, OverlayItem item) {
                return false;
            }
        });

//0
        mOverlay.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay);
//1
        mOverlay1.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay1);
//2
        mOverlay2.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay2);
//3
        mOverlay3.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay3);
//4
        mOverlay4.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay4);
//5
        mOverlay5.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay5);

//6
        mOverlay6.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay6);

//7
        mOverlay7.setFocusItemsOnTap(true);
        map.getOverlays().add(mOverlay7);
}

    @Override
    public void onPause() {
        super.onPause();
        map.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        map.onResume();
    }



}