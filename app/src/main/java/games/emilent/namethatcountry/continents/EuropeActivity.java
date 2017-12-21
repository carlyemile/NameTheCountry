package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class EuropeActivity extends LevelGame {

    private String[] names = {"", "RUSSIA", "GERMANY", "UNITED KINGDOM", "FRANCE", "ITALY", "SPAIN", "UKRAINE", "POLAND", "ROMANIA", "NETHERLANDS", "BELGIUM", "GREECE", "CZECH REPUBLIC", "PORTUGAL", "SWEDEN", "HUNGARY", "SERBIA", "AUSTRIA", "SWITZERLAND", "BULGARIA", "DENMARK", "FINLAND", "SLOVAKIA", "NORWAY", "IRELAND", "CROATIA", "MOLDOVA", "BOSNIA", "ALBANIA", "LITHUANIA", "MACEDONIA", "SLOVENIA", "LATVIA", "ESTONIA", "MONTENEGRO", "LUXEMBOURG", "MALTA", "ICELAND", "ANDORRA", "LIECHTENSTEIN", "MONACO", "SAN MARINO"};
    private int[] images = {0, R.drawable.russia, R.drawable.germany, R.drawable.unitedkingdom, R.drawable.france, R.drawable.italy, R.drawable.spain, R.drawable.ukraine, R.drawable.poland, R.drawable.romania, R.drawable.netherlands, R.drawable.belgium, R.drawable.greece, R.drawable.czechrepublic, R.drawable.portugal, R.drawable.sweden, R.drawable.hungary, R.drawable.serbia, R.drawable.austria, R.drawable.switzerland, R.drawable.denmark, R.drawable.finland, R.drawable.slovakia, R.drawable.norway, R.drawable.ireland, R.drawable.croatia, R.drawable.moldova, R.drawable.albania, R.drawable.lithuania, R.drawable.macedonia, R.drawable.slovenia, R.drawable.latvia, R.drawable.estonia, R.drawable.montenegro, R.drawable.luxembourg, R.drawable.malta, R.drawable.iceland, R.drawable.andorra, R.drawable.liechtenstein, R.drawable.monaco, R.drawable.sanmarino};


    public EuropeActivity() {
        super();
        setAttributes("Europe", names, images, R.drawable.europebg);
    }
}
