package ru.javarush.cryptoanaliser.sapun.controller;

import ru.javarush.cryptoanaliser.sapun.commands.Action;
import ru.javarush.cryptoanaliser.sapun.commands.Decoder;
import ru.javarush.cryptoanaliser.sapun.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        return Actions.valueOf(command.toUpperCase()).action;
    }
}
