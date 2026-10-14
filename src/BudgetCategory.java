public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent) {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    @Override
    public String toString() {
        return category + 
        " | Limit: $" + String.format("%.2f", limit) + 
        ", Spent: $" + String.format("%.2f", spent);
    }
}