package eclipseDemo;

import java.io.Serializable;

public class Student implements Serializable {
	public int id;
	public String name;
	public double perc;
	public transient long adhar;
	
}
