package com.crazysnoopy.chapter01.fake.aop;

import com.crazysnoopy.chapter01.Knight;
import com.crazysnoopy.chapter01.Minstrel;
import com.crazysnoopy.chapter01.Quest;

/**
 * User: wonhwa
 * Date: 2016. 4. 18.
 * Time: 오후 10:15
 **/
public class BraveKnight implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    public void embarkOnQuest() throws QuestException {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }


}
