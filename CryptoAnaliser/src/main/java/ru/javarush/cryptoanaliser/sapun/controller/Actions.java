package ru.javarush.cryptoanaliser.sapun.controller;

import ru.javarush.cryptoanaliser.sapun.commands.*;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTEFORCE(new BrutForce()),
    STATISTIC(new StatisticAnalysis())
    ;

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        return Actions.valueOf(command.toUpperCase()).action;
    }
}
