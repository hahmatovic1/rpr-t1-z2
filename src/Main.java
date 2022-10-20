import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesi broj n:");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara:");
        for (int i = 1; i <= n; i++){
            if (i % sumaCifara(i) == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static int sumaCifara(int n) {
        int suma = 0;
        while(n != 0){
            suma += n % 10;
            n = n/10;
        }
        return suma;
    }
}