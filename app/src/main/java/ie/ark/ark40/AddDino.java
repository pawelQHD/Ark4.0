package ie.ark.ark40;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.view.View;
import android.widget.Toast;

import ie.ark.ark40.ie.ark.models.Dino;

public class AddDino extends Base {

    private EditText dinoType;
    private EditText dinoName;
    private NumberPicker lvlPicker;
    private Button buttonAdd;
    private EditText lvlNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dino);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dinoName = (EditText) findViewById(R.id.dinoName);
        dinoType = (EditText) findViewById(R.id.dinoType);
        lvlPicker = (NumberPicker) findViewById(R.id.lvlPicker);
        lvlNumber = (EditText) findViewById(R.id.lvlNumber);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);

        lvlPicker.setMinValue(0);
        lvlPicker.setMaxValue(300);
    }
    public void addButtonPressed (View view)
    {
        Toast.makeText(this, "Dino Added", Toast.LENGTH_SHORT).show();
        String type = dinoType.getText().toString();
        String name = dinoName.getText().toString();

        int lvlPassed =  lvlPicker.getValue();
        if (lvlPassed == 0)
        {
            String text = lvlNumber.getText().toString();
            if (!text.equals(""))
                lvlPassed = Integer.parseInt(text);
        }

        newDino(new Dino(type, name, lvlPassed));
    }
}

