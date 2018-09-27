package com.ttest.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisct{
    @Override
    public void play() {
        System.out.println("playing by SgtPeppers");
    }
}
