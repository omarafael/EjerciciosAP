package clase1;

public class ej2d {

public static void main(String[] args) {
		
		float ingresos = 300000;
		int vehiculos = 1;
		int inmuebles = 1;
		boolean embarcacion=false;
		boolean aeronave=false;
		boolean activos=false;
		/*********************************************/
		if ((ingresos >= 489083)||(vehiculos>=3)||(inmuebles>=3)||(embarcacion==true)||(aeronave==true)||(activos==true)) {
		System.out.println("Perteneciente al segmento de altos ingresos");
		} else  {
		System.out.println("No Perteneciente al segmento de altos ingresos");
		} 
	}
	
	
}
