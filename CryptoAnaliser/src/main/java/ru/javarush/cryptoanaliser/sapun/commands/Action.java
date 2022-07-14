package ru.javarush.cryptoanaliser.sapun.commands;

import ru.javarush.cryptoanaliser.sapun.entity.Result;

public interface Action {
    Result execute (String[] parameters);
}
