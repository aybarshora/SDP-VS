package AdapterPattern;

class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        System.out.println("Playing VLC file: " + filename);
    }

    @Override
    public void playMP4(String filename) {
        // Do nothing for MP4 in VLC player
    }
}
