package ru.javarush.cryptoanaliser.sapun.commands;

import ru.javarush.cryptoanaliser.sapun.entity.Result;
import ru.javarush.cryptoanaliser.sapun.entity.ResultCode;
import ru.javarush.cryptoanaliser.sapun.exception.ApplicationException;
import ru.javarush.cryptoanaliser.sapun.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Encoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO need dev logic encrypt
        String txtFile = parameters[0];
        String encryptedFile = parameters[0];
        Path path = Path.of(PathFinder.getRoot() + txtFile);
        try {
            List<String> strings = Files.readAllLines(path);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new ApplicationException("IO error",e);
        }
        return new Result(ResultCode.OK, "read all bytes" + path);
    }
}
