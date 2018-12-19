package com.example.arafat.passdatafromacitivitytofragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewFragment newFragment = new NewFragment();
        Bundle args = new Bundle();
        args.putString("argText", "example text");
        args.putInt("argNumber", 123);
        newFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, newFragment)
                .commit();
    }
}
