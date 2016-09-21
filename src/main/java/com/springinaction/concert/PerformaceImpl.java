package com.springinaction.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformaceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("performance");
    }
}
