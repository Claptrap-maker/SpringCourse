package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@Component
public class RockMusic implements Music {

    List<String> rockMusicList = List.of("Wind cries Mary", "Kashmir", "Highway to Hell");
    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
