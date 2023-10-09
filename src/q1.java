public class q1 {
    final static int WHOLESALE_PRCIE = 120;
    final static int RETAIL_PRICE = 200;
    final static int APPLES_NUM = 58923;
    final static int RICH_NUM = 258;
    public static void main(String[] args) {
        int totalCost = WHOLESALE_PRCIE * APPLES_NUM;
        int eachShare = APPLES_NUM / RICH_NUM;
        int costPerPerson = eachShare * RETAIL_PRICE;
        int everyoneCost = costPerPerson * RICH_NUM;
        int notSoldApples = APPLES_NUM % RICH_NUM;
        int notSoldApplesCost = notSoldApples * WHOLESALE_PRCIE;
        int profit = everyoneCost - totalCost - notSoldApplesCost;

    }
}
