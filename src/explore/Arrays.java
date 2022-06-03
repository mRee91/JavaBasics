package explore; public class Arrays {public static void main(String[] args) {


		
		
		int [] i;
	    i= new int[10];
		
		i[5] = 50; 
		i[4] = 10;
		
		//================================
		
		int [] a = {1,2,3,4,5,50,7,8,9,10};
		
		//================================
		
		int[] b = new int[10];
		for(int x=0; x<10; x++)          {        b[x] = x*10;      }
		
		//--------------------------------
		
		int[] c = new int[10];
		for(int z=0; z<c.length; z++)    {       c[z] = z*10;       }
		
		System.out.println(i[5]);
		System.out.println(a[5]);
		System.out.println(b[5]);
		System.out.println(c[5]);
		
		
		
		
		
		
		

	}}
