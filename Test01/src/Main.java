
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
    
    double x1=((-b)+Math.sqrt(Math.pow(b, 2) -(4*a*c)))/(2*a);
    double x2=((-b)-Math.sqrt(Math.pow(b, 2) -(4*a*c)))/(2*a);
    System.out.println("Chicharronera  X1 = "+x1+", X2= "+x2);
	}

}
