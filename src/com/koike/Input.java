package com.koike;

import java.util.Scanner;

public class Input {
    private int i = 0;

    //プレイヤーのジャンケン入力
       public int input() {

        Scanner sc = new Scanner(System.in);

        //0-2以外の数値が入力されればエラーを吐く
        System.out.println("あなたは何を出す？(0:グー 1:チョキ 2:パー)");

        try {
            i = sc.nextInt();
        } catch (Exception e) {
            i = -1;
        }
        //0~2以外はエラー
        if (i != 0 && i != 1 && i != 2) {
            i = -2;
        }
        return  i ;
    }

}


