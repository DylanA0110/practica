package Cajero;

public class MenuCajero 
{
    public void menuP() 
    {
        String pin = "";
        Registro r = new Registro("", "", "");
        Operaciones op = new Operaciones();

        int opc = 0;

        try {
            r.ingresarNombre();
            r.numeroCuenta();
            pin = r.registroPin();
            Login l = new Login(pin, r.getNumeroCuenta(), pin, r.getNumeroCuenta(), r.getNombre());
            l.loginPin();
            do 
            {
                System.out.print("\n------MENU CAJERO------\n"
                        + "[1] Cambiar PIN\n"
                        + "[2] Mostrar Informacion\n"
                        + "[3] Depositar Dinero\n"
                        + "[4] Retirar dinero\n"
                        + "[0] Salir\n"
                        + " : ");
                opc = op.getData.nextInt();

                switch (opc) 
                {
                    case 1:
                        l.cambiarPIN();
                        break;

                    case 2:
                        l.mostrarINFO(op);
                        break;

                    case 3:
                        op.depositoDinero(op.saldo);
                        break;

                    case 4:
                        op.retirarDinero(op.saldo);
                        break;
                        
                        case 0:
                        System.exit(0);
                        break;

                    default:
                        System.out.print("\nEsa no es una opcion!");
                        break;
                }
            } while (opc != 0);

        } catch (Exception ex) {
            System.out.print("Error: " + ex.getMessage());
        }
    }
}
