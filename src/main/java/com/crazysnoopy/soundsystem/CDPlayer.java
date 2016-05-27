package com.crazysnoopy.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk compactDisk;

    @Autowired
    public CDPlayer(@Qualifier("compactDiscArg") CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

    public CDPlayer() {

    }

    @Autowired(required = false)
    public void setCompactDisk(@Qualifier("compactDiscArg") CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

    @Autowired(required = false)
    public void insertDisc(@Qualifier("compactDiscArg") CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

    public void play() {
        compactDisk.play();
    }
}
