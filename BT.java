class A extends Thread{
public void run(){
	for(int i=5;i>0;i--){
		System.out.println("Thread of class A is running: i="+i);
		System.out.println("Thread of class B is running: i="+i);	
	}
}	
}
class BT extends Thread{
	public void run(){
	/*	for(int i=5;i>0;i--){
		System.out.println("Thread of class B is running: i="+i);	
		} */
	}
	public static void main(String args[]){
		A a1=new A();
		BT b1=new BT();
		a1.start();
		b1.start();
	}
}
