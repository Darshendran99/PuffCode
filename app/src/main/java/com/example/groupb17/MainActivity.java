package com.example.groupb17;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate BottomNavigationView and NavController
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this,R.id.fragment);
        //Set ActionBar to follow layout
        NavigationUI.setupWithNavController(bottomNavigationView,navController);

    }
    // public void method to display Action bar name to corresponding fragments' name
    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}