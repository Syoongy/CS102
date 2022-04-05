/*
 *
 * Name:
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/*
 * RecipeDataManager is in charge of the data persistence of the Recipe objects.
 */
public class RecipeDataManager {
    private ArrayList<Recipe> recipeList;

    /*
     * This is the data file to read or write from
     */
    private final String FILE_NAME;

    /*
     * Creates a default instance that reads the data off the file having name
     * filename
     */
    public RecipeDataManager(String fileName) {
        this.FILE_NAME = fileName;
        recipeList = new ArrayList<Recipe>();
        loadAll();
    }

    /*
     * reads from the data file and populates the recipeList attribute.
     * If there is an error reading the file, this method throws a DataException
     */
    private void loadAll() throws DataException {
        // TODO!!!
        try {
            Scanner fileSc = new Scanner(new File(this.FILE_NAME));
            // We want to skip the header
            fileSc.nextLine();

            while (fileSc.hasNextLine()) {
                String currLine = fileSc.nextLine();
                String[] recipeItemsArr = currLine.split("#");

                String recipeName = recipeItemsArr[0];
                int recipeCookingTime = Integer.parseInt(recipeItemsArr[recipeItemsArr.length - 2]);
                double recipeCost = Double.parseDouble(recipeItemsArr[recipeItemsArr.length - 1]);

                Recipe tmpRecipe = new Recipe(recipeName, recipeCookingTime, recipeCost);

                for (int i = 1; i <= 4; i++) {
                    String ingredientToAdd = recipeItemsArr[i];
                    if (!ingredientToAdd.isEmpty()) {
                        tmpRecipe.addIngredient(recipeItemsArr[i]);
                    }
                }

                this.recipeList.add(tmpRecipe);
            }

        } catch (Exception e) {
            throw new DataException(e);
        }
    }

    /*
     * returns all the recipe.
     */
    public ArrayList<Recipe> retrieveAll() {
        return recipeList;
    }

    /*
     * retrieves all Recipe objects whose cooking time exceeds(more than)
     * cookingTime.
     */
    public ArrayList<Recipe> retrieve(int cookingTime) {
        // TODO!!!
        return null;
    }

    /*
     * if the recipe does not exist,
     * 1. adds the Recipe object to the recipeList attribute
     * 2. invoke the save() method to update the data file
     *
     * if the recipe exists, this method throws an IllegalArgumentException with
     * message "recipe <name> exists"
     */
    public void addRecipe(String name, String[] ingredients, int cookingTime, double price) {
        // TODO!!!
        // Check if the there is a recipe with the same name
        for (Recipe recipe : this.recipeList) {
            if (name.equals(recipe.getName())) {
                throw new IllegalArgumentException("recipe " + name + " exists");
            }
        }

        Recipe recipeToAdd = new Recipe(name, cookingTime, price);
        for (String ingredient : ingredients) {
            if (!ingredient.isEmpty()) {
                recipeToAdd.addIngredient(ingredient);
            }
        }

        this.recipeList.add(recipeToAdd);
        this.save();
    }

    /*
     * Saves all the Recipe objects to a file called recipe.txt. It overwrites any
     * existing content.
     * If there is an error reading the file, this method throws a DataException
     */
    public void save() {
        // TODO
    }

}