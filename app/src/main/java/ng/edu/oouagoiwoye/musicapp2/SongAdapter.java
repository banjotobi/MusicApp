package ng.edu.oouagoiwoye.musicapp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public final class SongAdapter extends ArrayAdapter<Song>  {
    MediaPlayer mPlayer;
    private ArrayList<Song> dataSet;
    Context mContext;

    public SongAdapter(Activity context, ArrayList<Song> songs)
    {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Song song = getItem(position);
        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView artist = (TextView) convertView.findViewById(R.id.artist);
        ImageView art = (ImageView) convertView.findViewById(R.id.art);


        //TextView duration = (TextView) convertView.findViewById(R.id.duration);
        TextView title = (TextView) convertView.findViewById(R.id.title);


        // Populate the data into the template view using the data object

        artist.setText(song.getArtist());
       // duration.setText(song.getDuration());
        title.setText(song.getTitle());
        art.setImageResource(song.getAlbumArt());

        title.setTag(position);
        //listitem
        RelativeLayout btButton = (RelativeLayout) convertView.findViewById(R.id.listitem);
        btButton.setTag(position);
        // Attach the click event handler
        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                // Access the row position here to get the correct data item
                Song song = getItem(position);
                // Do what you want here...
                Toast.makeText(getContext(), "Title of the Song is \n" + song.getTitle(),
                        Toast.LENGTH_SHORT).show();

                if (mPlayer != null) {
                    mPlayer.stop();
                    mPlayer.reset();
                    mPlayer.release();
                }

                mPlayer    = MediaPlayer.create(getContext(), song.getMFile());
                //mPlayer.pause();
                mPlayer.start();

                Intent intent = new Intent(getContext(), NowPlaying.class);
                //Bitmap _bitmap;
                //EditText editText = (EditText) findViewById(R.id.editText);
                //String message = editText.getText().toString();
                intent.putExtra("artist", song.getArtist());
               // intent.putExtra("art",song.getAlbumArt());
                int art = song.getAlbumArt();
                intent.putExtra("albumArt", song.getAlbumArt());
                intent.putExtra("duration", song.getDuration());
                intent.putExtra("title", song.getTitle());

               getContext().startActivity(intent);

            }
        });
        //title.setTypeface(bold);
        //title.setTextSize(16);



        return convertView;
    }
}
