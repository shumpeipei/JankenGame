package com.koike;

import java.util.*;

public class janken{



    public static void main(String[] args) {

        InputOutput inOut  = new InputOutput();
        Random rd = new Random();
        Judge ju  = new Judge();

        int cp_hands = rd.nextInt(2); ;//cpのジャンケン
        int player_hands = 0;//自分のジャンケン
        int hantei = -1;

        player_hands = inOut.input();//入力処理

        //入力値エラー判定
        if(inOut.error(player_hands) == -1){
            //文字入力エラー
            System.exit(1);//プログラム強制終了
        }else if(inOut.error(player_hands) == -2){
            //数値エラー
            System.exit(1);//プログラム強制終了
        }

        hantei = ju.judge(player_hands,cp_hands);//勝敗判定


        inOut.output(hantei,player_hands,cp_hands);//判定出力
        System.exit(0);//プログラム終了

        }
    }