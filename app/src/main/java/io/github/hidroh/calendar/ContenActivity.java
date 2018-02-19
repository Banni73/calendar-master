package io.github.hidroh.calendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContenActivity extends AppCompatActivity {
    ImageView Calender;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conten);


        ImageView Calendar= (ImageView) findViewById(R.id.btncal);
        Calendar.setImageResource(R.drawable.calender);
        Calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(getApplicationContext(),DetailActivity.class);
                startActivity(i);
            }
        });
    }
}
