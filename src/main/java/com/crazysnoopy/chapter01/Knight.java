package com.crazysnoopy.chapter01;

/**
 * Created by wonhwa on 2016. 4. 18..
 */
public interface Knight {
    void embarkOnQuest() throws QuestException;

    class QuestException extends Exception {
        public QuestException(String message) {
            super(message);
        }
    }
}
