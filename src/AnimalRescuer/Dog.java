package org.fasttrackit.animal;

public class Dog extends Animal {

    @Override
    public String name() {
        return "CAINE";
    }

    @Override
    public String walk() {
        return "4 picioare";
    }

    @Override
    public String talk() {
        return "ham-ham";
    }

    @Override
    public String eat() {
        return "oase";
    }
}