package edu.unisabana.dyas.patterns.utils;

import edu.unisabana.dyas.patterns.typeOf.typeOfAudio;

// Interfaz para el reproductor de audio
public interface AudioPlayer {
    void play(typeOfAudio audioType, String fileName);
    void stop();
}
