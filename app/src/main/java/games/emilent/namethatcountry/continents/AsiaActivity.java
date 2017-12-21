package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class AsiaActivity extends LevelGame {

    private String[] names = {"", "CHINA", "INDIA", "INDONESIA", "PAKISTAN", "BANGLADESH", "JAPAN", "PHILIPPINES", "VIETNAM", "IRAN", "TURKEY", "THAILAND", "SOUTH KOREA", "IRAQ", "AFGHANISTAN", "SAUDI ARABIA", "MALAYSIA", "UZBEKISTAN", "NEPAL", "YEMEN", "NORTH KOREA", "TAIWAN", "SRI LANKA", "SYRIA", "KAZAKHSTAN", "CAMBODIA", "AZERBAIJAN", "UNITED ARAB EMIRATES", "TAJIKISTAN", "ISRAEL", "JORDAN", "LAOS", "KYRGYZSTAN", "LEBANON", "SINGAPORE", "TURKMENISTAN", "OMAN", "KUWAIT", "GEORGIA", "MONGOLIA", "ARMENIA", "QATAR", "BAHRAIN", "TIMOR LESTE", "CYPRUS", "BHUTAN", "BRUNEI", "MALDIVES"};

    private int[] images = {0, R.drawable.china, R.drawable.india, R.drawable.indonesia, R.drawable.pakistan, R.drawable.bangladesh, R.drawable.japan, R.drawable.philippines, R.drawable.vietnam, R.drawable.iran, R.drawable.turkey, R.drawable.thailand, R.drawable.southkorea, R.drawable.iraq, R.drawable.afghanistan, R.drawable.saudiarabia, R.drawable.malaysia, R.drawable.uzbekistan, R.drawable.nepal, R.drawable.yemen, R.drawable.northkorea, R.drawable.taiwan, R.drawable.srilanka, R.drawable.syria, R.drawable.kazakhstan, R.drawable.cambodia, R.drawable.azerbaijan, R.drawable.unitedarabemirates, R.drawable.tajikistan, R.drawable.israel, R.drawable.jordan, R.drawable.laos, R.drawable.kyrgyzstan, R.drawable.lebanon, R.drawable.singapore, R.drawable.turkmenistan, R.drawable.oman, R.drawable.kuwait, R.drawable.georgia, R.drawable.mongolia, R.drawable.armenia, R.drawable.qatar, R.drawable.bahrain, R.drawable.timorleste, R.drawable.cyprus, R.drawable.bhutan, R.drawable.brunei, R.drawable.maldives};

    public AsiaActivity() {
        super();
        setAttributes("Asia", names, images, R.drawable.asiabg);
    }
}
