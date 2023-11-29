package com.muhammet;

import java.util.Scanner;

public class Runner_String_2 {
    public static void main(String[] args) {
        String ifade;
        int index;
        do{
            System.out.print("kullanıcı adı....: ");
            ifade = new Scanner(System.in).nextLine();
            index = ifade.indexOf(" ");
            if (index != -1) {
                System.out.println("Uyarı kullanıcı adında boşluk kullanamazsınız");
            }
        }while (index!=-1);
    }
}
