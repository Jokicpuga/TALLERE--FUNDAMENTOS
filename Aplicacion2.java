package ec.edu.intsuperior.vista;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Aplicacion {
	public static void main(String[] args) { 
		System.out.println();
	}
	
public static void HoraMinutos(){
	Scanner leer=new Scanner(System.in);
	int h,m,s;
	System.out.println("Introduce una hora");
	h=leer.nextInt();
	System.out.println("Introduce los minutos");
	m=leer.nextInt();
	System.out.println("Introduce los segundos");
	s=leer.nextInt();
	s++;
	if (s>=60) {
		s=0;
		m++;
	}
	 if (m>=60) {
		 m=0;
        h++;	
	}
	 if (h>=24) {
		 h=0;	
	}
	 System.out.println("Fecha:"+h+":"+m+":"+s);
}
public static void ProductoPrecio() {
	String utiles []={"pelota", "zapatos","mochila","buzo"};
	 double precios[]={35.5,89.60,45.99,25.70};
	 System.out.println("Lista de Productos y sus precios");
	 for (int u=0;u<utiles.length;u++){
	 System.out.println(utiles[u]+ " "+ precios[u]); 
	
}
}
public static void Temperaturas() {
	Scanner leer=new Scanner(System.in);
	double fareheint,celsius,rakine,kelvin;
	System.out.println("Introduce grados farenheint");
	fareheint=leer.nextDouble();
	celsius=(fareheint-32)*(5/9);
	kelvin=celsius+273;
	rakine=fareheint+460;
	System.out.println("celsius"+":"+celsius+"kelvin"+":"+kelvin+"rakine"+":"+rakine);

}
public static void MayorCien() {
	  int C = 55;
      System.out.println(C + (C >= 0 ? " es positivo " : " es negativo "));                                      
      System.out.println(C + (C%2== 0 ? " es par " : " es impar "));
      System.out.println(C + (C%5== 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
      System.out.println(C + (C%10== 0 ? " es múltiplo de 10 " : " no es múltiplo de 10 "));                     
      System.out.println(C + (C>100 ? " es mayor que 100 " : " es menor que 100 "));
}
public static void MultiploCien(){
	Scanner leer=new Scanner(System.in);
	int num;
	System.out.println("Introduzca un numero entero");
	num=leer.nextInt();
	if (num%10==0) {
		System.out.println("El numero que ingresaste si es multiplo de 10");
	} else {
      System.out.println("El numero que ingresaste no es multiplo de 10");
	}
	
}
public static void Circuferencia() {
	Scanner sc = new Scanner(System.in);
    double radio, longitud, area;
    System.out.println("Introduce radio de la circunferencia:");
    radio = sc.nextDouble();
    longitud = 2 * Math.PI * radio;
    area = Math.PI * Math.pow(radio, 2);
    System.out.println("Longitud de la circunferencia -> " + longitud);                                    
    System.out.println("Area de la circunferencia -> " + area);
}
public static void VelocidadKm(){
	Scanner leer = new Scanner(System.in);
    double velocidad;
    System.out.println("Introduzca velocidad en Km/h: ");
    velocidad = leer.nextDouble();
    System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s"); 
}
public static void Cifras() {
	Scanner leer = new Scanner(System.in);
    int N;
    System.out.print("Introduzca valor de N: ");
    N = leer.nextInt();                                   
    System.out.println(N/10000);
    System.out.println(N/1000);
    System.out.println(N/100);
    System.out.println(N/10);
    System.out.println(N);
}
public static EdadNS(){
	 Scanner leer = new Scanner(System.in);
     int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;                                          
     System.out.println("Introduzca fecha de nacimiento");
     System.out.print("día: ");
     dia = leer.nextInt();
     System.out.print("mes: ");
     mes = leer.nextInt();
     System.out.print("año: ");
     año = leer.nextInt();
     suma = dia + mes + año;
     cifra1 = suma/1000;      
     cifra2 = suma/100%10;    
     cifra3 = suma/10%10;     
     cifra4 = suma%10;        
     suerte = cifra1 + cifra2 + cifra3 + cifra4;
     System.out.println("Su número de la suerte es: " + suerte);
}
public static void ProductoIVA() {
	 Scanner leer = new Scanner(System.in);
     double precioUnidad, cantidad, iva, precioSinIva, totalIva;

     System.out.print("Introduzca precio por unidad del producto: ");                                          
     precioUnidad = leer.nextDouble();

     System.out.print("Introduzca número de productos vendidos: ");
     cantidad = leer.nextDouble();

     System.out.print("Introduzca %IVA: ");
     iva = leer.nextDouble();

     precioSinIva = precioUnidad * cantidad;
     totalIva = precioSinIva * iva / 100;

     System.out.println("Precio de venta -> " + (precioSinIva + totalIva));
}
public static void NumerosInvertidos() {
	int[] numeros ={7,3,4,5,9,11};
    int longitud = numeros.length;
    System.out.println("Array inicial: ");
    for (int i=0; i<longitud;i++){
        System.out.print (numeros[i]+" - ");
    }
    System.out.println("\n");
    System.out.println("Array invertido: ");
    for (int i=longitud-1; i>=0;i--){
        System.out.print (numeros[i]+" - ");
    }
    System.out.println("\n");
}
public static void NotasEstudiantes() {
	String [] estudiantes = {"Pedro","Ana","Roberto","Lucia","Maria"};
    double [] notas = {7.0,2.3,4.5,6.7,5.7};
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduce el nombre de un estudiante: ");
    String estudiante=leer.nextLine();
    for (int i=0;i<5;i++){
        if(estudiantes[i].equals(estudiante)){
            System.out.println("Estudiante "+estudiante+" tiene una nota de "+notas[i]);
            }
        }
}
public static void CalculaNumeroPositivo() {
	 
    Scanner leer = new Scanner(System.in);
    int n;

    System.out.print("Introduzca un número entero: ");
    n =leer.nextInt();

    if (n > 0) {
        System.out.println("El número es positivo");
    } else if(n < 0){
        System.out.println("El número es negativo");
    } else {
        System.out.println("El número introducido es 0");                                                     
    }
}
public static void NumerosTerminanCifras() {
	 Scanner leer = new Scanner(System.in);
     int num1, num2;

     System.out.print("Introduzca primer número: ");
     num1 = leer.nextInt();
     System.out.print("Introduzca segundo número: ");
     num2 = leer.nextInt();

     if (num1 % 10 == num2 % 10) {
         System.out.println("Los dos números acaban con la misma cifra");                                      
     } else {
         System.out.println("Los números acaban con cifras distintas");
     }
}
public static void NumeroMes() {
	Scanner leer = new Scanner(System.in);
    int mes;
    System.out.print("Introduzca número de mes: ");
    mes =leer.nextInt();
    if(mes < 1 || mes > 12)                                   
        System.out.println("Mes incorrecto");
    else{  
        switch(mes){                                   
            case 1: System.out.print("Enero");
                    break;
            case 2: System.out.print("Febrero");
                    break;
            case 3: System.out.print("Marzo");
                    break;
            case 4: System.out.print("Abril");
                    break;
            case 5: System.out.print("Mayo");
                    break;
            case 6: System.out.print("Junio");
                    break;
            case 7: System.out.print("Julio");
                    break;
            case 8: System.out.print("Agosto");
                    break;
            case 9: System.out.print("Septiembre");
                    break;
            case 10: System.out.print("Octubre");
                    break;
            case 11: System.out.print("Noviembre");
                    break;
            case 12: System.out.print("Diciembre");
                    break;
        }
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11)       
           System.out.println(" es un mes de 30 días");
        else if(mes == 2)
                 System.out.println(" es un mes de 28 días");
               else
                  System.out.println(" es un mes de 31 días");
    }
}
public static void CalficaRendimiento() {
	 Scanner leer = new Scanner(System.in);
     int nota;

     System.out.print("Introduzca una nota entre 0 y 10: ");
     nota =leer.nextInt();

     if (nota < 0 || nota > 10) {
         System.out.println("Nota incorrecta");
     } else if (nota < 5) {
         System.out.println("Insuficiente");
     } else if (nota < 6) {
         System.out.println("Suficiente");
     } else if (nota < 7) {
         System.out.println("Bien");
     } else if (nota < 9) {
         System.out.println("Notable");
     } else {
         System.out.println("Sobresaliente");                                                                  
     }
}
public static void ContarNumeroElementos() {
	Scanner leer = new Scanner(System.in);
    int[] numeros = new int[10];
    int pos = 0, neg = 0, cero = 0; 
    int i;
                                                
    System.out.println("Lectura de los elementos del array: ");
    for (i = 0; i < numeros.length; i++) {
        System.out.print("numeros[" + i + "]= ");
        numeros[i] =leer.nextInt();
    }
    for (i = 0; i < numeros.length; i++) {
        if (numeros[i] > 0) {
            pos++;
        } else if (numeros[i] < 0) {
            neg++;
        } else {
            cero++;
        }
    }
    System.out.println("Positivos: " + pos);                                                                  
    System.out.println("Negativos: " + neg);
    System.out.println("Ceros: " + cero);
}
public static void ContarPalabras() {
	 Scanner leer = new Scanner(System.in);
     String frase;
     System.out.print("Introduce una frase: ");
     frase = leer.nextLine();
     StringTokenizer st = new StringTokenizer(frase);
     System.out.println("Número de palabras: " + st.countTokens()); 
}
public static void Factorial() {
	int num;
    double factorial;
    Scanner leer = new Scanner(System.in);
    do{
        System.out.print("Introduce un número > 0: ");
        num =leer.nextInt();
    }while(num<0);

    for(int i = 0; i <= num ; i++){                                                
       
        factorial = 1;
        for(int j = 1; j <= i; j++){
            factorial = factorial * j;
        }
        System.out.printf("%2d! = %.0f %n", i, factorial);
    }
   
}
public static void NumerosAcabadosEn2() {

    Scanner leer = new Scanner(System.in);
    int n, contador=0;

    System.out.print("Introduce un número entero: ");
    n =leer.nextInt();
    while(n>=0){
          if(n%10==2){      
             contador++;               
          }
          System.out.print("Introduce un número entero: ");
          n =leer.nextInt();
    }
    System.out.println("Se han introducido " + contador + " números acabados en 2");                          
}
}

