package com.crazysnoopy.chapter01;

/**
 * Created by wonhwa on 2016. 4. 18..
 */
public class BraveKnight implements Knight {
    /*
        Constructor Injection (생성자 주입)
     */

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
