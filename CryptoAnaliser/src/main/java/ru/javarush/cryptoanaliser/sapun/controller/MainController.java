package ru.javarush.cryptoanaliser.sapun.controller;

import ru.javarush.cryptoanaliser.sapun.commands.Action;
import ru.javarush.cryptoanaliser.sapun.entity.Result;

public class MainController {
    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        Result result = action.execute(parameters);
        return result;

    }
}
