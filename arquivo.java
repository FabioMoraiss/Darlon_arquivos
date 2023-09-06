import java.io.PrintWriter;

class aqrquivo{
    public static void main(String[] args) {
        String mensagem = "busquem conhecimento";
        int resposta = 42;


        try{
            PrintWriter saida = new PrintWriter("saida.txt");
            saida.println(resposta);
            saida.close();
        } catch(Exception e) {

        }
    }
}