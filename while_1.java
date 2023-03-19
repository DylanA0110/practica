package Practica;

import javax.swing.*;

public class while_1 
{

    public static void main(String[] args) 
    {
    	int contador = 0, contador1 = 0;
    	int cont = 0, cont_p = 0;
    	int cont_opc = 0, cont_opc2 = 0;
    	
    	String regist = "", log, password = "";
    	String pass = "", opc = "", respuesta = "";
    	
    	/*Menu si el usuario quiere registrarse o quiere salir
    	 *Verificacion si ingresa espacios o deja en blanco la casilla
    	 * O si pone opciones incorrectas de las que estan en el menu
    	 */
    	
    	do
    	{
    	opc = JOptionPane.showInputDialog("[R] Registrarse\n"
    									+ "[E] Salida.").toLowerCase();
    	cont_opc++;
    	
    	if(opc.trim().isEmpty() && cont_opc <= 3)
    		
    	{
    		JOptionPane.showMessageDialog(null, "¡No puede estar vacia!");
    	}
    	
    	else if(!opc.equals("r") && !opc.endsWith("e") && cont_opc <= 3)
    		
    	{
    		 JOptionPane.showMessageDialog(null, "Opción incorrecta. Por favor, intente de nuevo.");
    	}
    	
    	}
    	while(opc.trim().isEmpty() || (!opc.equals("r") && !opc.equals("e")) && cont_opc <= 3);
    	
    	if(opc.trim().isEmpty() || (!opc.equals("r") && !opc.equals("e")) && cont_opc == 4)
    		
    	{
    		JOptionPane.showMessageDialog(null, "      Vuelva intentarlo mas tarde\n"
    										+ "Ha superado el número máximo de intentos.");
    		System.exit(0);
    	}
    	
    	switch(opc)
    	
    	{
    	case"r":
    		
    		//Registro
    		
    		do
    		{
    		regist = JOptionPane.showInputDialog("Registro\n\n"
    										+ "Su usuario a registar");
    		cont++;
    		
    		//Condiciones si el usuario ingresa espacios en blanco y deja vacia la casilla
    		
    		if (regist.trim().isEmpty() && cont <= 2) 
    		{
                JOptionPane.showMessageDialog(null, "El Usuario no puede estar en blanco!\n"
                        + "Vuelva a intentarlo.\n\n" + "Intentos:" + cont);
            }
    		
    		}
    		while(regist.trim().isEmpty() && cont <= 2);

    		//Si se le acaban los intentos
    		
            if (regist.trim().isEmpty() && cont == 3) 
            {
                JOptionPane.showMessageDialog(null, "Vuelve a registrarte más tarde");
                System.exit(0);
            }
            
            //Mismo proceso con la contraseña
    		do
    		{
    		pass = JOptionPane.showInputDialog("Registro\n\n"
    										+ "Ingrese alguna key:");
    		cont_p++;
    		
    		if (pass.trim().isEmpty() && cont_p <= 2) 
    		{
                JOptionPane.showMessageDialog(null, "El Usuario no puede estar en blanco!\n"
                        + "Vuelva a intentarlo.\n\n" + "Intentos:" + cont_p);
            }
    		
    		}
    		while(pass.trim().isEmpty() && cont_p <= 2);
    		
    		 if (pass.trim().isEmpty() && cont_p == 3) 
             {
                 JOptionPane.showMessageDialog(null, "Vuelve a registrarte más tarde");
                 System.exit(0);
             }
    		
   
    			JOptionPane.showMessageDialog(null, "Registrado exitosamente!");
    	    	
    		log = regist;
	    	password = pass;
    		
    		break;
    		
    	case "e":
    		
    			JOptionPane.showMessageDialog(null, "Ha salido de la aplicacion");
    			System.exit(0);
    			
    	default:
    			JOptionPane.showMessageDialog(null, "Esa opcion no es valida.");
    		break;
    		}
    		
    		//Menu si el usuario quiere loguearse o salir.
    		//Verificacion si ingresa espacios o deja en blanco la casilla

    		do
    		{
    		opc = JOptionPane.showInputDialog("[L] Loguearse\n"
    										+ "[E] Salida.").toLowerCase();
    		
    		cont_opc2++;
    		
        	if(opc.trim().isEmpty() && cont_opc2 <= 3)
        	{
        		JOptionPane.showMessageDialog(null, "¡No puede estar vacia!");
        	}
        	
    		  else if (!opc.equals("l") && !opc.equals("e") && cont_opc2 <= 3) 
    		  {
    		        JOptionPane.showMessageDialog(null, "¡Opción inválida!");
    		   }

        	
        	}
        	while(opc.trim().isEmpty() || (!opc.equals("l") && !opc.equals("e")) && cont_opc2 <= 3);
        	
        	if(opc.trim().isEmpty() || (!opc.equals("l") && !opc.equals("e")) && cont_opc2 == 4)
        	{
        		JOptionPane.showMessageDialog(null, "Vuelva intentarlo mas tarde");
        		System.exit(0);
        	}
        	
    		
    		switch(opc)
    		{
    		case "l":
    			do
    	    	{
    	    		log = JOptionPane.showInputDialog("Login \n\n"
    	    										+ "Ingrese su usuario:");
    	    		
    	    		contador++;
    	    		
    	    		/*Condicion si el usuario que ingreso la persona es diferente al que
    	    		 * puso cuando se registro, igual con su contraseña
    	    		 */
    	    		
    	    		if(!log.equals(regist)  && contador <= 2)
    	    		{
    	    			JOptionPane.showMessageDialog(null,"Usuario incorrecto \n"
    	    											 + " intentos: " + contador);
    	    		}
    	    		
    	    	}while(!log.equals(regist)  && contador <= 2);
    	    	
    	    	
    	    	if(!log.equals(regist) && contador == 3)
    	    	{
    	    		JOptionPane.showMessageDialog(null, " Se terminaron sus intentos\n"
    	    												+ "      Intente mas tarde  ");
    	    	}
    	    	
    	    	else if(log.equals(regist))
    	    	{
    	    		
    	  
    	    	do
    	    	{
    	    		password = JOptionPane.showInputDialog("Login \n\n"
    	    											+ "Ingrese su key:");
    	    		contador1++;
    	    		
    	    		if(!password.equals(pass)  && contador1 <= 2)
    	    		{
    	    			JOptionPane.showMessageDialog(null,"Key incorrecta. \n"
    	    											 + " intentos: " + contador1);
    	    		}
    	    		
    	    	}while(!password.equals(pass) && contador1 <= 2);
    	    	
    	    	}
    	    	
    	    	if(!password.equals(pass) && contador1 == 3)
    	    	{
    	    		JOptionPane.showMessageDialog(null, " Se terminaron sus intentos\n"
    	    											+ "     Intente mas tarde");
    	    	}
    	    	
    	    	//Si el usuario puso bien los datos
    	    	else if(password.equals(pass) && log.equals(regist))
    	    	{
    	    		JOptionPane.showMessageDialog(null, "Bienvenido " + regist + "!");
    	    	}
    			break;
    			
    			//Salida de la aplicacion
    		case "e":
    				JOptionPane.showMessageDialog(null, "Ha Salido de la aplicacion");
    				System.exit(0);
    			break;
    			
    			default:
    				JOptionPane.showMessageDialog(null, "Esa opcion no es valida.");
    				break;
    		}
    		

        System.exit(0);
    }
}
