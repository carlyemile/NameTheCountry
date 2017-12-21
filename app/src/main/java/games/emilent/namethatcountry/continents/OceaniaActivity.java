package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class OceaniaActivity extends LevelGame {

    private String[] names = {"", "AUSTRALIA", "KIRIBATI", "PALAU", "MARSHALL ISLANDS", "FIJI", "TONGA", "VANUATU", "MICRONESIA", "SAMOA", "SOLOMON ISLANDS", "NEW ZEALAND", "TUVALU", "NAURU"};
    private int[] images = {0, R.drawable.australia, R.drawable.kiribati, R.drawable.palau, R.drawable.marshallislands, R.drawable.fiji, R.drawable.tonga, R.drawable.vanuatu, R.drawable.micronesia, R.drawable.samoa, R.drawable.solomonislands, R.drawable.newzealand, R.drawable.tuvalu, R.drawable.nauru};

    public OceaniaActivity() {
        super();
        setAttributes("Oceania", names, images, R.drawable.oceaniabg);
    }
}
