public class PhoneBookTest{
	public static void main(String[] args) {
		PhoneBook phBook = new PhoneBook();
		System.out.println("The phone number of \"Sue Black\" is " + phBook.lookup("Sue Black"));
	}
}