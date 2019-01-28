package com.alizhezi.base.navigation;

import android.os.Bundle;


import com.alizhezi.base.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;


public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        FragmentManager fragmentManager = getSupportFragmentManager();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.my_nav_host_fragment);


        NavController navController = navHostFragment.getNavController();

        NavigationUI.setupWithNavController(navigation,navController);



    }


    @Override
    public boolean onSupportNavigateUp() {



        return Navigation.findNavController(this,R.id.my_nav_host_fragment).navigateUp();

    }

}
