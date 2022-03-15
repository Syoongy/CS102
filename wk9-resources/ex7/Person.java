public class Person{
	private String name;
	private int monthBornIn;
	
	public Person (String name, int monthBornIn) throws Exception{
		if (name.equals("")) throw new Exception("Invalid Name");
		this.name = name;
		this.monthBornIn = monthBornIn;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMonthBornIn() {
		return monthBornIn;
	}
	
	public String toString() {
		return "(" + name + "," + monthBornIn + ")";
	}
}