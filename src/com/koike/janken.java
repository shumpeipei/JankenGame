package com.koike;

public class Janken {


    public static void main(String[] args) {

        InputOutput inOut = new InputOutput();
        Judge ju = new Judge();

        JankenHands cpHands;
        JankenHands playerHands;

        int judge = -1;

        playerHands = inOut.input();//プレイヤー入力処理
        cpHands = inOut.cpInput();//CP入力処理

        if (playerHands == null) {
            System.out.println("ゲームを終了します。");
            System.exit(1);
            return;
        }


        judge = ju.judge(playerHands, cpHands);//勝敗判定
        if (judge == 100) {
            System.out.println("不正な値です。ゲーム終了します");
            System.exit(1);
            return;
        }
        inOut.output(judge, playerHands, cpHands);//判定出力
        System.exit(0);//プログラム終了
        return;

    }
}