package com.prueba;

public class Estudiante {
  private int codigo;
  private String nombre;
  
  //Constructor por defecto
  public Estudiante() //public modificador de acceso
  {
	  
  }
  
  //Constructor sobrecargado
  public Estudiante(int codigo, String nombre)
  
  {
	  //Lllama a ametodos
	  //Se establecen valores de forma segura
	  setCodigo(codigo); //Se manda a llamar a estos metodos
	  setNombre(nombre);  
  }
  
/**
 * Como los atributos de la clase son privados
 * necesito una manera de acceder a sus valores.
 * Por eso creo metodos para poder acceder de 
 * forma segura a estos
 * @return the codigo
 */
public int getCodigo() {
	return codigo;
}
/**
 * @param codigo the codigo to set
 */
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}  

void probar() {
	System.out.println("Hola, soy un metodo sin modificador de acceso");
}
}
