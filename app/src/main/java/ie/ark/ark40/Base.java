package ie.ark.ark40;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ie.ark.ark40.ie.ark.models.Dino;

import static ie.ark.ark40.R.id.action_carnivores;
import static ie.ark.ark40.R.menu.menu_all;

/**
 * Created by pawel on 31/10/2017.
 */

public class Base extends AppCompatActivity {

    public static List<Dino> dinos = new ArrayList<Dino>();

    public boolean newDino(Dino dino)
    {
        dinos.add(dino);
        return true;
    }


    public void buttonAchatina (View view)
    {
        Toast.makeText(this, "Achatina", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.achatina);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.achatina);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });

    }
    public void buttonAllosaurus (View view)
    {
        Toast.makeText(this, "Allosaurus", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.allosaurus);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.allosaurus);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });

    }
    public void buttonAnkylosaurus (View view)
    {
        Toast.makeText(this, "Ankylosaurus", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.ankylosaurus);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.ankylosaurus);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonArgentavis (View view)
    {
        Toast.makeText(this, "Argentavis", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.argentavis);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.argentavis);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonArthropluera (View view)
    {
        Toast.makeText(this, "Arthropluera", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.arthropluera);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.arthropluera);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonBeelzebufo (View view)
    {
        Toast.makeText(this, "Beelzebufo", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.beelzebufo);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.beelzebufo);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonBrontosaurus (View view)
    {
        Toast.makeText(this, "Brontosaurus", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.brontosaurus);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.brontosaurus);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonBroodmother (View view)
    {
        Toast.makeText(this, "Broodmother", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.broodmother);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.broodmother);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonCarbonemys (View view)
    {
        Toast.makeText(this, "Carbonemys", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.carbonemys);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.carbonemys);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonCarnotaurus (View view)
    {
        Toast.makeText(this, "Carnotaurus", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.carnotaurus);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.carnotaurus);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonCompy (View view)
    {
        Toast.makeText(this, "Compy", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.compy);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.compy);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }
    public void buttonDaeodon (View view)
    {
        Toast.makeText(this, "Daeodon", Toast.LENGTH_SHORT).show();
        //Audio Player
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.daeodon);

        ImageButton play_button = (ImageButton)this.findViewById(R.id.daeodon);
        play_button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)

            {
                mp.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(menu_all, menu);
        return true;
    }
    @Override
    public boolean onPrepareOptionsMenu (Menu menu){
        super.onPrepareOptionsMenu(menu);
        MenuItem all = menu.findItem(R.id.action_all);
        MenuItem carnivores = menu.findItem(R.id.action_carnivores);
        MenuItem herbivores = menu.findItem(R.id.action_herbivores);
        MenuItem addDino = menu.findItem(R.id.action_addDino);
        MenuItem viewDino = menu.findItem(R.id.action_viewDino);

        if(this instanceof All) {
            all.setVisible(false);
        }
        else if(this instanceof Carnivores)
        {
            carnivores.setVisible(false);
        }
        else if(this instanceof Herbivores)
        {
            herbivores.setVisible(false);
        }
        else if(this instanceof AddDino)
        {
            addDino.setVisible(false);
        }
        else if(this instanceof ViewDino)
        {
            viewDino.setVisible(false);
        }
        if(dinos.isEmpty())
            viewDino.setEnabled(false);
        else
            viewDino.setEnabled(true);

        return true;
    }

    public void all(MenuItem item)
    {
        startActivity (new Intent(this, All.class));
    }
    public void carnivores(MenuItem item)
    {
        startActivity (new Intent(this, Carnivores.class));
    }
    public void herbivores(MenuItem item)
    {
        startActivity (new Intent(this, Herbivores.class));
    }
    public void addDino(MenuItem item)
    {
        startActivity (new Intent(this, AddDino.class));
    }
    public void viewDino(MenuItem item)
    {
        startActivity (new Intent(this, ViewDino.class));
    }
}

