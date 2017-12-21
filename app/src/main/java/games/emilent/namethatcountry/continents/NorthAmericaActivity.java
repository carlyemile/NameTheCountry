package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class NorthAmericaActivity extends LevelGame {

    private String[] names = {"", "UNITED STATES", "MEXICO", "CANADA", "GUATEMALA", "CUBA", "DOMINICAN REPUBLIC", "HAITI", "HONDURAS", "EL SALVADOR", "NICARAGUA", "COSTA RICA", "PANAMA", "PUERTO RICO", "JAMAICA", "TRINIDAD AND TOBAGO", "BAHAMAS", "BELIZE", "BARBADOS", "SAINT LUCIA", "DOMINICA", "CURACAO", "SAINT VINCENT", "GRENADA", "ARUBA", "ANTIGUA AND BARBUDA", "SAINT KITTS AND NEVIS"};
    private int[] images = {0, R.drawable.unitedstates, R.drawable.mexico, R.drawable.canada, R.drawable.guatemala, R.drawable.cuba, R.drawable.dominicanrepublic, R.drawable.haiti, R.drawable.honduras, R.drawable.elsalvador, R.drawable.nicaragua, R.drawable.costarica, R.drawable.panama, R.drawable.puertorico, R.drawable.jamaica, R.drawable.trinidadandtobago, R.drawable.bahamas, R.drawable.belize, R.drawable.barbados, R.drawable.saintlucia, R.drawable.dominica, R.drawable.curacao, R.drawable.saintvincent, R.drawable.grenada, R.drawable.aruba, R.drawable.antiguaandbarbuda, R.drawable.saintkittsandnevis};

    public NorthAmericaActivity() {
        super();
        setAttributes("NorthAmerica", names, images, R.drawable.namericabg);
    }
}
