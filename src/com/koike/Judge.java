package com.koike;

public class Judge {

    public static final int JUDGE_HUMAN = 0;
    public static final int JUDGE_COMPUTER = 1;
    public static final int JUDGE_DRAW = 2;


    public int judge(JankenHands p1, JankenHands p2) {
        int i = 100;


        if (p1.ordinal() == 0 && p2.ordinal() == 1) {
            return JUDGE_HUMAN;
        } else if (p1.ordinal() == 1 && p2.ordinal() == 2) {
            return JUDGE_HUMAN;
        } else if (p1.ordinal() == 2 && p2.ordinal() == 0) {
            return JUDGE_HUMAN;
        } else if (p2.ordinal() == 0 && p1.ordinal() == 1) {
            return JUDGE_COMPUTER;
        } else if (p2.ordinal() == 1 && p1.ordinal() == 2) {
            return JUDGE_COMPUTER;
        } else if (p2.ordinal() == 2 && p1.ordinal() == 0) {
            return JUDGE_COMPUTER;
        } else if (p1 == p2) {
            return JUDGE_DRAW;
        }
        return i;
    }
}