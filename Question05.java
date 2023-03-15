import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        List invertida = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // Capturando cada letra da palavra
        for(int i=0; i < palavra.length(); i++){
            char c = palavra.charAt(i);
            invertida.add(c);
        }
        // Invertendo a ordem das letras
        String palavraInvertida = "";
        for(int i= 1; i <= invertida.size(); i++){
            palavraInvertida = palavraInvertida + invertida.get(invertida.size()-i);
        }

        System.out.println(palavraInvertida);
            

        sc.close();
    }
    
}
