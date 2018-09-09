package ng.edu.oouagoiwoye.musicapp2;

public class Song {

    private String title;
    private String duration;
    private String artist;
    private int albumArt;
    private int mFile;

    public Song(String nTitle, String nDuration, String nArtist, int nImage, int nFile)
    {
        title = nTitle;
        duration = nDuration;
        artist = nArtist;
        albumArt = nImage;
        mFile = nFile;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDuration()
    {
        return duration;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getAlbumArt()
    {
        return albumArt;
    }

    public int getMFile()
    {
        return mFile;
    }

}
