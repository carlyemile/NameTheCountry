package games.emilent.namethatcountry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Button reset = (Button) findViewById(R.id.resetbutton);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
                Toast.makeText(SettingsActivity.this, "Your game has been reset", Toast.LENGTH_LONG).show();

            }
        });

        Button about = (Button) findViewById(R.id.aboutbutton);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, AboutActivity.class));

            }
        });
    }

    //clears all of user's progress
    public void resetGame() {
        getSharedPreferences("AfricaData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("AllData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("AsiaData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("EuropeData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("NorthAmericaData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("SouthAmericaData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("OceaniaData", Context.MODE_PRIVATE).edit().clear().commit();
        getSharedPreferences("MainData", Context.MODE_PRIVATE).edit().clear().commit();

    }
}
