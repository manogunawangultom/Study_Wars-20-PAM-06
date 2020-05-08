package com.example.keluhanmasyarakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }


    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.about){
            startActivity(new Intent(this,About.class));
        }else if(item.getItemId()==R.id.dataKeluhan){
            startActivity(new Intent(this,DataKeluhan.class));
        }else if(item.getItemId()==R.id.formulir){
            startActivity(new Intent(this,Formulir.class));
        }else if(item.getItemId()==R.id.home){
            startActivity(new Intent(this,MainActivity.class));
        }
        return true;
    }
}
