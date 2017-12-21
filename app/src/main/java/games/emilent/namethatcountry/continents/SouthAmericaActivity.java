package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class SouthAmericaActivity extends LevelGame {

    private String[] names = {"", "BRAZIL", "COLOMBIA", "ARGENTINA", "VENEZUELA", "PERU", "CHILE", "ECUADOR", "BOLIVIA", "PARAGUAY", "URUGUAY", "GUYANA", "SURINAME", "FRENCH GUIANA"};
    private int[] images = {0, R.drawable.brazil, R.drawable.colombia, R.drawable.argentina, R.drawable.venezuela, R.drawable.peru, R.drawable.chile, R.drawable.ecuador, R.drawable.bolivia, R.drawable.paraguay, R.drawable.uruguay, R.drawable.guyana, R.drawable.suriname, R.drawable.frenchguiana};

    public SouthAmericaActivity() {
        super();
        setAttributes("SouthAmerica", names, images, R.drawable.samericabg);
    }
}
