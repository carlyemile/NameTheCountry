package games.emilent.namethatcountry.continents;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import games.emilent.namethatcountry.R;
import games.emilent.namethatcountry.SettingsActivity;

import java.util.ArrayList;

public class LevelGame extends Activity {

    private ImageView countryImage, correct;
    private String[] names;
    private int[] images;
    private int background;
    private int available;
    private GridLayout letters;
    private String country;
    private GridLayout boxes;
    private Button next, pluscoins, redo, buyletter;
    private String continent;
    private int level;
    private TextView levelLabel;
    private LayoutInflater inflater;
    private int coins;
    private TextView coinCount;
    private PopupWindow coinsWindow;
    private MediaPlayer mp;
    private ArrayList<View> selectedLetters;
    private ArrayList<Integer> purchasedLetters;
    private boolean matched = false;

    public void setAttributes(String continent, String[] names, int[] images, int background) {
        this.names = names;
        this.images = images;
        this.background = background;
        this.continent = continent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getData();

        country = names[level];
        coinCount = (TextView) findViewById(R.id.coinCount);
        coinCount.setText(coins + "");
        boxes = (GridLayout) findViewById(R.id.gridLayout);
        countryImage = (ImageView) findViewById(R.id.countryImage);
        countryImage.setBackgroundResource(images[level]);
        RelativeLayout game = (RelativeLayout) findViewById(R.id.activity_game);
        game.setBackgroundResource(background);
        correct = (ImageView) findViewById(R.id.correct);

        next = (Button) findViewById(R.id.nextButton);
        pluscoins = (Button) findViewById(R.id.pluscoins);
        redo = (Button) findViewById(R.id.redo);
        buyletter = (Button) findViewById(R.id.buyletter);
        levelLabel = (TextView) findViewById(R.id.levelLabel);
        levelLabel.setText("Level " + level);
        next.setVisibility(View.INVISIBLE);
        boxes.setColumnCount(country.length());
        letters = (GridLayout) findViewById(R.id.letters1);
        inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        selectedLetters = new ArrayList<View>();
        purchasedLetters = new ArrayList<Integer>();
        createBoxes();

        boxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedLetters.size()>0 && !matched) {
                    View letterBox = selectedLetters.remove(selectedLetters.size() - 1);
                    letterBox.setVisibility(View.VISIBLE);
                    int i = available-1;
                    while(purchasedLetters.contains(i)){ // skips if current box is a purchased letter
                        i--;
                    }
                    ((TextView) boxes.getChildAt(i)).setText("");
                    available--;
                    while (purchasedLetters.contains(available)&&available>0) {//skips the space that contains a purchased letter
                        available--;
                    }

                }
            }
        });
        for (int i = 0; i < 18; i++) {
            letters.addView(inflater.inflate(R.layout.singleletter, letters, false));
        }
        randomLetters();
        available = 0; //keeps track of the current index of the next empty input box

        for (int i = 0; i < letters.getChildCount(); i++) {

            //sets the event listener of each letter box in the letter bank
            letters.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView currentBox = (TextView) boxes.getChildAt(available);
                    if (available < boxes.getChildCount()) {
                        Button clickedBox = (Button) v;
                        currentBox.setText(clickedBox.getText().toString()); //fills the next input box with the selected letter
                        clickedBox.setVisibility(View.INVISIBLE);
                        selectedLetters.add(clickedBox);
                        available++;
                        while (purchasedLetters.contains(available)&&available<boxes.getChildCount()) {//skips the space that contains a purchased letter
                            available++;
                        }
                    }

                    if (isAMatch()) {
                        matched = true;
                        playerWon();
                    } else if (available >= boxes.getChildCount())
                        wrong();

                }
            });
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });


        //in future implementation, user can choose to purchase coins or watch an advertisement video to gain 5 coins.
        pluscoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View customView = inflater.inflate(R.layout.coins_popup, null);

                coinsWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                coinsWindow.showAtLocation(findViewById(R.id.activity_game), Gravity.CENTER, 0, 0);

                Button videoBtn = (Button) customView.findViewById(R.id.videobtn);
                videoBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        saveData();
                    }
                });

                Button closeButton = (Button) customView.findViewById(R.id.closebutton);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        coinsWindow.dismiss();
                    }
                });
            }
        });

        redo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong();
            }
        });

        //if user clicks the buy letter button, user gets a correct letter filled in
        //they lose 20 coins for this purchase.
        buyletter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (coins >= 20) {
                    coins -= 20;
                    String countrynospace = country.replaceAll(" ", "");
                    TextView currentBox = (TextView) boxes.getChildAt(available);
                    String letter = countrynospace.charAt(available) + "";
                    currentBox.setText(letter);
                    View letterBox = letters.findViewWithTag(letter);
                    letterBox.setVisibility(View.INVISIBLE);
                    letterBox.setTag(""); //prevents the same box from being found if there are multiple occurrences of the same letter
                    purchasedLetters.add(available);
                    available++;
                    while (purchasedLetters.contains(available)&&available<boxes.getChildCount()) {//skips the space that contains a purchased letter
                        available++;
                    }
                    coinCount.setText(coins + "");

                    if (isAMatch()) {
                        matched = true;
                        playerWon();
                    } else if (available >= boxes.getChildCount())
                        wrong();

                } else {
                    Toast.makeText(LevelGame.this, "You do not have enough coins.", Toast.LENGTH_LONG).show();

                }

            }
        });


    } //end onCreate

    /**
     * saveData:
     * Saves the player's progress in the game
     */
    public void saveData() {
        SharedPreferences sharedPref = getSharedPreferences(continent + "Data", Context.MODE_PRIVATE);

        //for specific continent
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("level", level);
        editor.apply();

        //for all continents
        sharedPref = getSharedPreferences("MainData", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
        editor.putInt("coins", coins);
        editor.apply();
    }

    /**
     * getData:
     * Retrieve's the player's progress in the game
     */
    public void getData() {
        SharedPreferences sharedPref = getSharedPreferences(continent + "Data", Context.MODE_PRIVATE);
        level = sharedPref.getInt("level", 1);

        sharedPref = getSharedPreferences("MainData", Context.MODE_PRIVATE);
        coins = sharedPref.getInt("coins", 50);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        saveData();
    }

    /**
     * createBoxes:
     * Creates the boxes for the player to fill in
     */
    public void createBoxes() {
        int row = 0;
        int col = 0;
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == ' ') { //if the country contains more than one word, add to next row
                row++;
                col = 0;
                i++;
            }
            GridLayout.LayoutParams params;
            TextView curBox = new TextView(getApplicationContext());

            params = (GridLayout.LayoutParams) inflater.inflate(R.layout.singlebox, boxes, false).getLayoutParams();
            params.columnSpec = boxes.spec(col);
            params.rowSpec = boxes.spec(row);
            curBox.setBackgroundColor(Color.parseColor("#000000"));
            curBox.setTextColor(getResources().getColor(android.R.color.white));
            curBox.setGravity(Gravity.CENTER);
            curBox.setTypeface(null, Typeface.BOLD);


            boxes.addView(curBox, params);
            col++;
        }
    }

    /**
     * wrong:
     * If the player enter's the wrong phrase, the boxes are cleared and the letters are returned to their location
     * in the letter bank
     */
    public void wrong() {
        mp = MediaPlayer.create(this, R.raw.wrong);
        mp.start();
        for (int i = 0; i < boxes.getChildCount(); i++) {
            if(!purchasedLetters.contains(i)) {
                TextView curBox = (TextView) boxes.getChildAt(i);
                curBox.setText("");
            }
        }

        for (int i = 0; i < selectedLetters.size(); i++) {
            TextView letterBox = (TextView)selectedLetters.get(i);
            letterBox.setVisibility(View.VISIBLE);
            letterBox.setTag(letterBox.getText().toString());
        }
        available = 0;
        while(purchasedLetters.contains(available)){
            available++;
        }
        selectedLetters.clear();
    }

    /**
     * reset:
     * Used when the player has won and is able to move on to the next level.
     * Creates boxes for the player to fill in and creates a letter bank for the current country.
     * Also sets the current level and country flag.
     */
    public void reset() {
        matched = false;
        selectedLetters.clear();
        purchasedLetters.clear();
        level++;
        levelLabel.setText("Level " + level);
        country = names[level];
        boxes.removeAllViews();
        boxes.setColumnCount(country.length());
        createBoxes();
        available = 0;
        randomLetters();
        next.setVisibility(View.INVISIBLE);
        correct.setVisibility(View.INVISIBLE);
        countryImage.setBackgroundResource(images[level]);
    }

    /**
     * randInt:
     * Generates a random integer between a range (min, max).
     */
    public static int randInt(int min, int max) {

        int randomNum = min + (int) (Math.random() * ((max - min) + 1));

        return randomNum;
    }

    /**
     * randomLetters:
     * Generates boxes for the letters in the current country then generates extra letters to fulfill
     * a number of 18 letters in total in the letter bank.
     */
    public void randomLetters() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Integer> availableButtons = new ArrayList<>();
        ArrayList<Character> availableLetters = new ArrayList<>();

        String countrynospace = country.replaceAll(" ", "");

        for (int i = 0; i < alphabet.length(); i++) {
            availableLetters.add(alphabet.charAt(i));
        }
        for (int i = 0; i < 18; i++) {
            availableButtons.add(i); //keeps track of filled boxes in the word bank to prevent overwriting
        }

        //first, letters in the country name are randomly placed within the letter bank.
        for (int i = 0; i < countrynospace.length(); i++) {
            int rand = randInt(0, availableButtons.size() - 1);
            Button currentButton = (Button) letters.getChildAt(availableButtons.remove(rand)); // button is removed from available locations to prevent reselection
            currentButton.setText(countrynospace.charAt(i) + "");
            currentButton.setVisibility(View.VISIBLE);
            currentButton.setTag(countrynospace.charAt(i) + "");

            availableLetters.remove(Character.valueOf(countrynospace.charAt(i))); //letter is removed from alphabet to prevent duplicates
        }

        //then, random letters left in the alphabet are placed in the remaining spaces in the letter bank.
        for (int i = 0; i < availableButtons.size(); i++) {
            Button currentButton = (Button) letters.getChildAt(availableButtons.get(i));
            currentButton.setText(availableLetters.remove(randInt(0, availableLetters.size() - 1)) + "");
            currentButton.setVisibility(View.VISIBLE);
            currentButton.setTag(null);

        }

    }

    /**
     * isAMatch:
     * Checks if the letters filled in by the user match the country name
     */
    public boolean isAMatch() {
        boolean match = true;
        String countrynospace = country.replaceAll(" ", "");
        for (int i = 0; i < countrynospace.length(); i++) {
            TextView currentBox = (TextView) boxes.getChildAt(i);
            String currLetter = currentBox.getText().toString();
            if (currLetter.length() > 0) { //checks if the box is filled
                if (currLetter.charAt(0) != countrynospace.charAt(i)) { //checks if letter matches letter in country name
                    match = false;
                    break;
                }
            } else { //if box is not filled, no match
                match = false;
                break;
            }
        }
        return match;
    }

    /**
     * playerWon:
     * If the player is correct, the user gains 5 coins and the option to move to the next level appears.
     * It also displays a correct symbol.
     */
    public void playerWon() {
        mp = MediaPlayer.create(this, R.raw.correct);
        mp.start();
        correct.setVisibility(View.VISIBLE);
        if (level != names.length - 1)
            next.setVisibility(View.VISIBLE);
        coins += 5;
        coinCount.setText(coins + "");

    }
}
