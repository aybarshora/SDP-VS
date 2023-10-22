package AdapterPattern;

public class AdapterExample {
    public static void main(String[] args) {
        IMediaPlayer mediaPlayer = new AudioVideoPlayer();

        mediaPlayer.play("song.mp3");
        mediaPlayer.play("movie.mp4");
        mediaPlayer.play("video.vlc");
        mediaPlayer.play("document.pdf");
    }
}