package clase4;

import java.util.Arrays;

public class ej1a {

public static void main(String[] args) {
		
	
		
		int[] numord=ordenador( 9,3,7,"descendente");
		System.out.println(Arrays.toString(numord));
		
		
	}
	
	
	
	public static int[]ordenador(int n1, int n2, int n3, String orden) {
	  int[] vectormt= new int[] {n1,n2,n3};
	   
	     for(int i=0; i<vectormt.length; i++){
	    	 for(int j=i+1; j<vectormt.length; j++) {
	    		 if (orden.equals("ascendente")) {
	    	       if(vectormt[j]<vectormt[i]) {
	    			 int ant = vectormt[i];
	    	    	 int menor = vectormt[j];
	    			 vectormt[i]=menor;
	    			 vectormt[j]=ant;
	    			 
	    		    	 
	    		     }
	    	     
	    	 }
	    		 else if(orden.equals("descendente")){	 
	    			 if(vectormt[j]>vectormt[i]) {
	    			 int ant = vectormt[i];
	    	    	 int menor = vectormt[j];
	    			 vectormt[i]=menor;
	    			 vectormt[j]=ant;
	    			 
	    		    	 
	    		     }
	    		 
	           } 		 
	    		 
	    		 
	    	 }
	     
	     }
	
	return vectormt;
	
	
	
	}
	
}

	

