package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n) {
        int suma = 0;
        while(n != 0){
            suma = suma + n%10;
            n = n / 10;
        }
       return suma;

    }

    public static void main(String[] args) {
        System.out.println("Unesite prirodan broj: ");
        int n;
	    Scanner in = new Scanner(System.in);
	    n = in.nextInt();

	    for(int i = 1; i <= n; i++){
	        if((i % sumaCifara(i)) == 0) {
                System.out.println(i);
            }
        }


    }

}
