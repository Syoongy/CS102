import java.util.Scanner;

public class Q6PartD {
    public static void main(String[] args) {

        /* Creates a community garden. */
        CommunityGarden garden = new CommunityGarden("Duke Garden");

        System.out.println();

        System.out.println("Part D: getPercentageOfLeasedPlotsWithCrop");
        System.out.println("Test 1: Passed in category V(vegetable)");
        System.out.println("Expected:50.0");
        System.out.println("Actual  :" + getPercentageOfLeasedPlotsWithCrop(garden, 'V'));
        System.out.println();
        System.out.println("Test 2: Passed in category F(flower)");
        System.out.println("Expected:33.333333333333336");
        System.out.println("Actual  :" + getPercentageOfLeasedPlotsWithCrop(garden, 'F'));
        System.out.println("Note: output may differ slightly due to floating point error.");
        System.out.println();
    }

    /*
     * garden - the specified community garden, assumed not null.
     * category - the crop's category (F, V or H)
     * (F - Flower, V - Vegetable , H - Herb)
     *
     * Returns the percentage of leased plots (i.e.
     * plots that has a farmer) with the specified category of crop planted
     * i.e.
     * total leased plots with specified category of crop planted
     * ------------------------------------------------------------
     * total leased plots
     *
     * If there is no leased plots, print 0.0.
     */
    public static double getPercentageOfLeasedPlotsWithCrop(CommunityGarden garden, char category) {
        // insert your code here.
        // We first want to get the number of plots within the garden
        int numPlots = garden.getTotalPlots();
        int numLeasedPlots = 0;
        int numLeasedPlotsWCat = 0;
        double retDbl = 0.0;
        Plot tmpPlot;

        // We now want to loop through each plot within the garden and check if they
        // match our category and are leased
        for (int i = 1; i <= numPlots; i++) {
            tmpPlot = garden.getPlot(i);

            // We check if the plot is leased and increment the numLeasedPlots if so
            if (tmpPlot.getFarmer() != null) {
                numLeasedPlots++;

                // We check if there is crop on the plot and it matches the category passed in.
                // We increment numLeasedPlotsWCat if true
                if (tmpPlot.getCrop() != null && Character.compare(tmpPlot.getCrop().getCategory(), category) == 0) {
                    numLeasedPlotsWCat++;
                }
            }
        }

        if (numLeasedPlots != 0) {
            retDbl = (numLeasedPlotsWCat * 100.0 / numLeasedPlots);
        }
        return retDbl;

    }
}