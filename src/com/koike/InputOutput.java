package com.koike;

import java.util.Random;
import java.util.Scanner;

public class InputOutput {

    public enum janken_hands{
        グー,チョキ,パー;
    }

    //プレイヤーのジャンケン入力
    public int input() {
        int player_hand = 0;

        Scanner sc = new Scanner(System.in);

        //0-2以外の数値が入力されればエラー値を代入
        System.out.println("あなたは何を出す？(0:グー 1:チョキ 2:パー)");

        try {
            player_hand = sc.nextInt();
        } catch (Exception e) {
            player_hand = -1;
        }
        //0~2以外はエラー
        if (player_hand != 0 && player_hand != 1 && player_hand != 2) {
            player_hand = -2;
        }

        return  player_hand ;
    }


    public int CpInput(){
        Random rd = new Random();
        int cp_hands = rd.nextInt(2); ;//cpのジャンケン
        return cp_hands;
    }
    //入力された値が0〜2以外であれば終了
    public int error(int error_number){

        int i=0;

        if(error_number == -1){
            System.out.println("文字が入力されています。0~2で入力してください。");
            System.out.println("ゲームを終了します。");
            i = -1;

            System.exit(1);//プログラム強制終了
        }else if(error_number == -2){
            System.out.println("0~2で入力してください。");
            System.out.println("ゲームを終了します。");

            i = -2;
            System.exit(1);//プログラム強制終了
        }

        return i;
    }


    //判定出力
    public void output(int hantei , int p_num, int c_num) {

        janken_hands[] hands = janken_hands.values();

        switch (hantei){
            case 0:
                System.out.println("あなたが出した手は" + hands[p_num]);
                System.out.println("相手が出した手は" + hands[c_num]);
                System.out.println("勝者はあなただぁ！");
                break;
            case 1:
                System.out.println("あなたが出した手は" + hands[p_num]);
                System.out.println("相手が出した手は" + hands[c_num]);
                System.out.println("勝者はコンピューターだぁ！");
                break;
            case 2:
                System.out.println("あなたが出した手は" + hands[p_num]);
                System.out.println("相手が出した手は" + hands[c_num]);
                System.out.println("今回は引き分けだっ");
                break;
            default:

        }
        return;
    }

}
