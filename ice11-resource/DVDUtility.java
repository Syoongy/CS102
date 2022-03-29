import java.util.*;

public class DVDUtility {
    public static DVD getMostExpensiveDVD(DVD[] array) {
        if (array == null) {
            return null;
        }
        DVD retDVD = null;
        for (DVD dvd : array) {
            if (retDVD == null || retDVD.getPrice() < dvd.getPrice()) {
                retDVD = dvd;
            }
        }
        return retDVD;
    }

    public static List<DVD> getDVDWithGenre(DVD[] array, String genre) {
        if (array == null || genre == null) {
            return null;
        }

        List<DVD> retList = new ArrayList<>();

        for (DVD dvd : array) {
            if (genre.equals(dvd.getGenre())) {
                retList.add(dvd);
            }
        }

        return retList;
    }

    public static List<DVD> getDVDWithPriceBetween(DVD[] array, int minPrice, int maxPrice) {

        if (array == null) {
            return null;
        }

        List<DVD> retList = new ArrayList<>();
        for (DVD dvd : array) {

            double priceOfDVD = dvd.getPrice();

            if (priceOfDVD >= minPrice && priceOfDVD <= maxPrice) {
                retList.add(dvd);
            }
        }

        return retList;
    }

    public static String[] getDVDTitlesInYear(DVD[] array, int year) {

        if (array == null) {
            return new String[0];
        }

        List<String> retList = new ArrayList<>();

        for (DVD dvd : array) {
            if (dvd.getYear() == year) {
                retList.add(dvd.getTitle());
            }
        }

        String[] retArr = new String[retList.size()];
        return retList.toArray(retArr);
    }

    public static List<DVD> getUniqueDVDs(DVD[] array, DVD[] anotherArray) {

        if (array == null) {
            return Arrays.asList(anotherArray);
        }

        if (anotherArray == null) {
            return Arrays.asList(array);
        }

        List<DVD> origList = Arrays.asList(array);
        List<DVD> anotherList = Arrays.asList(anotherArray);

        Set<DVD> combinedSet = new HashSet<>(origList);
        combinedSet.addAll(anotherList);

        Set<DVD> intersectingSet = new HashSet<>(origList);
        intersectingSet.retainAll(anotherList);

        combinedSet.removeAll(intersectingSet);

        return new ArrayList<>(combinedSet);

    }
}
