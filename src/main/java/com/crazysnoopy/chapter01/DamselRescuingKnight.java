package com.crazysnoopy.chapter01;

/**
 * Created by wonhwa on 2016. 4. 18..
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
