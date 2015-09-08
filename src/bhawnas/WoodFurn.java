//@Author : Arun Singh, arunsingh.in@gmail.com

package bhawnas;


public class WoodFurn {
	String type ="teak";
	String finish = "coarse";
	
	void showDet() {
		System.out.println("Instance of class" + this.getClass().getName());
		System.out.println("=============================================");
		System.out.println("type of wood -"+ type);
		System.out.println("finsih is  -"+ finish);
		
	}

}
