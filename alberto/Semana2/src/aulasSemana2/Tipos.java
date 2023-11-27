package aulasSemana2;

public class Tipos {
	 public static void main(String[] args) {
	    	float x, y;
	    	double xb, yb;
	    	int xi, yi;
	    	
	    	x = 2;
	    	
	    	do {
	    		y = x;
	    		x = x/2;
	    	} while(x>0);
	    	System.out.println(y);
	    	
			xb = 2;
	    	
	    	do {
	    		yb = xb;
	    		xb = xb/2;
	    	} while(xb>0);
	    	System.out.println(yb);
	    	
			xi = 2;
	    	
	    	do {
	    		yi = xi;
	    		xi = xi/2;
	    	} while(xi>0);
	    	System.out.println(yi);
	    }
}
