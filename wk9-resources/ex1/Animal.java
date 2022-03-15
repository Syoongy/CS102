public class Animal {
  private String type;
  private char category;
  private double donation;

  public Animal(String type, char category, double salary) {
    this.type = type;
    this.category = category;
    this.donation = salary;
  }

  public char getCategory() {
    return category;
  }

  public double getDonation() {
    return donation;
  }

  public void setType(String type) {
    this.type = type;
  }
   

}