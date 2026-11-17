package Project;
public class NetBankingPaymentMain {
    public static void main(String[] args) {
        // NetBankingPayment netBankingPayment = new NetBankingPayment();
        // netBankingPayment.acceptNewBankingProperties();
        // System.out.println(netBankingPayment);

        // NetBankingPayment.acceptNewBankingPayment();
        // NetBankingPayment.showAmount50KPlus();

        NetBankingPayment.acceptNewBankingPayment();
        // NetBankingPayment.showAmount50KPlus();
        // NetBankingPayment.showPaymentWhichHaveSameAmount();
        // NetBankingPayment.showlessAmount50K();
        // NetBankingPayment.showHaveAmount50K();
        
        NetBankingPayment.showPay(50000);
        NetBankingPayment.showHighestAmount();
        NetBankingPayment.showLowestAmount();
        NetBankingPayment.showSumOfAmount();
        NetBankingPayment.showAvarageAmount();
        NetBankingPayment.showCountAmount();

    }
}
