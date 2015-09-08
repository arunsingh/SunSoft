//@Author: Arun Singh, arunsingh.in@gmail.com

package bhawnas;

class WoodTable extends WoodFurn  {
	
	int legs=4;
	
	void show() {
		System.out.println("Woodtype -" + type);
		System.out.println("Finish -" + finish);
		System.out.println("legs -"+ legs);
	}
	public static void main (String [] args) {
		WoodTable t=new WoodTable();
		t.show();
	}

}
