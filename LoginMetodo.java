package Practica;

import javax.swing.JOptionPane;

public class LoginMetodo 
{
    public static void main(String[] args)
    {
        String opc = "";
        String regist = "";
        String pass = "";
        String log = "";

        opc = MenuVeri();
        
        MenuP(opc, regist, pass, log);
            
      }
    public static void MenuP(String opc,String regist, String pass, String log)
    {
         String opc2 = "";

        switch (opc) {
            case "r":
                regist = MenuRegist();
                pass = MenuKey();

                opc2 = MenuVeri();

                switch (opc2) 
                {
                    case "l":
                        log = MenuLogin(regist, pass);

                        JOptionPane.showMessageDialog(null, "Bienvenido " + regist + "!");
                        break;
                        
                    case "e":
                        JOptionPane.showMessageDialog(null, "Ha Salido de la aplicacion");
                        
                        System.exit(0);
                        
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Esa opcion no es valida.");
                        break;
                }
                break;

            case "l":
            	
            	log = MenuLogin(regist, pass);

                JOptionPane.showMessageDialog(null, "Bienvenido " + regist + "!");
                break;

            case "e":
                JOptionPane.showMessageDialog(null, "Ha Salido de la aplicacion");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Esa opcion no es valida.");
                break;
                
         }
    }

    public static String MenuVeri() 
    {
        int cont = 0;
        String a;

        do 
        {
           a = JOptionPane.showInputDialog("[R] Registarse\n" + "[L] Loguearse\n" + "[E] Salida.").toLowerCase();

            cont++;

            if (a.trim().isEmpty() && cont <= 3) 
            {
                JOptionPane.showMessageDialog(null, "¡No puede estar vacia!");
                
            } 
            else if (!a.equals("r") && !a.equals("e") && !a.equals("l")
                    && cont <= 3) 
            {
                JOptionPane.showMessageDialog(null, "Opción incorrecta. Por favor, intente de nuevo.");
            }

        }
        while (a.trim().isEmpty() || !(a.equals("l")) && !(a.equals("r"))
                && !(a.equals("e") && cont <= 3));

        if (a.trim().isEmpty() || !a.equals("r") && (!a.equals("l") && !a.equals("e")) && cont == 4) 
        {
            JOptionPane.showMessageDialog(null,
                    "      Vuelva intentarlo mas tarde\n" + "Ha superado el número máximo de intentos.");
            System.exit(0);
        }

        return a;
    }

    public static String MenuRegist() 
    {
        int cont = 0;
        String regist;

        do {
            regist = JOptionPane.showInputDialog("Registro\n\n" + "Su usuario a registar");
            cont++;

            if (regist.trim().isEmpty() && cont <= 2) 
            {
                JOptionPane.showMessageDialog(null,
                		"El Usuario no puede estar en blanco!\n" + "Vuelva a intentarlo.\n\n" + "Intentos:" + cont);
            }

        } while (regist.trim().isEmpty() && cont <= 2);

        if (regist.trim().isEmpty() && cont == 3)
        {
            JOptionPane.showMessageDialog(null, "Vuelve a registrarte más tarde");
            System.exit(0);
        }

        return regist;
    }

    public static String MenuKey()
    {
        int cont = 0;
        String pass;

        do {
            pass = JOptionPane.showInputDialog("Registro\n\n" + "Ingrese alguna key:");
            cont++;

            if (pass.trim().isEmpty() && cont <= 2) 
            {
                JOptionPane.showMessageDialog(null,
                        "La clave no puede estar en blanco!\n" + "Vuelva a intentarlo.\n\n" + "Intentos:" + cont);
            }

        } while (pass.trim().isEmpty() && cont <= 2);

        if (pass.trim().isEmpty() && cont == 3)
        {
            JOptionPane.showMessageDialog(null, "Vuelve a registrarte más tarde");
            System.exit(0);
        }
        else
        	JOptionPane.showMessageDialog(null, "Registrado exitosamente!");

        return pass;
    }

    public static String MenuLogin(String regist, String pass) 
    {
        int contador = 0, contador1 = 0;
        String log = "", password = "";

        do {
            	log = JOptionPane.showInputDialog("Login \n\n" + "Ingrese su usuario:");

            contador++;
            
            if (log.trim().isEmpty() && contador <= 2) 
            {
                JOptionPane.showMessageDialog(null, "El usuario no puede estar vacío.\n" + "Vuelva a intentarlo.\n\n" + "Intentos: " + contador);
            }
            else if (!log.equals(regist) && contador <= 2) 
            {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto. Por favor, intente de nuevo.\n\n" + "Intentos: " + contador);
            }

        }
        while (log.trim().isEmpty() || !log.equals(regist) && contador <= 2);

        if (log.trim().isEmpty() && contador == 3)
        {
            JOptionPane.showMessageDialog(null, "Vuelve a intentarlo más tarde.\n" + "Ha superado el número máximo de intentos.");
            System.exit(0);
        }

        do {
	            password = JOptionPane.showInputDialog("Login \n\n" + "Ingrese su clave:");
	
	            contador1++;

            if (password.trim().isEmpty() && contador1 <= 2)
            {
                JOptionPane.showMessageDialog(null, "La clave no puede estar vacía.\n" + "Vuelva a intentarlo.\n\n" + "Intentos: " + contador1);
            } 
            else if (!password.equals(pass) && contador1 <= 2) 
            {
                JOptionPane.showMessageDialog(null, "Clave incorrecta. Por favor, intente de nuevo.\n\n" + "Intentos: " + contador1);
            }

        }
        while (password.trim().isEmpty() || !password.equals(pass) && contador1 <= 2);

        if (password.trim().isEmpty() && contador1 == 3)
        {
            JOptionPane.showMessageDialog(null, "Vuelve a intentarlo más tarde.\n" + "Ha superado el número máximo de intentos.");
            System.exit(0);
        }
        return log;
    }
    
}

            
