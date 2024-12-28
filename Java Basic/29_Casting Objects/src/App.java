class Machine{
	public void start(){
		System.out.println("Machine Started");
	}
	public void stop(){
		System.out.println("Machine Stopped");
	}
}

class Camera extends Machine{
	@Override
	public void start(){

		System.out.println("Camera Started");
	}
	@Override
	public void stop(){
		System.out.println("Camera Stopped");
	}
	public void snap(){
		System.out.println("Photo Taken");
	}
}
public class App {
	public static void main(String[] args) {
		Machine mac1=new Machine();
		mac1.start();
		mac1.stop();
		
		Camera cam1=new Camera();
		cam1.start();
		cam1.stop();
		cam1.snap();
		
		
		Machine mac2=cam1;// upCasting
		mac2.start();
		mac2.stop();
		//mac2.snap();  cannot call that is not override
		
//		Machine mac3=new Machine();//downCasting
//		Camera cam2=(Camera) mac3;
//		cam2.start();cannot call
//		cam2.stop();cannnot call
//		cam2.snap();cannnot call
//		
	}
}
