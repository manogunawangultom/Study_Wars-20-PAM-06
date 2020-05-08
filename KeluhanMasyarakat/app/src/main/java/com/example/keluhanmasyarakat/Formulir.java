package com.example.keluhanmasyarakat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Formulir extends AppCompatActivity {
    @BindView(R.id.calendar)
        Button btnCalendar;
    @BindView(R.id.viewTanggal)
        TextView viewTanggal;
    Calendar myCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulir);

        ButterKnife.bind(this);
        myCalendar = Calendar.getInstance();

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(Formulir.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        myCalendar.set(Calendar.YEAR, year);
                        myCalendar.set(Calendar.MONTH, month);
                        myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                        String formatTanggal = "dd-MM-yyyy";
                        SimpleDateFormat sdf = new SimpleDateFormat(formatTanggal);
                        viewTanggal.setText(sdf.format(myCalendar.getTime()));
                    }
                },
                        myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
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
