import java.util.Scanner;

public class tugas_paksin {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Inputkan isi batrai : ");
      int baterai = input.nextInt();

        if ( baterai == 100){
            System.out.println("Baterai Penuh");
        } else if ( baterai >= 50){
            System.out.println("Baterai terisi setengah");
        } else if (baterai >=25){
            System.out.println("Baterai hampir habis");
        } else {
            System.out.println("Baterai habis ");
        }
    }
}
