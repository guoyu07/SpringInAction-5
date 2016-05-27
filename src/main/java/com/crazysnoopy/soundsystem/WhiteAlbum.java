package com.crazysnoopy.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */
@Component
public class WhiteAlbum implements CompactDisk {
    public void play() {
        System.out.println("This is White Album");
    }
}
