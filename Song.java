public class Song
{
    
    String Artist;
    String SongName;
    String Genre;
    String YearOfRelease;
    String TotalPlayingTime;

    public Song()
    {

    }


    public Song(String artist, String songName, String genre, String yearOfRelease, String totalPlayingTime) {
        Artist = artist;
        SongName = songName;
        Genre = genre;
        YearOfRelease = yearOfRelease;
        TotalPlayingTime = totalPlayingTime;
    }


    public String getArtist() {
        return Artist;
    }


    public void setArtist(String artist) {
        Artist = artist;
    }


    public String getSongName() {
        return SongName;
    }


    public void setSongName(String songName) {
        SongName = songName;
    }


    public String getGenre() {
        return Genre;
    }


    public void setGenre(String genre) {
        Genre = genre;
    }


    public String getYearOfRelease() {
        return YearOfRelease;
    }


    public void setYearOfRelease(String yearOfRelease) {
        YearOfRelease = yearOfRelease;
    }


    public String getTotalPlayingTime() {
        return TotalPlayingTime;
    }


    public void setTotalPlayingTime(String totalPlayingTime) {
        TotalPlayingTime = totalPlayingTime;
    }


    @Override
    public String toString() {
        return "Song [Artist=" + Artist + ", Genre=" + Genre + ", SongName=" + SongName + ", TotalPlayingTime="
                + TotalPlayingTime + ", YearOfRelease=" + YearOfRelease + "]";
    }

    

    
    
}
