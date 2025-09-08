package com.drift.frc.utils;

import java.util.List;

public class Console {
    private Verbosity level;

    public enum Verbosity {
        CRITICAL, // Nothing but exceptions
        WARNING, // Logs warnings
        INFO,    // Logs important info
        DEBUG    // Logs all others
    }

    public static List<String> critical;
    public static List<String> warnings;
    public static List<String> info;
    public static List<String> debug;

    public static Print() {
        for (String c : critical) {
            throw Exception("[DRIFT] - CRITICAL - " + c);
        }
        for (String w : warnings) {
            System.out.println("[DRIFT] - WARNING  - " + w);
        }
        for (String i : info) {
            System.out.println("[DRIFT] - INFO     - " + i);
        }
        for (String d : debug) {
            System.out.println("[DRIFT] - DEBUG    - " + d);
        }
    }
}
