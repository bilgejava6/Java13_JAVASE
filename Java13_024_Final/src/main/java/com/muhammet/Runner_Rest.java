package com.muhammet;

// !!!!!! BURAYA DİKKAT !!!!!!!
import static com.muhammet.constants.RestApiUrl.*;

public class Runner_Rest {
    public static void main(String[] args) {
        /**
         * DİKKAT!!!!
         * aşağıda kullanılan static değişken çağırma şekli hantal ve kullanımı
         * iticidir :) bu nedenle daha kullanışlı olan static değişkenleri
         * import static şekilde çekebileceğimiz yöntemi kullanmamız doğru olacaktır.
         * RestApiUrl.PROJE+ RestApiUrl.DEV+RestApiUrl.SAVE;
         */
        String istek = PROJE+DEV+SAVE;
        System.out.println(istek);
    }
}
