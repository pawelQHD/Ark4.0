package ie.ark.ark40;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import ie.ark.ark40.ie.ark.models.Dino;

public class ViewDino extends Base {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_dino);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.dinoList);
        DinoAdapter adapter = new DinoAdapter(this, dinos);
        listView.setAdapter(adapter);
    }

}

class DinoAdapter extends ArrayAdapter<Dino>
{
    private Context context;
    public List<Dino> dinos;

    public DinoAdapter(Context context, List<Dino> dinos)
    {
        super(context, R.layout.row_dino, dinos);
        this.context = context;
        this.dinos = dinos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.row_dino, parent, false);
        Dino dino = dinos.get(position);
        TextView typeView = (TextView) view.findViewById(R.id.row_dinoType);
        TextView nameView = (TextView) view.findViewById(R.id.row_dinoName);
        TextView lvlView = (TextView) view.findViewById(R.id.row_dinoLvl);

        typeView.setText(dino.type);
        nameView.setText(dino.name);
        lvlView.setText("lvl " + dino.lvl);

        return view;
    }
    @Override
    public int getCount()
    {
        return dinos.size();
    }

}