import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int number = sc.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        boolean check = false;
        for(int n = 0; n < number; n++){
            if(n1 == number)
                check = true;
            System.out.print(n1+", ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        System.out.println();
        if(check)
            System.out.println("The number " + number + " is in the sequence");
        else
            System.out.println("The number " + number + " is not in the sequence");
        
        sc.close();

    }
}
