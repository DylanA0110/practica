package Practica;

import javax.swing.JOptionPane;

public class LoginMetodo 
{

    public static void main(String[] args) 
    {
		String opc = "";

		opc = JOptionPane.showInputDialog("[L] Loguearse\n" +
										"[R] Registrarse\n"
    									+ "[E] Salida.").toLowerCase();
		 cadenaEmpty(opc);

	}

	public static String cadenaEmpty(String a)
	{
		int cont = 0;
		do
		{

			cont++;
			if(a.trim().isEmpty() && cont <= 3)
    		
    		{
    			JOptionPane.showMessageDialog(null, "¡No puede estar vacia!");
    		}



		}while(a.trim().isEmpty() && cont <=3);

		if(a.trim().isEmpty()  && cont == 4)
    		
    	{
    		JOptionPane.showMessageDialog(null, "      Vuelva intentarlo mas tarde\n"
    										+ "Ha superado el número máximo de intentos.");
    		System.exit(0);
    	}

		return a;
	}


}
