
import java.util.Scanner;

class Tender {
    private double cost;
    private String companyName;

    // Constructor to initialize cost and company name
    public Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    // Getter method to retrieve cost
    public double getCost() {
        return cost;
    }

    // Getter method to retrieve company name
    public String getCompanyName() {
        return companyName;
    }
}

public class Tender1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Tender objects to store data for five tenders
        Tender[] tenders = new Tender[5];

        // Input data for each tender and store in the array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Tender " + (i + 1) + ":");
            System.out.print("Enter cost: $");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter company name: ");
            String companyName = scanner.nextLine();
            tenders[i] = new Tender(cost, companyName);
        }

        // Find the company with the minimum cost
        String minCompanyName = tenders[0].getCompanyName();
        double minCost = tenders[0].getCost();
        for (int i = 1; i < 5; i++) {
            if (tenders[i].getCost() < minCost) {
                minCost = tenders[i].getCost();
                minCompanyName = tenders[i].getCompanyName();
            }
        }

        // Display the company name with the minimum cost
        System.out.println("\nCompany with minimum cost: " + minCompanyName + " ($" + minCost + ")");

    }
}
