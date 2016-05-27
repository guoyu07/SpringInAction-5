package com.crazysnoopy.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */

@Configuration
/*@ComponentScan*/
public class CDPlayerConfig {

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisk sgtPeppers() {
        return new SgtPeppers();
    }


    @Bean
    public CompactDisk randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);

        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer anotherCDPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer cdPlayerSome(@Qualifier("lonelyHeartsClubBand") CompactDisk compactDisk) {
        return new CDPlayer(compactDisk);
    }

    @Bean
    public CDPlayer cdPlayer(@Qualifier("lonelyHeartsClubBand") CompactDisk compactDisk) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCompactDisk(compactDisk);
        return cdPlayer;
    }
}
