package topgear;

public class Countobj {
static int count=0;
	Countobj(){
		count++;
	}
	
	public static void main(String args[]){
		
		Countobj o1=new Countobj();
		Countobj o2=new Countobj();
		Countobj o3=new Countobj();
		Countobj o4=new Countobj();
		Countobj o5=new Countobj();
		Countobj o6=new Countobj();
		Countobj o7=new Countobj();
		Countobj o8=new Countobj();
		System.out.println("total object created till now  "+count );
		
	}
}
