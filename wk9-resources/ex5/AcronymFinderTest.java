public class AcronymFinderTest{
	public static void main(String[] args) {
		AcronymFinder af = new AcronymFinder();
		System.out.println("The definition of \"XP\" is " + af.lookup("XP"));
	}
}