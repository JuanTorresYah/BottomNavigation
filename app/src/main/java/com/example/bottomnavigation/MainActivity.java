package com.example.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.bottomnavigation.fragment.CartFragment;
import com.example.bottomnavigation.fragment.GiftsFragment;
import com.example.bottomnavigation.fragment.ProfileFragment;
import com.example.bottomnavigation.fragment.StoreFragment;
import com.example.bottomnavigation.helper.BottomNavigationBehavior;


public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         toolbar = getSupportActionBar();

         BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

         navigation.setOnNavigationItemReselectedListener(mOnNavigationItemSelectedListener);

         toolbar.setTitle("Shop");
    }

    private BottomNavigationView.OnNavigationItemReselectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemReselectedListener() {
        //Permite que el titulo de la barra de navegacion cambie dependiendo de el elemento seleccionado
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()){
                case R.id.navigation_shop:
                    toolbar.setTitle("Shop");
                    return true;
                case R.id.navigation_gifts:
                    toolbar.setTitle("My Gifts");
                    return true;
                case R.id.navigation_cart:
                    toolbar.setTitle("Cart");
                    return true;
                case R.id.navigation_profile:
                    toolbar.setTitle("Profile");
                    return true;
            }
            return false;
        }
    };

}
