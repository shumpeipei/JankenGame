package com.koike;

import java.util.*;

public class janken{


    //引き分け判定
    public static boolean  draw_judge(int num1, int num2){

        boolean bool = true;

        if(num1 == num2) {
            bool = false;
        }
        return bool;
    }


    //判定処理
    public  static String judge(int num1,int num2){
        String win = null;

        if(num1 == 0 && num2 == 1){
            win = "あなた";
        }else if(num1 ==1 && num2 ==2){
            win = "あなた";
        }else if (num1 ==2 && num2 ==0){
            win = "あなた";
        }else if(num2 == 0 && num1 == 1){
            win = "コンピューター";
        }else if(num2 ==1 && num1 ==2){
            win = "コンピューター";
        }else if (num2 ==2 && num1 ==0){
            win = "コンピューター";
        }
        return win;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        int cp_hands ;//cpのジャンケン
        int player_hands = 0;//自分のジャンケン

        String[] janken_hands = {"グー", "チョキ", "パー"};
        String winner =null;
        boolean bool = true;



        //プレイヤーのジャンケン入力
        //0-2以外の数値が入力されればエラーを吐く
        System.out.println("あなたは何を出す？(0:グー 1:チョキ 2:パー)");

        try {
            player_hands = sc.nextInt();
        }catch (Exception e){
            System.out.println("文字が入力されています。0~2で入力してください。");
            System.out.println("ゲームを終了します。");
            System.exit(1);//プログラム強制終了
        }


        if(player_hands > 2){
            System.out.println("0~2で入力してください。");
            System.out.println("ゲームを終了します。");
            System.exit(1);//プログラム強制終了
        }



//cpのジャンケンを乱数で生成
        cp_hands = rd.nextInt(2);
        System.out.println(cp_hands);


        bool = draw_judge(player_hands,cp_hands);//引き分け判定

        winner = judge(player_hands,cp_hands);//勝敗判定

        //出力
        System.out.println("あなたが出した手は" + janken_hands[player_hands]);
        System.out.println("相手が出した手は" + janken_hands[cp_hands]);

        if(bool){
            System.out.println("勝者は" + winner + "だぁ！");
        }else{
            System.out.println("今回は引き分けだっ");
        }


        }
    }