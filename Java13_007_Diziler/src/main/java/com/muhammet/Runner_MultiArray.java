package com.muhammet;

public class Runner_MultiArray {
    public static void main(String[] args) {

        /**
         *  Ad    -   Mat Not   -   Trk Not
         *  ali        65             55
         *  canan      87             99
         *
         *
         */
        //                                  row(satır) - column(sütun)
        String[][] okulBilgileri = new String[5][3];

        okulBilgileri[0][0] = "Ali";
        okulBilgileri[0][1] = "65";
        okulBilgileri[0][2] = "55";

        okulBilgileri[1][0] = "Canan";
        okulBilgileri[1][1] = "87";
        okulBilgileri[1][2] = "99";

        int not1 = Integer.parseInt(okulBilgileri[0][1]);
        int not2 = Integer.parseInt(okulBilgileri[0][2]);
        int ort = (not1+not2)/2;
        System.out.println("Ortalama....: "+ ort);

        for(int i=0;i<5;i++){ // i=2
            for (int j=0;j<3;j++) // i=2, j=0
                System.out.print(okulBilgileri[i][j]+" ");
            System.out.println();
        }


    }
}
