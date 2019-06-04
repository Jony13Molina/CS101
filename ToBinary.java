import java.util.*;





class ToBinary{

	public static void main(String[] args){
        int p = 11; 
	System.out.println(convert(p));		



	}

	//int [] intArray = {1, 2, 3, 4, 5};

		public static int convert(int a){
		int []intArray = {1, 2, 3, 4, 5};
                    for(int i = 0; i < 5; i++){

			int q = intArray[i];
			int r;
                	r = q%2;
			q = q/2;



		        for(int j = 0; j < intArray.length; i++){
                             int t = intArray[i];
			    convert(t);

   		
		         

		 return convert(t); 
                 }
		}

                return 0;	 
       }
} 























