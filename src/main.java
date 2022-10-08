public class main {
    public static void main(String[] args) {

        int account = 100;

        int moneyAdded = 1000;

        int bonus;

        if (moneyAdded >= 1000) {
            bonus = moneyAdded / 100;
        } else {
            bonus = 0;
        }

        System.out.println("денег на счете: " + (account+moneyAdded+bonus));
        System.out.println("бонус составил: " + bonus);

    }
}