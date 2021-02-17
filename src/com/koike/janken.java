package com.koike;

import java.util.*;

public class janken{

    public static void main(String[] args) {

        Input in  = new Input();
        Random rd = new Random();
        Judge ju  = new Judge();
        Output ou = new Output();

        int cp_hands = rd.nextInt(2); ;//cpのジャンケン
        int player_hands = 0;//自分のジャンケン
        String winner =null;

        player_hands = in.input();//入力処理
        //入力された値が0〜2以外であれば終了
        if(player_hands == -1){
            System.out.println("文字が入力されています。0~2で入力してください。");
            System.out.println("ゲームを終了します。");
            System.exit(1);//プログラム強制終了
        }else if(player_hands == -2){
            System.out.println("0~2で入力してください。");
            System.out.println("ゲームを終了します。");
            System.exit(1);//プログラム強制終了
        }
        winner = ju.judge(player_hands,cp_hands);//勝敗判定
        ou.output(player_hands,cp_hands,winner);//判定出力

        }
    }