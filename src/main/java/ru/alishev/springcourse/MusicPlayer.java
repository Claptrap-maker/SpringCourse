package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == Genre.CLASSICAL)
            System.out.println("Playing: " + music2.getSong().get(randomNumber));
        else {
            System.out.println("Playing: " + music1.getSong().get(randomNumber));
        }
    }
}
