package com.pg.codewar.Nozerosforheros;

public class NoBoring {
      public static int noBoringZeros(int number) {
        if (number == 0) {
            return number;
        }
        
        while (number % 10 == 0) {
            number /= 10;
        }
        
        return number;
    }

}