package AdapterPattern;

class MediaAdapter implements IMediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VLCPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".vlc")) {
            advancedMediaPlayer.playVLC(filename);
        } else if (filename.endsWith(".mp4")) {
            advancedMediaPlayer.playMP4(filename);
        } else {
            System.out.println("Invalid media file format: " + filename);
        }
    }
}