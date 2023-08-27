package iphone.mediaPlayer.music;

import java.util.List;

public interface MusicPlayer {
    public void tooglePlayerPause();
    public void fowardMusic();
    public void backwardMusic();
    public void changeMusic(Music mus);

    public void changePlaylist(List<Music> list);
}
