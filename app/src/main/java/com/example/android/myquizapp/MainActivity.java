package com.example.android.myquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Create and initialize the variables to avoid null error when using if status to check for validation
    Boolean checkboxMars = false, checkboxMoon = false, checkboxMercury = false, checkboxVenus = false, checkboxStar = false,
            checkboxSpain = false, checkboxArgentina = false, checkboxBrazil = false, checkboxGermany = false;

    // check the number of checkboxes checked
    int checkboxPlanetsCount = 0, checkboxWorldCupCount = 0;
    Button submitButton, resetButton;
    RadioGroup radioGroupSolarPower, radioGroupEiffelTower, radioGroupEarthLayer,
            radioGroupStatues, radioGroupRom, radioGroupNigeria;
    EditText lion, worldTradeCenter;
    ArrayList<String> wrongAnswers = new ArrayList<String>();
    private int correctAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove focus from the EditText when the app loads
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        submitButton = findViewById(R.id.submit_button);
        resetButton = findViewById(R.id.reset_button);
        lion = findViewById(R.id.lion);
        worldTradeCenter = findViewById(R.id.world_trade_center);
        radioGroupSolarPower = findViewById(R.id.radio_group_solar_power);
        radioGroupEiffelTower = findViewById(R.id.radio_group_eiffel_tower);
        radioGroupEarthLayer = findViewById(R.id.radio_group_earth_layer);
        radioGroupStatues = findViewById(R.id.radio_group_statues);
        radioGroupRom = findViewById(R.id.radio_group_rom);
        radioGroupNigeria = findViewById(R.id.radio_group_nigeria);

        // When the submit button is clicked it should do the grading
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade();
            }
        });

        // Reset button
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetButton.setVisibility(View.INVISIBLE);
                submitButton.setVisibility(View.VISIBLE);
                // reset all fields
                correctAnswers = 0;
                final CheckBox checkboxMars1 = findViewById(R.id.checkbox_mars);
                if (checkboxMars1.isChecked()) {
                    checkboxMars1.setChecked(false);
                }
                final CheckBox checkboxMoon1 = findViewById(R.id.checkbox_moon);
                if (checkboxMoon1.isChecked()) {
                    checkboxMoon1.setChecked(false);
                }
                final CheckBox checkboxMercury1 = findViewById(R.id.checkbox_mercury);
                if (checkboxMercury1.isChecked()) {
                    checkboxMercury1.setChecked(false);
                }
                final CheckBox checkboxVenus1 = findViewById(R.id.checkbox_venus);
                if (checkboxVenus1.isChecked()) {
                    checkboxVenus1.setChecked(false);
                }
                final CheckBox checkboxStar1 = findViewById(R.id.checkbox_star);
                if (checkboxStar1.isChecked()) {
                    checkboxStar1.setChecked(false);
                }

                lion.setText("");
                radioGroupSolarPower.clearCheck();
                radioGroupEiffelTower.clearCheck();
                radioGroupEarthLayer.clearCheck();
                radioGroupStatues.clearCheck();
                radioGroupRom.clearCheck();
                radioGroupNigeria.clearCheck();

                final CheckBox checkboxSpain1 = findViewById(R.id.checkbox_spain);
                if (checkboxSpain1.isChecked()) {
                    checkboxSpain1.setChecked(false);
                }
                final CheckBox checkboxArgentina1 = findViewById(R.id.checkbox_argentina);
                if (checkboxArgentina1.isChecked()) {
                    checkboxArgentina1.setChecked(false);
                }
                final CheckBox checkboxBrazil1 = findViewById(R.id.checkbox_brazil);
                if (checkboxBrazil1.isChecked()) {
                    checkboxBrazil1.setChecked(false);
                }
                final CheckBox checkboxGermany1 = findViewById(R.id.checkbox_germany);
                if (checkboxGermany1.isChecked()) {
                    checkboxGermany1.setChecked(false);
                }

                worldTradeCenter.setText("");
                checkboxMars = false;
                checkboxMoon = false;
                checkboxMercury = false;
                checkboxVenus = false;
                checkboxStar = false;
                checkboxSpain = false;
                checkboxArgentina = false;
                checkboxBrazil = false;
                checkboxGermany = false;
                checkboxWorldCupCount = 0;
            }
        });
    }

    /**
     * Get the clicked event of Planet checkboxes
     *
     * @param view
     */
    public void onCheckboxPlanetClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_mars:
                if (checked) {
                    // if checked, change checkboxMars to true
                    checkboxMars = true;
                    checkboxPlanetsCount++;
                } else {
                    // if unchecked, change checkboxMars to false
                    checkboxMars = false;
                    checkboxPlanetsCount--;
                }

                break;
            case R.id.checkbox_moon:
                if (checked) {
                    // if checked, change checkboxMoon to true
                    checkboxMoon = true;
                    checkboxPlanetsCount++;
                } else {
                    // if unchecked, change checkboxMars to false
                    checkboxMoon = false;
                    checkboxPlanetsCount--;
                }
                break;

            case R.id.checkbox_mercury:
                if (checked) {
                    // if checked, change checkboxMercury to true
                    checkboxMercury = true;
                    checkboxPlanetsCount++;
                } else {
                    // if unchecked, change checkboxMercury to false
                    checkboxMercury = false;
                    checkboxPlanetsCount--;
                }
                break;

            case R.id.checkbox_venus:
                if (checked) {
                    // if checked, change checkboxVenus to true
                    checkboxVenus = true;
                    checkboxPlanetsCount++;
                } else {
                    // if unchecked, change checkboxVenus to false
                    checkboxVenus = false;
                    checkboxPlanetsCount--;
                }
                break;

            case R.id.checkbox_star:
                if (checked) {
                    // if checked, change checkboxStar to true
                    checkboxStar = true;
                    checkboxPlanetsCount++;
                } else {
                    // if unchecked, change checkboxStar to false
                    checkboxStar = false;
                    checkboxPlanetsCount--;
                }
                break;
        }
    }

    /**
     * Get the clicked event of World Cup checkboxes
     *
     * @param view
     */
    public void onCheckboxWorldCup(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_spain:
                if (checked) {
                    // if checked, change checkboxMars to true
                    checkboxSpain = true;
                    checkboxWorldCupCount++;
                } else {
                    // if unchecked, change checkboxMars to false
                    checkboxSpain = false;
                    checkboxWorldCupCount--;
                }

                break;
            case R.id.checkbox_argentina:
                if (checked) {
                    // if checked, change checkboxMoon to true
                    checkboxArgentina = true;
                    checkboxWorldCupCount++;
                } else {
                    // if unchecked, change checkboxMars to false
                    checkboxArgentina = false;
                    checkboxWorldCupCount--;
                }
                break;

            case R.id.checkbox_brazil:
                if (checked) {
                    // if checked, change checkboxMercury to true
                    checkboxBrazil = true;
                    checkboxWorldCupCount++;
                } else {
                    // if unchecked, change checkboxMercury to false
                    checkboxBrazil = false;
                    checkboxWorldCupCount--;
                }
                break;

            case R.id.checkbox_germany:
                if (checked) {
                    // if checked, change checkboxVenus to true
                    checkboxGermany = true;
                    checkboxWorldCupCount++;
                } else {
                    // if unchecked, change checkboxVenus to false
                    checkboxGermany = false;
                    checkboxWorldCupCount--;
                }
                break;

        }
    }

    public void grade() {
        // set the correctAnswer variable to 0 before grading
        correctAnswers = 0;

        final String lionText = lion.getText().toString();
        final String worldTradeCenterText = worldTradeCenter.getText().toString();

        // get all the values from the RadioButton
        int selectedRadioButtonSolarPowerId = radioGroupSolarPower.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonSolarPower = findViewById(selectedRadioButtonSolarPowerId);

        int selectedRadioButtonEiffelTowerId = radioGroupEiffelTower.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonEiffelTower = findViewById(selectedRadioButtonEiffelTowerId);

        int selectedRadioButtonEarthLayerId = radioGroupEarthLayer.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonEarthLayer = findViewById(selectedRadioButtonEarthLayerId);

        int selectedRadioButtonStatuesId = radioGroupStatues.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonStatues = findViewById(selectedRadioButtonStatuesId);

        int selectedRadioButtonRomId = radioGroupRom.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonRom = findViewById(selectedRadioButtonRomId);

        int selectedRadioButtonNigeriaId = radioGroupNigeria.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonNigeria = findViewById(selectedRadioButtonNigeriaId);


        // if all passes validation then show the user his/her score
        // Answer 1
        if (checkboxMars && checkboxVenus && checkboxMercury || checkboxMars && checkboxVenus || checkboxMars && checkboxMercury || checkboxMercury && checkboxMars) {
            // answer is correct
            correctAnswers++;
        } else {
            wrongAnswers.add("Question 1, Answers are: Mars, Mercury, Venus");
        }
        // Answer 2
        if (lionText.equalsIgnoreCase("lion")) {
            correctAnswers++;
        } else {
            wrongAnswers.add("Question 2, Answers is: Lion");
        }
        // Answer 3
        if (selectedRadioButtonSolarPowerId > 0) {
            if (selectedRadioButtonSolarPower.getText().toString().equalsIgnoreCase("The Sun")) {
                correctAnswers++;
            } else {
                wrongAnswers.add("Question 3, Answers is: The Sun");
            }
        } else {
            wrongAnswers.add("Question 3, Answers is: The Sun");
        }
        // Answer 4
        if (selectedRadioButtonEiffelTowerId > 0) {
            if (selectedRadioButtonEiffelTower.getText().toString().equalsIgnoreCase("France")) {
                correctAnswers++;
            } else {
                wrongAnswers.add("Question 4, Answers is: France");
            }
        } else {
            wrongAnswers.add("Question 4, Answers is: France");
        }
        // Answer 5
        if (selectedRadioButtonEarthLayerId > 0) {
            if (selectedRadioButtonEarthLayer.getText().toString().equalsIgnoreCase("The Ozone Layer")) {
                correctAnswers++;
            } else {
                wrongAnswers.add("Question 5, Answers is: The Ozone Layer");
            }
        } else {
            wrongAnswers.add("Question 5, Answers is: The Ozone Layer");
        }
        // Answer 6
        if (selectedRadioButtonStatuesId > 0) {
            if (selectedRadioButtonStatues.getText().toString().equalsIgnoreCase("Statue of Liberty")) {
                correctAnswers++;
            } else {
                wrongAnswers.add("Question 6, Answers is: Statue of Liberty");
            }
        } else {
            wrongAnswers.add("Question 6, Answers is: Statue of Liberty");
        }
        // Answer 7
        if (selectedRadioButtonRomId > 0) {
            if (selectedRadioButtonRom.getText().toString().equalsIgnoreCase("Read Only Memory")) {
                correctAnswers++;
            } else {
                wrongAnswers.add("Question 7, Answers is: Read Only Memory");
            }
        } else {
            wrongAnswers.add("Question 7, Answers is: Read Only Memory");
        }
        // Answer 8
        if (selectedRadioButtonNigeriaId > 0) {
            if (selectedRadioButtonNigeria.getText().toString().equalsIgnoreCase("1963")) {
                correctAnswers++;
            } else {
                wrongAnswers.add("Question 8, Answers is: 1963");
            }
        } else {
            wrongAnswers.add("Question 8, Answers is: 1963");
        }
        // Answer 9
        if (checkboxArgentina && checkboxGermany) {
            // answer is correct
            correctAnswers++;
        } else {
            wrongAnswers.add("Question 9, Answers are: Argentina, Germany");
        }
        // Answer 10
        if (worldTradeCenterText.equalsIgnoreCase("2001")) {
            correctAnswers++;
        } else {
            wrongAnswers.add("Question 10, Answers is: 2001");
        }


        //collate all the answers and display it to the user
        if (correctAnswers == 10) {
            // hide the submit button
            submitButton.setVisibility(View.GONE);
            resetButton.setVisibility(View.VISIBLE);

            Toast.makeText(getApplicationContext(), "CONGRATULATIONS! You won the quiz, you got 10/10", Toast.LENGTH_LONG).show();
            return;
        }

        if (correctAnswers < 10) {
            // hide the submit button
            submitButton.setVisibility(View.GONE);
            resetButton.setVisibility(View.VISIBLE);

            // combine all the failed questions and show them to the user
            String wrongAnswersDisplay = "";
            for (String s : wrongAnswers) {
                wrongAnswersDisplay += s + "\t";
            }

            wrongAnswers.clear();
            Toast.makeText(getApplicationContext(), "Failed questions \n" + wrongAnswersDisplay + "\n\nYou got " + correctAnswers + "/10, you can try again.", Toast.LENGTH_LONG).show();
            return;
        }
    }
}
