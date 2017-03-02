package main;

import main.database.HSQLDBManager;

public class AppReadPrimes {
    public static void main(String[] args) {
        HSQLDBManager database = HSQLDBManager.instance;
        database.startup();
        database.outputPrimes(0);
    }
}