package com.springinaction.concert;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("encore");
    }
}
