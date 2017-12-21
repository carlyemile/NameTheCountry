package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class AfricaActivity extends LevelGame {

    private String[] names = {"", "NIGERIA", "ETHIOPIA", "EGYPT", "TANZANIA", "SOUTH AFRICA", "KENYA", "SUDAN", "UGANDA", "ALGERIA", "MOROCCO", "MOZAMBIQUE", "GHANA", "ANGOLA", "MADAGASCAR", "CAMEROON", "COTE DIVOIRE", "NIGER", "BURKINA FASO", "MALI", "MALAWI", "ZAMBIA", "ZIMBABWE", "SENEGAL", "CHAD", "GUINEA", "SOUTH SUDAN", "RWANDA", "BURUNDI", "TUNISIA", "BENIN", "SOMALIA", "TOGO", "SIERRA LEONE", "LIBYA", "ERITREA", "CENTRAL AFRICAN REPUBLIC", "LIBERIA", "MAURITANIA", "NAMIBIA", "BOTSWANA", "LESOTHO", "GAMBIA", "GUINEA BISSAU", "GABON", "SWAZILAND", "MAURITIUS", "DJIBOUTI", "EQUATORIAL GUINEA", "COMOROS", "WESTERN SAHARA", "CABO VERDE", "SAO TOME AND PRINCIPE", "SEYCHELLES"};
    private int[] images = {0, R.drawable.nigeria, R.drawable.ethiopia, R.drawable.egypt, R.drawable.tanzania, R.drawable.southafrica, R.drawable.kenya, R.drawable.sudan, R.drawable.uganda, R.drawable.algeria, R.drawable.morocco, R.drawable.mozambique, R.drawable.ghana, R.drawable.angola, R.drawable.madagascar, R.drawable.cameroon, R.drawable.cotedivoire, R.drawable.niger, R.drawable.burkinafaso, R.drawable.mali, R.drawable.malawi, R.drawable.zambia, R.drawable.zimbabwe, R.drawable.senegal, R.drawable.chad, R.drawable.guinea, R.drawable.rwanda, R.drawable.burundi, R.drawable.tunisia, R.drawable.benin, R.drawable.somalia, R.drawable.togo, R.drawable.sierraleone, R.drawable.libya, R.drawable.eritrea, R.drawable.centralafricanrepublic, R.drawable.liberia, R.drawable.mauritania, R.drawable.namibia, R.drawable.botswana, R.drawable.lesotho, R.drawable.gambia, R.drawable.guineabissau, R.drawable.gabon, R.drawable.swaziland, R.drawable.mauritius, R.drawable.djibouti, R.drawable.equatorialguinea, R.drawable.comoros, R.drawable.westernsahara, R.drawable.caboverde, R.drawable.saotomeandprincipe, R.drawable.seychelles};

    public AfricaActivity() {
        super();
        setAttributes("Africa", names, images, R.drawable.africabg);
    }
}
