package com.koike;

public class Judge {

        //判定処理
    public enum win_lose{
        あなた,コンピュータ,ひきわけ;
        }

        public int judge(int p1, int p2) {

            int win = 0;

            if (p1 == 0 && p2 == 1) {
                win = win_lose.あなた.ordinal();//0
            } else if (p1 == 1 && p2 == 2) {
                win = win_lose.あなた.ordinal();//0
            } else if (p1 == 2 && p2 == 0) {
                win = win_lose.あなた.ordinal();//0
            } else if (p2 == 0 && p1 == 1) {
                win = win_lose.コンピュータ.ordinal();//1
            } else if (p2 == 1 && p1 == 2) {
                win = win_lose.コンピュータ.ordinal();//1
            } else if (p2 == 2 && p1 == 0) {
                win = win_lose.コンピュータ.ordinal();//1
            }else if(p1 == p2){
                win = win_lose.ひきわけ.ordinal();//2
            }
            return win;
        }
    }


