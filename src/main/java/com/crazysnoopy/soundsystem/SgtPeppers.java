package com.crazysnoopy.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */

@Component
public class SgtPeppers implements CompactDisk {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
