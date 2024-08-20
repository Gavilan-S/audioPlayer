package edu.unisabana.dyas.patterns.adapter;

import edu.unisabana.dyas.patterns.typeOf.typeOfAudio;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class Adapter implements AudioPlayer{
  AdvancedAudioPlayer advancedAudioPlayer = new AdvancedAudioPlayer();

  @Override
  public void play(typeOfAudio audioType, String fileName) {
    if (fileName.toLowerCase().contains("mp4")){
    System.out.println("desde el adaptador 'play' al archivo: " + audioType);
      advancedAudioPlayer.playMp4(fileName);
    } else if (fileName.toLowerCase().contains("vlc")){
    System.out.println("desde el adaptador 'play' al archivo: " + audioType);
      advancedAudioPlayer.playVlc(fileName);
    }else {
      System.out.println("su archivo no ha sido implementado en el adaptador.");
    }
    throw new UnsupportedOperationException("error al intertar 'play' en el adaptador.");
  }

  @Override
  public void stop() {
    System.out.println("desde el adaptador:");
    throw new UnsupportedOperationException("error al intertar 'stop' en el adaptador.");
  }

}

