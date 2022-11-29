public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 30.5;
        double dripCoffee = 20.75;
        double latte = 50.99;
        double cappuccino = 40.99;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        // Cindhuri ordered a coffee, print status message
        // System.out.println(customer1 + readyMessage);
        
        // Noah ordered cappuccino. if true, display order total.
        // if(isReadyOrder2 == true) {
        //     System.out.println(customer2 + readyMessage);
        //     System.out.println("Your order total is $" + cappuccino);
        // }
        // else {
        //     System.out.println(customer4 + pendingMessage);
        // }

        // Same answer as above but as a ternary
        // System.out.println(isReadyOrder4 ? customer4 + readyMessage + ". Your order total is $" + cappuccino : customer4 + pendingMessage);

        // Sam ordered 2 lattes. print total if ready. if not ready print pending message
        // System.out.println(isReadyOrder2 ? latte * 2 : customer2 + pendingMessage);

        // Jimmy was charged for a coffee but ordered a latte.
        // System.out.println(customer2 + " owes the cafe $" + (dripCoffee - latte));
    }
}