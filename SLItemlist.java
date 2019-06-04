import java.util.*;
//import java.lang.Object;



class SLItemlist{
	
	//makes the SLItemlist object
	private class Node{
		String uid;
		int customerIDs;
		Node next;
	Node(String parta, int partb){
			customerIDs = partb;
			 uid = parta; 
			next = null;

		}

          }
    
//
	public Node head;// makes head 
        private int customerIDs;
	
	//constructor for Dictionary class
	public SLItemlist(){
		head = null;
		customerIDs = 0;
               
	}
        

	//private method helper function 
	private Node find(String uid){
		Node H;
		for(H = head; H!= null; H = H.next){
	            if(H.uid.equals(uid)){

                         return H;
                    } 
                             
	        }
		
		return null;
	}//closes findkey
	//ADT METHODS BEGIN HERE!!!!!!
	public boolean isEmpty(){
		return(customerIDs == 0);

	}

	public int size(){
		return customerIDs;
	}
/*	public String lookup(String uid){
		SLItemlist H = find(uid);
                if(H != null){
             // String s = toString(customerIDs);//toString 
                  return H.customerIDs; 
	        }else{
                  return null;
                }
        }//closes lookup method*/
	public void pushFront( String uid, int customerIDs){
	    Node H;
 	            
              if( head == null){
                H = new Node(uid, customerIDs);
		H.next = head;
                head = H;
               customerIDs++;
	      }else{
                H = new Node( uid, customerIDs);
		H.next = head;
		head = H;
		customerIDs++;
              }
         /*    }else{
               H = head;
               while(H != null){
                 if(H.next == null){
                 break;
                }
                H = H.next;
                }*/
		//H = head;
	
                ///H.next = new Node(uid, customerIDs);
                //customerIDs++;
              }
                    
	    

                        
	
		     
       
/*	public void delete(String key)
               throws KeyNotFoundException{
                Node Pre = head;
		if(lookup(key) == null){
			throw new KeyNotFoundException("Cannot delete non-existent key.");
		}
		if(head.key.equals(key)){
			head = head.next;
			
		}
	
               
		for(Node H = head; H != null; H = H.next){
                  
                 
		 if(H.key.equals(key)){ 
		      Pre.next = H.next;
                      H.next = null;                
				 
		}
	        Pre = H;	
		}
                numItems--;
		
               return;
	} */
    /* public void makeEmpty(){	
         head = null;
         numItems = 0;
     }	
  
   */
   public String  toString(){
    Node H;

    //String s = String.valueOf(customerIDs);
    StringBuffer sb = new StringBuffer();
    
    
    for(H = head; H != null; H = H.next){
    
    sb.append(H.uid +  "\n" +  H.customerIDs+ "\n");//.toString after customerIDs

    }
    return new String(sb);
    
   
   
  }

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


