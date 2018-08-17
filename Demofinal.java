package topgear;

 class Demo {
	 static int count=0;
		Demo(){
			count++;
		}
		

	protected void finalize(){
		
System.out.println("finalize method called" +count);
		}
	

}

public class Demofinal{
	
	public static void main(String args[]){
		
		Demo d1=new Demo();
		d1=new Demo();
		d1=new Demo();
		d1=new Demo();
	
	//System.out.println("Gc is called "+ (Demo.count-1) + "times");	
	
	Runtime.getRuntime().gc();
			
			
		}
		
	}



