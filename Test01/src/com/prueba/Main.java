package com.prueba;
import java.util.Scanner;
import java.io.IOException; // manejo de excepciones
import java.util.Scanner;
import com.salon4llorar.*; //el .* toma en cuenta todo lo que esta en el paquete

public class Main {

	public static int id = 0;
	public static long id2 = 0;
	
	public static final int valorFinal = 9; //final define el dato como una constante 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		id = 25;
    System.out.println("Hola Mundo!!");
    
    int a=1;
    int b=81;
    int resultado=0;
    
    resultado = a + b;
    
    //Suma
    System.out.println("Suma: " +resultado);
    
    float d=3.14592678f;
    float c=10.34434343434f;
    float resf=0.0f;
    
    resf = d+c;
    System.out.println("Suma de flotantes: " +resf);
    float flotaentero =a+d;
    System.out.println("Suma de flotante y entero: " +flotaentero);
    
    //Cuadratica
    double x1=((-b)+Math.sqrt(Math.pow(b, 2) -(4*a*c)))/(2*a);
    double x2=((-b)-Math.sqrt(Math.pow(b, 2) -(4*a*c)))/(2*a);
    //Al imprimir se deben concatenar
    System.out.println("Chicharronera  X1 = "+x1+", X2= "+x2);
    
    String cadena = "Paranguaterimicuaro";
    
    //Float flotante = 0.0f;
    System.out.println("//////// cadenas //////");
    System.out.println("");
    System.out.println("\n");
    String cadenaCesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int espacio = 3;
    
    System.out.println(cadena);
    //Moverse por el arreglo de la cadena
    for (int x = 0; x< cadena.length(); x++)
    {
    	System.out.println(cadena.charAt(x));
    	//Hacer substitucion 
    	cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x + espacio));
    }
    System.out.println(cadena);
    //Subcadenas
    System.out.println(cadena.substring(3, 6));
    //Convertir a minusculas
    System.out.println(cadena.toLowerCase());
    
    //Arrays
    String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", 
    		"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String [] sem = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    //Objetivo: mostrar enero, julio, noviembre, diciembre y marzo en la misma linea
    System.out.print(meses[0]+" "+meses[6]+" "+meses[10]
    		+" "+meses[11]+" "+meses[2]+" "+sem[0]+" "+sem[4]+" "+sem[1]);
    /* FALLO PROVOCADO
     * *System.out.println(sem[8]);
    */
    
    //boolean  x = true;
    //boolean az = false;
    
    System.out.println("\n\n");
    /*System.out.println(x && az);
    if(x == az)
    	System.out.println("Chana!!!");
    else
    	System.out.println("Juana!");
    */
    
    //BLOQUE MULTIDECICION 
    /*if(x == az)
    	System.out.println("Chana!!!");
    else if(x == az)
    	System.out.println("Juana!");
    else if(x == az)
    	System.out.println("Melon!!!");
    else if(!x == !az)
    	System.out.println("Sandia!!!");
    else if(x == !az)
	System.out.println("La vieja del otro dia");
    else 
	System.out.println("Ni modo!");*/
    
    System.out.println("\n\n");
    
    /*String opcion = "Chana";
     
    //Instanciar la clase que lee el teclado
    Scanner lector = new Scanner(System.in);
    //Hasta que den enter asigna lo que se tecleeo a opcion
    opcion = lector.nextLine();
    
    
    switch(opcion)
    {
    case "Chana":
    System.out.println("Chana!!");
    break;
    case "Juana":
    System.out.println("Juana!!");
    break;
    case "Chona":
    System.out.println("Chona!!");
    break;
    default:
    System.out.println("Ninguna!!");
    break;
    }*/
    
    /*Scanner lector = new Scanner(System.in);
    String opcion = lector.nextLine();
    		
    String cadena5 = "Hola";
    //Funcion para comparar cadenas
    if (cadena5.equals(opcion))
    	System.out.println("Son iguales");
    else
    	System.out.println("No son iguales");*/

    /*//For each
    for(String i:meses)
    {
    	System.out.print(i);
    }*/
    	
    /*int contador = 0;
    while(contador < meses.length)
    {
    	System.out.println((contador+1)+ " : " +meses[contador]);
    	contador++;
    }*/
    
    /*
    //cP1b nombre elegido para el objeto
    cuentaPalabras cP1b = new cuentaPalabras(3);
    cP1b.cuentaLetras();
    cP1b.mensaje();
    //Nombre de objeto. Funcion de*/ 
    
    //Bloque try and catch 
    //Controlar excepciones
    /*try{
		  int contador = 0;
		  while(contador < 14)
		        {
			System.out.println((contador + 1)+" : "+meses[contador]);
			contador++;
			}
		    }catch(ArrayIndexOutOfBoundsException ex) {
		    	System.out.println("Excepcion; "+ex);
		    }
    		catch(NullPointerException ex) {
    			System.out.println("Excepcion; "+ex);
    		}
    		
		    catch(ClassCastException ex) {
				System.out.println("Excepcion; "+ex);
			}
		    catch(NumberFormatException ex) {
				System.out.println("Excepcion; "+ex);
			}
    		catch(Exception ex){
    			System.out.println("Excepcion; "+ex);
			}finally{
			//Bloque finally, se ejecuta sin imprtar si se llego a la excepcion
			System.out.println("Bloque finally");
			}
			System.out.println("Saliendo de la excepcion... ");
		}*/
    
    //Instanciacion de la clase, uso del constructor sobrecargado
    Estudiante estudiHambre = new Estudiante(2, "Juancho");
    //Obtener los datos de forma segura
    System.out.println(estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
    //Cambiar los valoresz
    estudiHambre.setCodigo(4);
    estudiHambre.setNombre("Gloria");
    //Obtener los datos de forma segura
    System.out.println("\n"+estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
    
    //Llamar al metodo identificador de acceso 
    estudiHambre.probar();
    
   Sacapuntas sacaPuntas = new Sacapuntas(456, "filo");
   System.out.println(sacaPuntas.getId()+" : "+sacaPuntas.getMarca());
   //sacaPuntas.probarSacapuntas(); //Si la clase es de tipo indefinida no puedes acceder a ella tiene que ser public
   
   //valorFinal = 0; ya no se puede modificar 
   
    id2++;
    System.out.println("\nID del desorden: "+id2);
    probarEstatico();
    
	}//Fin del main
	
	//Metodo estatico
	public static void probarEstatico() {
		id=99999;
		System.out.println("\n"+id);
	}
}



