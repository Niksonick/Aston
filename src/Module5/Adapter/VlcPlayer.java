package Module5.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Воспроизведение vlc файла: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
