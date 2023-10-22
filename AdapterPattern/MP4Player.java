package AdapterPattern;

class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        // Do nothing for VLC in MP4 player
    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}