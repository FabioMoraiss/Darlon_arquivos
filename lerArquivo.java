import java.io.BufferedReader;
import java.io.FileReader;

public class lerArquivo {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("texto.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(fr);
        System.out.println("=============");

        String MANGA = "";

        String linha;
        while ((linha = br.readLine()) != null) {
            MANGA += linha + "\n";
        }

        br.close();
        fr.close();

        System.out.println(MANGA);

        System.out.println("============");
        System.out.println();

        char letra = 'a';
        while (letra <= 122) {
            System.out.print("letra " + letra);
            System.out.print(" ");
            System.out.println(contadorCaracter(MANGA, letra));

            letra++;
        }   

        letra = 'a';
        letra  -=32;
        System.out.println(letra);

    }

    public static int contadorCaracter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c || str.charAt(i) == c - 32) {
                count++;
            }
        }
        return count;
    }
}
