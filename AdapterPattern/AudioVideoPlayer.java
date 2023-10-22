package AdapterPattern;

class AudioVideoPlayer implements IMediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3") || filename.endsWith(".mp4") || filename.endsWith(".vlc")) {
            mediaAdapter = new MediaAdapter(filename.substring(filename.lastIndexOf('.') + 1));
            mediaAdapter.play(filename);
        } else {
            System.out.println("Invalid media file format: " + filename);
        }
    }
}