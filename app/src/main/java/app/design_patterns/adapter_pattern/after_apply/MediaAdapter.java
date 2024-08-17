package app.design_patterns.adapter_pattern.after_apply;

import app.design_patterns.adapter_pattern.AdvancedMediaPlayer;
import app.design_patterns.adapter_pattern.MediaPlayerInterface;
import app.design_patterns.adapter_pattern.Mp4Player;
import app.design_patterns.adapter_pattern.VlcPlayer;

class MediaAdapter implements MediaPlayerInterface {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }

}
