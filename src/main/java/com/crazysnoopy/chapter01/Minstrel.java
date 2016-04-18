package com.crazysnoopy.chapter01;

import java.io.PrintStream;

/**
 * User: wonhwa
 * Date: 2016. 4. 18.
 * Time: 오후 10:08
 **/
public class Minstrel {
    // Minstrel :: 음유 시인, 시인 이라는 뜻.
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() { // Before Call Quest
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() { // After Call Quest
        stream.println("Tee hee hee, the brave knight "
                + "did embark on a quest!");
    }
}
