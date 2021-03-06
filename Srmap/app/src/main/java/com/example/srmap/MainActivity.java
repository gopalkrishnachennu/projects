package com.example.srmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.srmap.dashboard.Srm;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity  {

    private static int SPLASH_TIME_OUT=3000;
    Handler handler;
    Runnable runnable;
    ImageView imageView;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= findViewById(R.id.img);
        imageView.animate().alpha(3000).setDuration(0);
        firebaseAuth=FirebaseAuth.getInstance();

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if ( firebaseAuth.getCurrentUser()!=null){
                    if (firebaseAuth.getCurrentUser().isEmailVerified()) {
                        Intent intent = new Intent(MainActivity.this, Srm.class);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                        finish();
                    }
                }else {
                    Intent intent =new Intent(MainActivity.this, Login.class);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                    finish();

                }




            }
        },3000);




    }


}