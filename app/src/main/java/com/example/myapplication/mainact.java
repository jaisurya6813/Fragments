package com.example.myapplication;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;


public class mainact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout1);
    }


    public void selectFragment(View view) {


        Fragment fr;

        if(view == findViewById(R.id.FB1)) {
            fr = new fragment1();

        }
        else {
            fr = new fragment2();
        }

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_section, fr);

        fragmentTransaction.commit();
    }
}
