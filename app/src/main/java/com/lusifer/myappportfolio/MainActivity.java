package com.lusifer.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bSpotify, bScore, bLibrary, bBuild, bXYZ, bCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        bSpotify.setOnClickListener(this);
        bScore.setOnClickListener(this);
        bLibrary.setOnClickListener(this);
        bBuild.setOnClickListener(this);
        bXYZ.setOnClickListener(this);
        bCapstone.setOnClickListener(this);
    }

    private void init() {
        bSpotify = (Button) findViewById(R.id.bSpotify);
        bScore = (Button) findViewById(R.id.bScore);
        bLibrary = (Button) findViewById(R.id.bLibrary);
        bBuild = (Button) findViewById(R.id.bBuild);
        bXYZ = (Button) findViewById(R.id.bXYZ);
        bCapstone = (Button) findViewById(R.id.bCapstone);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSpotify:
                Toast.makeText(this, "This button will launch my " + bSpotify.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bScore:
                Toast.makeText(this, "This button will launch my " + bScore.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bLibrary:
                Toast.makeText(this, "This button will launch my " + bLibrary.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bBuild:
                Toast.makeText(this, "This button will launch my " + bBuild.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bXYZ:
                Toast.makeText(this, "This button will launch my " + bXYZ.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bCapstone:
                Toast.makeText(this, "This button will launch my " + bCapstone.getText().toString(), Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
