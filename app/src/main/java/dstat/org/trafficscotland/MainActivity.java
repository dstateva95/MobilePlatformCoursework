package dstat.org.trafficscotland;


/**
 * Created by Dilyana Stateva S1424665
 * */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.Context;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    public Button ButtonRoadworks;
    public Button ButtonIncidents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonRoadworks = (Button) findViewById(R.id.ButtonRoadworks);
        ButtonRoadworks.setOnClickListener(this);
        ButtonIncidents = (Button) findViewById(R.id.ButtonIncidents);
        ButtonIncidents.setOnClickListener(this);

    }

    public void onClick(View aView)
    {
        switch(aView.getId()) {
            case R.id.ButtonRoadworks:
                recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                FeedRoadworks feedRoadworks = new FeedRoadworks(this, recyclerView);
                feedRoadworks.execute();
                break;

            case R.id.ButtonIncidents:
                recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                FeedIncidents feedIncidents = new FeedIncidents(this, recyclerView);
                feedIncidents.execute();
                break;

        }
    }
}