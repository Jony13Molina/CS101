import java.util.*;
	




class UIMS{
    public int[] userT;
    public int[] digitSequence;
    public String uid;
    public int customerID = 0;
    public int m = 0;

		
	public boolean isAvailable(String uid){
	      if(uid.equals(hash(uid))){
		return false;
	      }
 		else{
                return true;
               }	

	} 
	//precondtion uid is available 
	//postcondition uid is in hash table userT associated with cid and customerID = cid +1 
	public void add(String uid ){




	}
	public int lookUpCustomerID(String uid){
	


	}
	public int size(){
	    for(int i = 0; i < userT.size; i++){
		m = userT[i];
            }
             
		return m; 
	}
	public int hash(String uid){


	}
	public void generateSalt(){
	
	}
	public void load(){
	
	}

	public void reallocate(){
	
	}





}
