import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.google.gson.Gson;



public class Main {

	public static void main(String[] args) {
		//leerArchivo("src/Test.txt");
		//leerArchivoManual("src/Test.txt");
		//escribirArchivo("src/Test2.txt");
		serializarObjeto("src/Test3.txt");
	}
	
	/*public static void escribirArchivo(String archivo) //Static es para que lo puedas usar desde Main sin necesidad de ser una clase
	{
		String [] datos = {"Que ", "Pedro ", "Juan."};
		try {
		PrintWriter miPrintWriter = new PrintWriter(
				new BufferedWriter(new FileWriter(archivo)));
				for(int i = 0; i<datos.length; i++)
				{
					miPrintWriter.println(datos[i]);
				}
				miPrintWriter.close();
				System.out.println("Hecho...");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	public static void serializarObjeto(String archivo)
	{
		try {
		FileOutputStream salida = new FileOutputStream(archivo);
		ObjectOutputStream oSt = new ObjectOutputStream(salida);
		oSt.writeObject("Today");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		Gson gson = new Gson();
		
		oSt.writeObject(dateFormat.format(date).toString());
		oSt.writeObject(gson.toJson(dateFormat.format(date)));
		System.out.println(date);
		oSt.close();
		System.out.println("Hecho...");
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	//Leer Archivo por linea
	/*public static void leerArchivoManual (String archivo)
	{
		int nLinea = 0;
		try {
			BufferedReader bfrd =  new BufferedReader(     
					new FileReader(archivo));
			String s = new String();
			Scanner lector = new Scanner(System.in);
			System.out.println("Ingrese una linea: ");
			int nLinea2 = lector.nextInt(); //Lo que el usuario ingrese0
			
			while((s = bfrd.readLine()) != null)
			{
				nLinea++;
				if(nLinea2 == nLinea) {           //Va comparando las lineas hasta que sea la que el usuario ingreso
				System.out.println(nLinea+" : "+s);
				}	
			}
			bfrd.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}*/
	
	/*public static void leerArchivo(String archivo)
	{
		int nLinea = 0;
		try {
			BufferedReader bfrd =  new BufferedReader(  //Leer bytes del archivo   
			new FileReader(archivo));                   //Del archivo que se te indica
			String s = new String();                    //Variable en la que se guardara el string 
			String s2 = new String();
			while((s = bfrd.readLine()) != null)
			{
				System.out.println(nLinea+" : "+s);
				nLinea++;
			}
			bfrd.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}*/

}
