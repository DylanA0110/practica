
package Cajero;
import java.util.Scanner;

public class Operaciones
{
    protected double saldo = 500;
    public Scanner getData = new Scanner(System.in);
    
    public Operaciones() {}

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    
    public double convertCordoba(double saldo){return saldo * 36.55;}
     public double convertDolar(double saldo){return saldo / 36.55;}
    
    
    public double retirarDinero(double saldo)
    {
        int opc = 0;
        double retiro = 0;
        
        do
        {
            System.out.print(" |TIPO DE CAMBIO |\n"
                            +"[1] Dolares\n"
                            + "[2] Cordobas\n"
                            + " : ");
                             opc = getData.nextInt();
        }while(opc < 1 || opc > 2);
        
        switch(opc)
        {
            case 1:
                 System.out.print("\n|Retiro en dolares |");
                 
                 do
                 {
                     System.out.print("\nIngrese la cantidad a retirar: ");
                     retiro = getData.nextInt();
                     
                     if(retiro > saldo)
                         System.out.print("\nSaldo insuficiente!");
                     
                 }while(retiro > saldo || retiro <=0);
                 
                 saldo -= retiro;
                 
                 System.out.print("Saldo actual: " + saldo);
                 
                break;
                
                  case 2:
                    System.out.print("\n|Retiro en córdobas |");

                    do {
                        System.out.print("\nIngrese la cantidad a retirar en córdobas: ");
                        retiro = getData.nextDouble();

                        if (retiro > convertCordoba(saldo)) {
                            System.out.print("\nSaldo insuficiente en córdobas!");
                        } else if (retiro <= 0) {
                            System.out.print("\nEl monto de retiro debe ser mayor que cero.");
                        }
                    } while (retiro > convertCordoba(saldo) || retiro <= 0);

                    double retiroEnDolares = convertDolar(retiro);
                    saldo -= retiroEnDolares;
                    System.out.print("\nSaldo actual en dólares: " + convertDolar(saldo));
                    System.out.print("\nSaldo actual en córdobas: " + saldo);

                    break;
           
        }
                
        setSaldo(saldo);
        
        return saldo ;
    }
    
    public double depositoDinero(double saldo)
    {
          int opc = 0;
        double deposito = 0;
        
        do
        {
            System.out.print(" |TIPO DE CAMBIO |\n"
                            +"[1] Dolares\n"
                            + "[2] Cordobas\n"
                            + " : ");
                             opc = getData.nextInt();
        }while(opc < 1 || opc > 2);
        
        switch(opc)
        {
            case 1:
                 System.out.print("\n|Deposito en dolares |");
                 
                 do
                 {
                     System.out.print("\nIngrese la cantidad a depositar: ");
                     deposito = getData.nextDouble();
                     
                     if (deposito <= 0) 
                    System.out.print("\nEl monto de deposito debe ser mayor que cero.");
                     
                 }while(deposito <=0);
                 
                 saldo += deposito;
                 
                 System.out.print("Saldo actual: " + saldo);
                 
                break;
                
            case 2:
            System.out.print("\n|Deposito en córdobas |");

            do {
                System.out.print("\nIngrese la cantidad a depositar en córdobas: ");
                deposito = getData.nextDouble();

                if (deposito <= 0) {
                    System.out.print("\nEl monto de depósito debe ser mayor que cero.");
                }
            } while (deposito <= 0);

            saldo += convertDolar(deposito);
            System.out.print("\nSaldo actual en dólares: " + convertDolar(saldo));
            System.out.print("\nSaldo actual en córdobas: " + saldo);
            break;
    
        }
                
        setSaldo(saldo);
        
        return saldo;
    }
    
}
