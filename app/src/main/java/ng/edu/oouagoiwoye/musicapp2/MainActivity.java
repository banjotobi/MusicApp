package ng.edu.oouagoiwoye.musicapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("ON TOP SOUL SHOW", "51:02", "Chris Goldfinger",R.drawable.on_top_soul_show, R.raw.ariwo_ko));
        songs.add(new Song("Smile for Me", "4:24", "Simi",R.drawable.simi_smile_for_me, R.raw.ayinla));
        songs.add(new Song("Start All Over", "4:30", "Niniola ft. Johnny Drille",R.drawable.pemi, R.raw.my_dear));
        songs.add(new Song("SUMMER MIX WEEKEND", "53:35", "Unknown Artist",R.drawable.on_top_soul_show, R.raw.fargin ));
        songs.add(new Song("Romeo & Juliet","4:21", "Johnny Drille",R.drawable.mimi, R.raw.most_high));
        songs.add(new Song("I've Got my eyes on you","4:21", "Pemisola",R.drawable.pemi, R.raw.most_high));



        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);




    }


}
