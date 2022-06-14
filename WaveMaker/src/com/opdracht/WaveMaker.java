package com.opdracht;
import java.util.List;
import java.util.Arrays;

public class WaveMaker {
    private final String wave = "\uD83C\uDF0A";

    private final String[] ocean = {
            "-", "-", "-", "-", "-"
    };

    public void draw(Integer[] wavePosition) {
        List<Integer> wavePositionList = Arrays.asList(wavePosition);
            for (int water = 0; water < ocean.length; water++) {
                if (wavePositionList.contains(water)) {
                    System.out.print(wave);
                } else  {
                    System.out.print("-");

                }
            }
    }
}


