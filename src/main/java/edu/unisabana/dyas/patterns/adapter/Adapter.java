package edu.unisabana.dyas.patterns.adapter;

import edu.unisabana.dyas.patterns.typeOf.typeOfAudio;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class Adapter implements AudioPlayer{
  AdvancedAudioPlayer advancedAudioPlayer = new AdvancedAudioPlayer();

  @Override
  public void play(typeOfAudio audioType, String fileName) {
    if (fileName.toLowerCase().contains("mp4")){
    System.out.println("Desde el adaptador mp4: " + audioType);
      advancedAudioPlayer.playMp4(fileName);
    } else if (fileName.toLowerCase().contains("vlc")){
    System.out.println("Desde el adaptador vlc: " + audioType);
      advancedAudioPlayer.playVlc(fileName);
    }else {
      throw new UnsupportedOperationException("Error al intentar 'play' en el adaptador.");
    }
  }

  @Override
  public void stop() {
    System.out.println("Desde el adaptador:");
    advancedAudioPlayer.stop();

  }

}

