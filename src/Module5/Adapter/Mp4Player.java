package Module5.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Воспроизведение mp4 файла: " + fileName);
    }
}
