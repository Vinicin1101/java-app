import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        try {
            File arquivo = new File("arquivo.txt");
            
            Scanner in = new Scanner(arquivo);

            while (in.hasNext()) {
                System.out.println(in.nextInt());
            }

            in.close();
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println("Você fez merda! " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Deu merda na leitura! " + e);
        }
        
        System.out.println("Programa finalizado");

    }
}