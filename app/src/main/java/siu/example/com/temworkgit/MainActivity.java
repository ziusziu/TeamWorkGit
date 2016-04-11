package siu.example.com.temworkgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CustomAdapter actorAdapter;
    ArrayList<Actor> actorLists;
    ListView actorListView;

    ArrayList<Actor> mActorsArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actorListView = (ListView)findViewById(R.id.main_actors_listView);

        actorLists = new ArrayList<>();
        Actor actorOne = new Actor("Leo DiCaprio", "Nov. 11, 1974", 1);
        Actor actorTwo = new Actor("Matt Damon", "Oct. 8, 1970", 1);
        Actor actorThree = new Actor("Jennifer Law", "Aug. 15, 1990", 2);

        actorLists.add(actorOne);
        actorLists.add(actorTwo);
        actorLists.add(actorThree);


        mActorsArrayList = new ArrayList<>();
        Actor actorFour = new Actor("Linda Chuong", "Aug. 1988", 2);
        Actor actorFive = new Actor("Andy Lau", "Aug. 1988", 10);
        Actor actorSix = new Actor("Jackie Chan", "Nov. 1988", 5);

        actorLists.add(actorFour);
        actorLists.add(actorFive);
        actorLists.add(actorSix);



        actorAdapter = new CustomAdapter(this, actorLists);
        actorListView.setAdapter(actorAdapter);


    }
}
