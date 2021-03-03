package com.koike;

public enum JankenHands {
    グー(0),
    チョキ(1),
    パー(2);

    private final int rawValue;

    private JankenHands(int rawValue) {
        this.rawValue = rawValue;
    }

    public static JankenHands getInstance(int value) {
        switch (value) {
            case 0:
                return グー;
            case 1:
                return チョキ;
            case 2:
                return パー;
            default:
                return null;
        }
    }
}
