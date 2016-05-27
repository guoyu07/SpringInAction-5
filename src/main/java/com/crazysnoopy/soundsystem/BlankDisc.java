package com.crazysnoopy.soundsystem;

import java.util.List;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */
public class BlankDisc implements CompactDisk {

    private String title;

    private String artist;

    private List<String> tracks;

    public BlankDisc(String title, String artist,List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }


    public void play() {
        System.out.println("Playing +" + title +" By " + artist);
        for (String track : tracks) {
            System.out.println("-Track :" + track);
        }
    }
}
