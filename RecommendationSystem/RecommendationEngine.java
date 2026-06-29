import java.util.*;

public class RecommendationEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store product recommendations
        Map<String, List<String>> recommendations = new LinkedHashMap<>();

        recommendations.put(
                "Laptop",
                Arrays.asList(
                        "Wireless Mouse",
                        "Mechanical Keyboard",
                        "Laptop Backpack"));

        recommendations.put(
                "Mobile",
                Arrays.asList(
                        "Smart Watch",
                        "Wireless Earbuds",
                        "Power Bank"));

        recommendations.put(
                "Camera",
                Arrays.asList(
                        "Tripod",
                        "Memory Card",
                        "Camera Bag"));

        recommendations.put(
                "Book",
                Arrays.asList(
                        "Notebook",
                        "Pen",
                        "Bookmark"));

        // Title
        System.out.println("=================================================");
        System.out.println("        AI PRODUCT RECOMMENDATION SYSTEM");
        System.out.println("=================================================");

        System.out.println("\nAvailable Products:\n");

        int count = 1;

        for (String product : recommendations.keySet()) {

            System.out.println(count + ". " + product);
            count++;
        }

        System.out.println("-----------------------------------------------");

        System.out.print("Enter your preferred product: ");

        String choice = sc.nextLine().trim();

        boolean found = false;

        // Case-insensitive search
        for (String product : recommendations.keySet()) {

            if (product.equalsIgnoreCase(choice)) {

                found = true;

                System.out.println("\nSearching recommendations...");
                System.out.println("-----------------------------------------------");

                System.out.println("\nRecommendations for \"" + product + "\"\n");

                List<String> items = recommendations.get(product);

                for (String item : items) {

                    System.out.println("✓ " + item);
                }

                System.out.println("\n-----------------------------------------------");
                System.out.println("Total Recommendations : " + items.size());
                System.out.println("Recommendation Status : Success");
                break;
            }
        }

        if (!found) {

            System.out.println("\n-----------------------------------------------");
            System.out.println("No recommendations found for \"" + choice + "\".");
            System.out.println("Please choose a product from the available list.");
        }

        System.out.println("\n=================================================");
        System.out.println(" Thank you for using the AI Recommendation System");
        System.out.println("=================================================");

        sc.close();
    }
}