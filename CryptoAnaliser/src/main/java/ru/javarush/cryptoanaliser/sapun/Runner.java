package ru.javarush.cryptoanaliser.sapun;

import ru.javarush.cryptoanaliser.sapun.app.Application;
import ru.javarush.cryptoanaliser.sapun.controller.MainController;


public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);

    }
}
