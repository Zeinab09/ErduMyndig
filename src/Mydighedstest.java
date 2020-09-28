import java.util.Scanner;
public class Mydighedstest {
    public static void main (String[]args){
        System.out.println("Er du myndig? Indtast din alder:");

        int alder;
        Scanner input =new Scanner(System.in);
        alder = input.nextInt();

        if (alder >= 18){
            System.out.println("Du er myndig");
        }

        else {
            System.out.println("Du er ikke myndig");
        }
//Hej master
    }
}
