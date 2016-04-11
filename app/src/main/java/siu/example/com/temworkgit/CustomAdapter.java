package siu.example.com.temworkgit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Billy on 4/11/16.
 */
public class CustomAdapter extends ArrayAdapter<Actor> {
    List<Actor> actors;


    public CustomAdapter(Context context, ArrayList<Actor> actors) {
        super(context,-1, actors);
        this.actors = actors;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View actorsInfo = LayoutInflater.from(parent.getContext()).inflate(R.layout.actor_view, parent, false);
        TextView actorName = (TextView)actorsInfo.findViewById(R.id.actor_name_textView);
        TextView actorDOB = (TextView)actorsInfo.findViewById(R.id.actor_DOB_textView);
        TextView actorOscarWon = (TextView)actorsInfo.findViewById(R.id.actor_oscarsWon_textView);

        Actor actor = actors.get(position);
        actorName.setText(actor.getName());
        actorDOB.setText(actor.getDOB());

        actorOscarWon.setText(""+actor.getOscarWon());




        return actorsInfo;
    }
}
