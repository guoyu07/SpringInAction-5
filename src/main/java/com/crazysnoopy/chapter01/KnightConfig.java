package com.crazysnoopy.chapter01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonhwa on 2016. 4. 18..
 */


// knights.xml 과 대등한 기능임

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    private Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
