package games.emilent.namethatcountry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import games.emilent.namethatcountry.continents.AfricaActivity;
import games.emilent.namethatcountry.continents.AllActivity;
import games.emilent.namethatcountry.continents.AsiaActivity;
import games.emilent.namethatcountry.continents.EuropeActivity;
import games.emilent.namethatcountry.continents.NorthAmericaActivity;
import games.emilent.namethatcountry.continents.OceaniaActivity;
import games.emilent.namethatcountry.continents.SouthAmericaActivity;


public class GenresActivity extends Activity {
    Button asiab, africab, europeb, namericab, samericab, oceaniab, allb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        asiab = (Button) findViewById(R.id.asiabutton);
        africab = (Button) findViewById(R.id.africabutton);
        europeb = (Button) findViewById(R.id.europebutton);
        namericab = (Button) findViewById(R.id.namericabutton);
        samericab = (Button) findViewById(R.id.samericabutton);
        oceaniab = (Button) findViewById(R.id.oceaniabutton);
        allb = (Button) findViewById(R.id.allbutton);

        asiab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenresActivity.this, AsiaActivity.class));
            }
        });

        africab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Buttons are working");
                startActivity(new Intent(GenresActivity.this, AfricaActivity.class));
            }
        });

        europeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenresActivity.this, EuropeActivity.class));

            }
        });

        namericab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenresActivity.this, NorthAmericaActivity.class));

            }
        });

        samericab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenresActivity.this, SouthAmericaActivity.class));

            }
        });

        oceaniab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenresActivity.this, OceaniaActivity.class));

            }
        });

        allb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenresActivity.this, AllActivity.class));

            }
        });


    }
}
