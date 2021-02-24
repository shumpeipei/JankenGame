package com.koike;

import java.util.*;

public class janken{



    public static void main(String[] args) {

        InputOutput inOut  = new InputOutput();
        Judge ju  = new Judge();

        int cp_hands = 0; ;
        int player_hands = 0;
        int hantei = -1;

        player_hands = inOut.input();//プレイヤー入力処理
        cp_hands = inOut.CpInput();//CP入力処理
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