package games.emilent.namethatcountry.continents;

import games.emilent.namethatcountry.R;

public class AllActivity extends LevelGame {

    private String[] africanames = {"", "NIGERIA", "ETHIOPIA", "EGYPT", "TANZANIA", "SOUTH AFRICA", "KENYA", "SUDAN", "UGANDA", "ALGERIA", "MOROCCO", "MOZAMBIQUE", "GHANA", "ANGOLA", "MADAGASCAR", "CAMEROON", "COTE DIVOIRE", "NIGER", "BURKINA FASO", "MALI", "MALAWI", "ZAMBIA", "ZIMBABWE", "SENEGAL", "CHAD", "GUINEA", "SOUTH SUDAN", "RWANDA", "BURUNDI", "TUNISIA", "BENIN", "SOMALIA", "TOGO", "SIERRA LEONE", "LIBYA", "ERITREA", "CENTRAL AFRICAN REPUBLIC", "LIBERIA", "MAURITANIA", "NAMIBIA", "BOTSWANA", "LESOTHO", "GAMBIA", "GUINEA BISSAU", "GABON", "SWAZILAND", "MAURITIUS", "DJIBOUTI", "EQUATORIAL GUINEA", "COMOROS", "WESTERN SAHARA", "CABO VERDE", "SAO TOME AND PRINCIPE", "SEYCHELLES"};
    private int[] africaimages = {0, R.drawable.nigeria, R.drawable.ethiopia, R.drawable.egypt, R.drawable.tanzania, R.drawable.southafrica, R.drawable.kenya, R.drawable.sudan, R.drawable.uganda, R.drawable.algeria, R.drawable.morocco, R.drawable.mozambique, R.drawable.ghana, R.drawable.angola, R.drawable.madagascar, R.drawable.cameroon, R.drawable.cotedivoire, R.drawable.niger, R.drawable.burkinafaso, R.drawable.mali, R.drawable.malawi, R.drawable.zambia, R.drawable.zimbabwe, R.drawable.senegal, R.drawable.chad, R.drawable.guinea, R.drawable.rwanda, R.drawable.burundi, R.drawable.tunisia, R.drawable.benin, R.drawable.somalia, R.drawable.togo, R.drawable.sierraleone, R.drawable.libya, R.drawable.eritrea, R.drawable.centralafricanrepublic, R.drawable.liberia, R.drawable.mauritania, R.drawable.namibia, R.drawable.botswana, R.drawable.lesotho, R.drawable.gambia, R.drawable.guineabissau, R.drawable.gabon, R.drawable.swaziland, R.drawable.mauritius, R.drawable.djibouti, R.drawable.equatorialguinea, R.drawable.comoros, R.drawable.westernsahara, R.drawable.caboverde, R.drawable.saotomeandprincipe, R.drawable.seychelles};

    private String[] asianames = {"", "CHINA", "INDIA", "INDONESIA", "PAKISTAN", "BANGLADESH", "JAPAN", "PHILIPPINES", "VIETNAM", "IRAN", "TURKEY", "THAILAND", "SOUTH KOREA", "IRAQ", "AFGHANISTAN", "SAUDI ARABIA", "MALAYSIA", "UZBEKISTAN", "NEPAL", "YEMEN", "NORTH KOREA", "TAIWAN", "SRI LANKA", "SYRIA", "KAZAKHSTAN", "CAMBODIA", "AZERBAIJAN", "UNITED ARAB EMIRATES", "TAJIKISTAN", "ISRAEL", "JORDAN", "LAOS", "KYRGYZSTAN", "LEBANON", "SINGAPORE", "TURKMENISTAN", "OMAN", "KUWAIT", "GEORGIA", "MONGOLIA", "ARMENIA", "QATAR", "BAHRAIN", "TIMOR LESTE", "CYPRUS", "BHUTAN", "BRUNEI", "MALDIVES"};
    private int[] asiaimages = {0, R.drawable.china, R.drawable.india, R.drawable.indonesia, R.drawable.pakistan, R.drawable.bangladesh, R.drawable.japan, R.drawable.philippines, R.drawable.vietnam, R.drawable.iran, R.drawable.turkey, R.drawable.thailand, R.drawable.southkorea, R.drawable.iraq, R.drawable.afghanistan, R.drawable.saudiarabia, R.drawable.malaysia, R.drawable.uzbekistan, R.drawable.nepal, R.drawable.yemen, R.drawable.northkorea, R.drawable.taiwan, R.drawable.srilanka, R.drawable.syria, R.drawable.kazakhstan, R.drawable.cambodia, R.drawable.azerbaijan, R.drawable.unitedarabemirates, R.drawable.tajikistan, R.drawable.israel, R.drawable.jordan, R.drawable.laos, R.drawable.kyrgyzstan, R.drawable.lebanon, R.drawable.singapore, R.drawable.turkmenistan, R.drawable.oman, R.drawable.kuwait, R.drawable.georgia, R.drawable.mongolia, R.drawable.armenia, R.drawable.qatar, R.drawable.bahrain, R.drawable.timorleste, R.drawable.cyprus, R.drawable.bhutan, R.drawable.brunei, R.drawable.maldives};

    private String[] europenames = {"", "RUSSIA", "GERMANY", "UNITED KINGDOM", "FRANCE", "ITALY", "SPAIN", "UKRAINE", "POLAND", "ROMANIA", "NETHERLANDS", "BELGIUM", "GREECE", "CZECH REPUBLIC", "PORTUGAL", "SWEDEN", "HUNGARY", "SERBIA", "AUSTRIA", "SWITZERLAND", "BULGARIA", "DENMARK", "FINLAND", "SLOVAKIA", "NORWAY", "IRELAND", "CROATIA", "MOLDOVA", "BOSNIA", "ALBANIA", "LITHUANIA", "MACEDONIA", "SLOVENIA", "LATVIA", "ESTONIA", "MONTENEGRO", "LUXEMBOURG", "MALTA", "ICELAND", "ANDORRA", "LIECHTENSTEIN", "MONACO", "SAN MARINO"};
    private int[] europeimages = {0, R.drawable.russia, R.drawable.germany, R.drawable.unitedkingdom, R.drawable.france, R.drawable.italy, R.drawable.spain, R.drawable.ukraine, R.drawable.poland, R.drawable.romania, R.drawable.netherlands, R.drawable.belgium, R.drawable.greece, R.drawable.czechrepublic, R.drawable.portugal, R.drawable.sweden, R.drawable.hungary, R.drawable.serbia, R.drawable.austria, R.drawable.switzerland, R.drawable.denmark, R.drawable.finland, R.drawable.slovakia, R.drawable.norway, R.drawable.ireland, R.drawable.croatia, R.drawable.moldova, R.drawable.albania, R.drawable.lithuania, R.drawable.macedonia, R.drawable.slovenia, R.drawable.latvia, R.drawable.estonia, R.drawable.montenegro, R.drawable.luxembourg, R.drawable.malta, R.drawable.iceland, R.drawable.andorra, R.drawable.liechtenstein, R.drawable.monaco, R.drawable.sanmarino};

    private String[] namericanames = {"", "UNITED STATES", "MEXICO", "CANADA", "GUATEMALA", "CUBA", "DOMINICAN REPUBLIC", "HAITI", "HONDURAS", "EL SALVADOR", "NICARAGUA", "COSTA RICA", "PANAMA", "PUERTO RICO", "JAMAICA", "TRINIDAD AND TOBAGO", "BAHAMAS", "BELIZE", "BARBADOS", "SAINT LUCIA", "DOMINICA", "CURACAO", "SAINT VINCENT", "GRENADA", "ARUBA", "ANTIGUA AND BARBUDA", "SAINT KITTS AND NEVIS"};
    private int[] namericaimages = {0, R.drawable.unitedstates, R.drawable.mexico, R.drawable.canada, R.drawable.guatemala, R.drawable.cuba, R.drawable.dominicanrepublic, R.drawable.haiti, R.drawable.honduras, R.drawable.elsalvador, R.drawable.nicaragua, R.drawable.costarica, R.drawable.panama, R.drawable.puertorico, R.drawable.jamaica, R.drawable.trinidadandtobago, R.drawable.bahamas, R.drawable.belize, R.drawable.barbados, R.drawable.saintlucia, R.drawable.dominica, R.drawable.curacao, R.drawable.saintvincent, R.drawable.grenada, R.drawable.aruba, R.drawable.antiguaandbarbuda, R.drawable.saintkittsandnevis};

    private String[] oceanianames = {"", "AUSTRALIA", "KIRIBATI", "PALAU", "MARSHALL ISLANDS", "FIJI", "TONGA", "VANUATU", "MICRONESIA", "SAMOA", "SOLOMON ISLANDS", "NEW ZEALAND", "TUVALU", "NAURU"};
    private int[] oceaniaimages = {0, R.drawable.australia, R.drawable.kiribati, R.drawable.palau, R.drawable.marshallislands, R.drawable.fiji, R.drawable.tonga, R.drawable.vanuatu, R.drawable.micronesia, R.drawable.samoa, R.drawable.solomonislands, R.drawable.newzealand, R.drawable.tuvalu, R.drawable.nauru};

    private String[] samericanames = {"", "BRAZIL", "COLOMBIA", "ARGENTINA", "VENEZUELA", "PERU", "CHILE", "ECUADOR", "BOLIVIA", "PARAGUAY", "URUGUAY", "GUYANA", "SURINAME", "FRENCH GUIANA"};
    private int[] samericaimages = {0, R.drawable.brazil, R.drawable.colombia, R.drawable.argentina, R.drawable.venezuela, R.drawable.peru, R.drawable.chile, R.drawable.ecuador, R.drawable.bolivia, R.drawable.paraguay, R.drawable.uruguay, R.drawable.guyana, R.drawable.suriname, R.drawable.frenchguiana};


    /**
     * AllActivity:
     * Combines each country in order of difficulty from each continent into one array
     */
    public AllActivity() {
        super();
        int size = africanames.length + asianames.length + europenames.length + namericanames.length + samericanames.length + oceanianames.length - 6;
        String[] names = new String[size];
        int[] images = new int[size];
        int i = 0;
        for (int j = 1; j < africanames.length; j++) {
            if (samericanames.length > j) {
                names[i] = samericanames[j];
                i++;
            }

            if (namericanames.length > j) {
                names[i] = namericanames[j];
                i++;
            }

            if (asianames.length > j) {
                names[i] = asianames[j];
                i++;
            }

            if (europenames.length > j) {
                names[i] = europenames[j];
                i++;
            }

            if (africanames.length > j) {
                names[i] = africanames[j];
                i++;
            }

            if (oceanianames.length > j) {
                names[i] = oceanianames[j];
                i++;
            }
        }

        i = 0;

        for (int j = 1; j < africaimages.length; j++) {
            if (samericaimages.length > j) {
                images[i] = samericaimages[j];
                i++;
            }

            if (namericaimages.length > j) {
                images[i] = namericaimages[j];
                i++;
            }

            if (asiaimages.length > j) {
                images[i] = asiaimages[j];
                i++;
            }

            if (europeimages.length > j) {
                images[i] = europeimages[j];
                i++;
            }

            if (africaimages.length > j) {
                images[i] = africaimages[j];
                i++;
            }

            if (oceaniaimages.length > j) {
                images[i] = oceaniaimages[j];
                i++;
            }
        }
        setAttributes("All", names, images, R.drawable.allbg);
    }
}
