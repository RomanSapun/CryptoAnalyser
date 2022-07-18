package ru.javarush.cryptoanaliser.sapun.commands;

import ru.javarush.cryptoanaliser.sapun.entity.Result;

public interface Action {
    int KEY = 45;
    Result execute (String[] parameters);
}
