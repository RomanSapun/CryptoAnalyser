package ru.javarush.cryptoanaliser.sapun.commands;

import ru.javarush.cryptoanaliser.sapun.entity.Result;
import ru.javarush.cryptoanaliser.sapun.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class StatisticAnalysis implements Action {
    @Override
    public Result execute(String[] parameters) {
        String encodedFile = parameters[0];
        String dictionaryFile = parameters[1];
        String outFile = parameters[2];

        Path inputPath = Path.of(PathFinder.getRoot() + "statistic/" +  encodedFile);
        Path dictionaryPath = Path.of(PathFinder.getRoot() + "statistic/" +  dictionaryFile);
        Path outPath = Path.of(PathFinder.getRoot() + "statistic/" +  outFile);

        try {
            String input = Files.readString(inputPath);
            String dictionary = Files.readString(dictionaryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    private List<Character> calculateStatistic(String input) {
        //TODO : implement this
        return null;
    }
}
