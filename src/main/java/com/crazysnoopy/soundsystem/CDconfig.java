package com.crazysnoopy.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */
@Configuration
public class CDconfig {
    @Bean
    public CompactDisk compactDisk() {
        return new SgtPeppers();
    }
}
