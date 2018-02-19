package io.github.hidroh.calendar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewsActivity extends AppCompatActivity {
    Button berita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        berita=findViewById(R.id.berita);


        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW);
                String urllink="http://www.kompas.com";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }
}
