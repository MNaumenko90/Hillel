package payments;

public class Service {
    public void replenishment(Bill account, int amount) {
        int currentAmount = account.getAmount();
        account.setAmount(currentAmount + amount);
        System.out.println("Перевод средств на счет пользователя " + amount);
    }

    public void withdrawal(Bill account, int amount) {
        int currentAmount = account.getAmount();
        if (currentAmount >= amount) {
            account.setAmount(currentAmount - amount);
            System.out.println("Перевод средств со счета пользователя " + amount);
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    public void transaction(Person sender, Person receiver, int amount) {
        Bill senderAccount = sender.getAccount();
        Bill receiverAccount = receiver.getAccount();

        if (senderAccount.getAmount() >= amount) {
            withdrawal(senderAccount, amount);
            replenishment(receiverAccount, amount);
            System.out.println("Billy перевел " + amount + " на счет Jonny");
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }
}
