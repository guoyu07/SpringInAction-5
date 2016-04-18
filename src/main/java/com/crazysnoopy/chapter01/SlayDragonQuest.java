package com.crazysnoopy.chapter01;

import java.io.PrintStream;

/**
 * Created by wonhwa on 2016. 4. 18..
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        // Slay :: ~을 죽이다, 살해하다
        stream.println("Embarking on quest to slay the dragon!");
    }
}
