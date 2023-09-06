import java.io.PrintWriter;

class parOUimpar{
    public static void main(String[] args) {


        try{
            PrintWriter impar = new PrintWriter("impares.txt");
            PrintWriter par = new PrintWriter("par.txt");
            for(int i = 1; i<=10; i++) {
                if(i % 2 == 0) {
                    par.println(i);
                } else {
                    impar.println(i);
                }
            }

            impar.close();
            par.close();
        } catch(Exception e) {
            System.out.println("deu erro mane");
        }
    }
}
