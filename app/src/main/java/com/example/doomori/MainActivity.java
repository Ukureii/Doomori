package com.example.doomori;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.doomori.databinding.ActivityMainBinding;
import com.example.doomori.frag.AnimalsFragment;
import com.example.doomori.frag.AnnonceFragment;
import com.example.doomori.frag.ProfileFragment;
import com.example.doomori.frag.AVenirFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new AnnonceFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.send) {
                replaceFragment(new AVenirFragment());
            } else if (item.getItemId() == R.id.search) {
                replaceFragment(new AnnonceFragment());
            } else if (item.getItemId() == R.id.animals) {
                replaceFragment(new AnimalsFragment());
            } else if (item.getItemId() == R.id.profile) {
                replaceFragment(new ProfileFragment());
            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}