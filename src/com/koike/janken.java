package com.koike;

import java.util.*;

public class janken{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        int cp_hands = 0;//cpのジャンケン
        int player_hands = 0;//自分のジャンケン

        String[] janken_hands = {"グー", "チョキ", "パー"};
        String winner =null;
        boolean bool = true;


//プレイヤーのジャンケン入力
//0-2以外の数値が入力されればエラーを吐く
        System.out.println("あなたは何を出す？(0:グー 1:チョキ 2:パー)");

            player_hands = sc.nextInt();

            if(player_hands > 2){
                System.out.println("0~2で入力してください。");
                System.out.println("ゲームを終了します。");
                System.exit(0);//プログラム終了
            }




//cpのジャンケンを乱数で生成
        cp_hands = rd.nextInt(2);
        System.out.println(cp_hands);
//判定処理
        if(player_hands == cp_hands){
            bool = false;
        }else if(player_hands == 0 && cp_hands == 1){
            winner = "あなた";
        }else if(player_hands ==1 && cp_hands ==2){
            winner = "あなた";
        }else if (player_hands ==2 && cp_hands ==0){
            winner = "あなた";
        }else if(cp_hands == 0 && player_hands == 1){
            winner = "コンピューター";
        }else if(cp_hands ==1 && player_hands ==2){
            winner = "コンピューター";
        }else if (cp_hands ==2 && player_hands ==0){
            winner = "コンピューター";
        }




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