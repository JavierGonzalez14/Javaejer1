package com.prueba;

public class cuentaPalabras {
		
		String [] meses = {"January", "February", "March", "April", "May", 
    		"June", "July", "August", "September", "October", "November", "December"};
	
		int numeroDeLetras;
		
		public 	cuentaPalabras()
		{
			
		}
		
		public cuentaPalabras(int numero) //int valor ingresado al metodo
		{
				this.numeroDeLetras = numero;
		}
		public void cuentaLetras()
		{
			for(int f = 0; f< meses.length; f++)
			{
				if(meses[f].length() == numeroDeLetras){
					System.out.println(meses[f]+" : "+numeroDeLetras);
					break;
				}
		}
		//Crear otro metodo
		//System.out.println("/////////////////////////");
		for(int f = 0; f< meses.length; f++)
			{
				if(meses[f].length() == numeroDeLetras)
				{
					System.out.println(meses[f]+" : "+numeroDeLetras);
				}
			}
		}
		
		public void mensaje()
		{
			System.out.println("resultados encontrados");
		}	
}
