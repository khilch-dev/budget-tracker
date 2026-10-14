import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // **Validation Code**
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);

        // Create new empty list
        List<BudgetCategory> categories = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // add the new category to our categories list
            BudgetCategory newCategory = new BudgetCategory(category, limit, spent);
            categories.add(newCategory);

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);
            // System.out.println("The budget limit for " + category + " was: " + limitString + 
            //                    " but the actual spend was " + spentString);
        }

        // Sort the ArrayList
        Collections.sort(categories, Collections.reverseOrder());
        System.out.println(categories);

        System.out.println("Budget difference: $" + (double) budgetDifference(categories));
        System.out.printf("Average difference: $%.2f%n", averageDifference(categories));
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        int totalDifference = 0;
        for (int i = 0; i < categories.size(); i++) {
            BudgetCategory category = categories.get(i);
            totalDifference += category.getSpent() - category.getLimit();
        }
        // return the difference
        return totalDifference;
    }

    // Wave 5, average over/under budget
    public static double averageDifference(List<BudgetCategory> categories) {
        return (double) budgetDifference(categories) / categories.size();
    }

    // // Wave 5, budget chart method (doing myself for fun)
    // public static void budgetChart(List<BudgetCategory> categories) {
    //     for (int i = 0; i < categories.size(); i++) {
    //         // get the category at i
    //         BudgetCategory category = categories.get(i);

    //         // calculate stars based on the spent amount, we'll go with 50
    //         int stars = (int) (category.getSpent()) / 50;

    //         // print the category
    //         System.out.println(category.getCategory() + " | Stars: " + "*".repeat(stars));
    //     }
    // }
}
