package com.koike;

public class Output {
    private String[] janken_hands = {"グー", "チョキ", "パー"};

    //勝利判定
    public void output(int p_num, int c_num, String win) {


        System.out.println("あなたが出した手は" + janken_hands[p_num]);
        System.out.println("相手が出した手は" + janken_hands[c_num]);

        if (!(win.equals("ひきわけ")) ) {
            System.out.println("勝者は" + win + "だぁ！");
        } else {
            System.out.println("今回は引き分けだっ");
        }
        return;
    }
}

