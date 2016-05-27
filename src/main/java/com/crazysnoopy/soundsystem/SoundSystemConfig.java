package com.crazysnoopy.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by crazysnoopy on 16. 5. 27.
 */
@Configuration
@Import({CDPlayerConfig.class, CDconfig.class})
@ImportResource("classpath:spring/applicationContext.xml")
public class SoundSystemConfig {
}
