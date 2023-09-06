import java.io.PrintWriter;

class numeros{
    public static void main(String[] args) {

        try{
            PrintWriter saida = new PrintWriter("numeros.txt");
            for(int i = 1; i<=10; i++) {
                saida.println(i);
            }

            saida.close();
        } catch(Exception e) {
            System.out.println("deu erro mane");
        }
    }
}
