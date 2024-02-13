package ru.alishev.springcourse;

import java.util.Random;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.random.RandomGenerator;

@Component
public class ClassicalMusic implements Music{

    List<String> classicalMusicList = List.of("Hungarian Rhapsody", "The Planets", "Cello Concerto");

    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }
}
