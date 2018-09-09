package ng.edu.oouagoiwoye.musicapp2;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {
    TextView sTitle;
    TextView sDuration;
    TextView sArtist;
    ImageView sAlbumArt;
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int albumArt;
        String title;
        String duration;
        String artist;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        albumArt = getIntent().getIntExtra("albumArt", R.drawable.simi_smile_for_me);
        title = getIntent().getStringExtra("title");
        duration = getIntent().getStringExtra("duration");
        artist = getIntent().getStringExtra("artist");
        sTitle = findViewById(R.id.title);
        sTitle.setText("Now Playing "+title) ;
        setTitle(title);

        sDuration = findViewById(R.id.duration);
        sDuration.setText(duration) ;
        sArtist = findViewById(R.id.artist);
        sArtist.setText(artist);
        sAlbumArt = (ImageView) findViewById(R.id.albumart);
        sAlbumArt.setImageResource(albumArt);




    }


}
