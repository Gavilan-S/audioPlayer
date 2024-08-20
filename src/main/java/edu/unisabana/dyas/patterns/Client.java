package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.adapter.Adapter;
import edu.unisabana.dyas.patterns.typeOf.typeOfAudio;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
  public static void main(String[] args) {
    AdvancedAudioPlayer advancedPlayer = new AdvancedAudioPlayer();
    advancedPlayer.playMp4("video.mp4");
    advancedPlayer.stop();

    System.out.println("");

    Adapter adapter = new Adapter();
    adapter.play(typeOfAudio.mp4, "video.mp4");
    adapter.stop();
  }
}
