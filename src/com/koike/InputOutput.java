package com.koike;

import java.util.Random;
import java.util.Scanner;

public class InputOutput {


    //プレイヤーのジャンケン入力
    public JankenHands input() {
        int playerHand = -1;

        Scanner sc = new Scanner(System.in);

        //0-2以外の数値が入力されればnullを返す
        System.out.println("あなたは何を出す？(0:グー 1:チョキ 2:パー)");
        JankenHands hands;


        //文字が入力されていたらエラー
        try {
            playerHand = sc.nextInt();

        } catch (Exception e) {
            System.out.println("文字が入力されています。0~2で入力してください。");
            hands = null;
            return hands;
        }


        //0~2以外はnullを返す
        if (playerHand != 0 && playerHand != 1 && playerHand != 2) {
            System.out.println("不正な値です。0~2で入力してください。");
            hands = null;
            return hands;
        }

        hands = JankenHands.getInstance(playerHand);

        return hands;
    }


    public JankenHands cpInput() {
        Random rd = new Random();
        int cpHands = rd.nextInt(2);
        JankenHands hands = JankenHands.getInstance(cpHands);
        return hands;
    }


    //判定出力
    public void output(int judge, JankenHands p1, JankenHands p2) {

        System.out.println("あなたが出した手は" + p1);
        System.out.println("相手が出した手は" + p2);

        switch (judge) {
            case Judge.JUDGE_HUMAN:
                System.out.println("勝者はあなただぁ！");
                break;
            case Judge.JUDGE_COMPUTER:
                System.out.println("勝者はコンピューターだぁ！");
                break;
            case Judge.JUDGE_DRAW:
                System.out.println("今回は引き分けだっ");
                break;
            default:
                break;
        }
    }

}
