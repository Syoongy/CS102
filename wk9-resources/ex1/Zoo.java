import java.util.*;

public class Zoo {
  private ArrayList<Animal> animals;

  public Zoo() {
    animals = new ArrayList<Animal>();
  }

  public void addAnimal(Animal e) {
    animals.add(e);
  }

  public double calculateAverageDonation() {
    double totalDonation = 0.0;

    for (int i = 0 ; i < animals.size() ; i++) {
      Animal e = animals.get(i);
      totalDonation += e.getDonation();
    }
    return totalDonation / animals.size();
  }

  public int calculateNumAnimalsInZoo(char category) {
    int count = 0;

    for (int i = 0 ; i < animals.size() ; i++) {
      Animal e = animals.get(i);
      if (e.getCategory() == category) {
        count++;
      }      
    }
    return count;
  }
}