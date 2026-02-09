class FoodMenu {
    public static void main(String args[]) {
        int choice = Integer.parseInt(args[0]);

        switch (choice) {
            case 1:
                System.out.println("You chose North Indian Food");
                break;
            case 2:
                System.out.println("You chose South Indian Food");
                break;
            case 3:
                System.out.println("You chose Chinese Food");
                break;
            case 4:
                System.out.println("You chose Japanese Food");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
