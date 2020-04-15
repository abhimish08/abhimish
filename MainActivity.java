package com.example.stree_plus;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    /** Called when the user taps the Send button */


    public void login(View view)
        Intent intent = new Intent(this,NewAcivity.class);
        startActivity(intent);
    }
}

