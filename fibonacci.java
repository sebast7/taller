package calculadora;
 
/**
 * 
 * @author Sebastian Beltran
 *
 */

public class fibonacci {
	/**
	 * 
	 * @param This program performs a factorial operation through recursion
	 * @return
	 */
	public static int fibonacci (int numero) 
	{
		if(numero == 0)
			return 1;
		else
			if(numero == 1)
				return 1;
			else
				return fibonacci (numero-1) + fibonacci (numero-2);
		}
	public static void main(String[] args) {
		int n = 0;
		while(n!=9)
		{
			System.out.println("la serie de fibonacci es : " + n + " es " + fibonacci (n));
			n++;
		}
		
		}
	}