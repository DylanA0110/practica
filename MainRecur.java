
import java.util.Scanner;


public class MainRecur 
{
   public static void main(String args[])
   {
       Scanner getData = new Scanner(System.in);
       Recursividad r = new Recursividad(0);
       int f = 0, n = 0;
       
       do
       {
           System.out.print("Ingrese el numero que quiere sacar su factorial: ");
            f = getData.nextInt();
            r.setF(f);
       }while(f<=0);
       
       System.out.print(f + "!" + " = " + r.factorialR(f) + "\n");
       
       do
       {
           System.out.print("[Serie Fibonacci] Valor Enésimo Término: ");
            n = getData.nextInt();       
       }while(n<0);
       
        System.out.print("\nSerie Fibonacci de " + n + " : "); 
       for(int i = 0; i <= n; i++)
        System.out.print(r.fibonacciR(i) + " , ");
       
       System.exit(0);
   }
}
