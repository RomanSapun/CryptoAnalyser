package ru.javarush.cryptoanaliser.sapun.constans;

public class Strings {
    private static final String ru = "йцукенгшщзхъфывапролджэячсмитьбю";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String numbers = "1234567890";
    private static final String symbols = ",./`!@#$%^&*)(_-=+}{]['";
    public static final String ALPHABET = ru + ru.toUpperCase() + eng + eng.toUpperCase() + numbers + symbols;

}
