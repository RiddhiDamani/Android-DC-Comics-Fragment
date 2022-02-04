package com.christopherhield.firstfragment;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the introductory fragment
        Fragment fragment = new IntroFragment();

        // Get the FragmentManager so we can update the fragment on the screen
        FragmentManager fm = getSupportFragmentManager();

        // Replace the fragment held by "contentFragment" with our
        // new Intro Fragment and display it
        FragmentTransaction transaction = fm.beginTransaction(); // Start fragment transaction
        transaction.replace(R.id.contentFragment, fragment); // Indicate the new fragment to display
        transaction.commit(); // Complete the replace operation

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.opt_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Get the FragmentManager so we can update the fragment on the screen
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction(); // Start fragment transaction
        Fragment fragment;

        if (item.getItemId() == R.id.fragment1) { // Selected fragment 1
            fragment =
                    FirstFragment.newInstance(getString(R.string.batman), R.drawable.batman);
            transaction.replace(R.id.contentFragment, fragment); //Container -> R.id.contentFragment
        } else if (item.getItemId() == R.id.fragment2) { // Selected fragment 2
            fragment =
                    SecondFragment.newInstance(getString(R.string.wonder_woman), R.drawable.wonderwoman);
            transaction.replace(R.id.contentFragment, fragment); //Container -> R.id.contentFragment
        } else if (item.getItemId() == R.id.fragment3) { // Selected fragment 3
            fragment =
                    ThirdFragment.newInstance(getString(R.string.iron_man), R.drawable.ironman, R.drawable.ironman2);
            transaction.replace(R.id.contentFragment, fragment); //Container -> R.id.contentFragment
        } else if (item.getItemId() == R.id.fragment4) { // Selected fragment 4
            fragment =
                    FourthFragment.newInstance(getString(R.string.black_panther), R.drawable.blackpanther, R.drawable.blackpanther);
            transaction.replace(R.id.contentFragment, fragment); //Container -> R.id.contentFragment
        } else if (item.getItemId() == R.id.fragment5) { // Selected fragment 4
            fragment =
                    FifthFragment.newInstance(getString(R.string.capt_marvel), R.drawable.capmarvel);
            transaction.replace(R.id.contentFragment, fragment); //Container -> R.id.contentFragment
        }

        transaction.commit(); // Complete the replace operation
        return true;
    }
}