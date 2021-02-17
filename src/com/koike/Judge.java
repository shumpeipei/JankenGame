package com.koike;

public class Judge {
   private  String win ;
        //判定処理
        public String judge(int num1, int num2) {

            if (num1 == 0 && num2 == 1) {
                win = "あなた";
            } else if (num1 == 1 && num2 == 2) {
                win = "あなた";
            } else if (num1 == 2 && num2 == 0) {
                win = "あなた";
            } else if (num2 == 0 && num1 == 1) {
                win = "コンピューター";
            } else if (num2 == 1 && num1 == 2) {
                win = "コンピューター";
            } else if (num2 == 2 && num1 == 0) {
                win = "コンピューター";
            }else if(num1 == num2){
                win = "引き分け";
            }
            return win;
        }
    }


