public class l2806 {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        double x = (double) purchaseAmount / 10;
        x = Math.round(x);

        x *= 10;

        return 100 - (int) x;
    }

    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(15));
    }
}