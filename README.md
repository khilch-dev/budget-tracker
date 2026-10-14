# budget-tracker

Please fork and clone this repository. Remember to fork before you clone. MAKE COMMITS AS YOU WORK!

## Wave 0: Understand
Take a bit of time to read through BudgetApp.java and sampleSpending.txt. Make a prediction of what the output will be when you run it. Then run the below command (make sure you are in the budget-tracker directory):

```
javac src/*.java && java -cp src BudgetApp < sampleSpending.txt
```

Discuss whether the output matched what you expected. You do not need to write or commit anything for this wave.

## Wave 1: BudgetCategory Constructor, Getters, and toString

In this wave you will start the BudgetCategory class. This class is meant to hold information about a certain budget category. Discuss with your partner what instance variables it will need to capture the information in the sample spending file. Create those instance variables as private and make a constructor that takes in and sets those fields.

Then, add getters and a toString method. You can choose what the format of the toString looks like.

Initially validate that you code is working by manually creating a BudgetCategory in the main method of BudgetApp. First, comment out the existing logic in the method. Then, create a category in a manner similar to this:

```
BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
```

The exact order of your arguments may be different depending on how you choose to make your constructor. Then, write more code to call your getters and toString. Print out the result, and manually validate that it is working.

Make sure to add, commit and push your code! You may end up making multiple commits over the course of this wave.

## Wave 2: BudgetApp Refactor

Comment out your validation code where you manually created a category at the top of the BudgetApp main method. Uncomment the logic that was there when you first cloned the repo. Delete the print statements inside the `while` loop. Instead, make a list of BudgetCategory instances and add each of the categories scanned in the loop. After the loop, print the whole list. Run your code and validate that it works.

Make sure to add, commit and push your code!

## Wave 3: BudgetCategory Comparable

Make your BudgetCategory class implement the `Comparable<BudgetCategory>` interface. Order the categories by how much over/under budget the category is. For example, if I spent $5 less than my limit for groceries, $30 less than my limit for my entertainment, and $100 over my limit for eating out, then the order should be entertainment, groceries, eating out.

Make sure to add, commit and push your code! You may end up making multiple commits over the course of this wave.

## Wave 4: BudgetApp Calculations

Add a line in BudgetApp's main to order the Categories from MOST overspent to least. Note that this is the REVERSE order of your compareTo. Print out the newly ordered list and verify it works properly.

Next, implement `budgetDifference` according to the Javadoc comment. Note that the `budgetDifference` method SHOULD NOT have a print statement. Instead, it should return the value. Call the method in main, and in the main method print out the result that is returned. Run it against the sample input and verify it works.

Make sure to add, commit and push your code! You may end up making multiple commits over the course of this wave.

## Wave 5: Your choice!

Add at least one piece of new functionality of your choosing! Some options might consider:
- Calculate the average over/under budget across all categories
- Calculate the percentage over/under budgets
- Handle multiple months
- Create an ASCII bar chart showing the relative spend on your budget, for example:
    ```
    Rent:          | **********
    Entertainment: | *****
    Food:          | **
    ```
- Anything else you think might be interesting to add!

Make sure to add commit and push. You may end up making multiple commits over the course of this wave

## Wave 6: Output

Save the output of running your code against the sample spending to a file `output.txt`. You can achieve this with this command:

```
javac src/*.java && java -cp src BudgetApp < sampleSpending.txt > output.txt
```

When running this command you will not see any output in the terminal. Instead, it will be saved to `output.txt`. Add, commit, and push this output file.

## Optional Wave 7: Your Finances 

You do not need to turn anything in or commit anything for this wave. It's just for your own financial health! Consider breaking your real-life expenses into categories. Make a predicition of how much you spend on them each month. Then, go over your spending (bank account statements, credit card statements, etc.) and add up what you actually spent. See how close or far off your estimates were. You can plug your data into your code and see it summarized! But be careful not to commit your actual data if you don't want it publicly posted.

## Sumbitting
Make a PR and copy the link to Canvas to submit.
