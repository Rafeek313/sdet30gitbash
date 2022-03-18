package eclipseDemo;

public class Flower {

	String clr,type;
	public	Flower(String clr,String type){
			this.clr=clr;
			this.type=type;

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.clr+" "+this.type;
	}

}
