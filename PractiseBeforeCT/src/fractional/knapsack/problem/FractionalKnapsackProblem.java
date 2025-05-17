package fractional.knapsack.problem;

public class FractionalKnapsackProblem {

	private double item;
	private double profit;
	private double weight;
	
	public double getItem() {
		return item;
	}
	public void setItem(double item) {
		this.item = item;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "FractionalKnapsackProblem [item=" + item + ", profit=" + profit + ", weight=" + weight + "]";
	}
	
}
