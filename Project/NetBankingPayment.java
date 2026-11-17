package Project;

import java.util.Scanner;

public class NetBankingPayment {
    // private int Id;
    private String username;
    private String password;
    private String transactionId;
    private int otp;
    private double amount;
    private static NetBankingPayment netBankingPaymentArray[] = new NetBankingPayment[3];

    public NetBankingPayment() {

    }

    public NetBankingPayment(String username, String password, String transactionId, int otp, double amount) {
        this.username = username;
        this.password = password;
        this.transactionId = transactionId;
        this.otp = otp;
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static NetBankingPayment[] getNetBankingPaymentArray() {
        return netBankingPaymentArray;
    }

    public static void setNetBankingPaymentArray(NetBankingPayment[] netBankingPaymentArray) {
        NetBankingPayment.netBankingPaymentArray = netBankingPaymentArray;
    }

    public void acceptNewBankingProperties() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        setUsername(sc.nextLine());

        System.out.println("Enter Password : ");
        setPassword(sc.nextLine());

        System.out.println("Enter TransactionId : ");
        setTransactionId(sc.nextLine());

        System.out.println("Enter OTP : ");
        setOtp(sc.nextInt());

        System.out.println("Enter Amount : ");
        setAmount(sc.nextDouble());
    }

    public static void acceptNewBankingPayment() {
        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            netBankingPaymentArray[i] = new NetBankingPayment();
            netBankingPaymentArray[i].acceptNewBankingProperties();
        }
    }

    // public static void acceptAmmountPayment() {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter How many amount want to accept?");
    // int amount = sc.nextInt();
    // sc.nextLine();
    // }

    public static void showAmount50KPlus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount You want to show the User Info : ");
        double amount = sc.nextDouble();

        for (NetBankingPayment payment : netBankingPaymentArray) {
            if (payment.getAmount() > amount) {
                System.out.println(payment);
            }
        }
    }

    public static void showPaymentWhichHaveSameAmount() {

        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            for (int j = i + 1; j < netBankingPaymentArray.length; j++) {
                if (netBankingPaymentArray[i].getAmount() == netBankingPaymentArray[j].getAmount()) {
                    System.out.println("Payments with same amount:");
                    System.out.println(netBankingPaymentArray[i]);
                    System.out.println(netBankingPaymentArray[j]);
                }
            }
        }
    }

    public static void showlessAmount50K() {
        for (NetBankingPayment payment : netBankingPaymentArray) {
            if (payment.getAmount() < 50000) {
                System.out.println(payment);
            }
        }
    }

    public static void showHaveAmount50K() {
        for (NetBankingPayment payment : netBankingPaymentArray) {
            if (payment.getAmount() == 50000) {
                System.out.println(payment);
            }
        }
    }

    // public static void showHighestAmount() {
    //     // NetBankingPayment highest = null;

    //     // for (NetBankingPayment payment : netBankingPaymentArray) {
    //     //     if (payment != null && (highest == null || payment.getAmount() > highest.getAmount())) {
    //     //         highest = payment;
    //     //     }
    //     // }

    //     // if (highest != null) {
    //     //     System.out.println(highest);
    //     // } else {
    //     //     System.out.println("No payments found.");
    //     // }

    //     double highestAmount = 0;
    //     NetBankingPayment highestPayment = null;

    //     for (NetBankingPayment payment : netBankingPaymentArray) {
    //         if (payment.getAmount() > highestAmount) {
    //             highestAmount = payment.getAmount();
    //             highestPayment = payment;
    //         }
    //     }

    //     if (highestPayment != null) {
    //         System.out.println(highestPayment);
    //     } else {
    //         System.out.println("No payments found.");
    //     }
    // }

    public static void showHighestAmount() {
        double maxAmount = netBankingPaymentArray[0].getAmount();
        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            if (netBankingPaymentArray[i].getAmount() > maxAmount) {
                maxAmount = netBankingPaymentArray[i].getAmount();
            }
        }
        System.out.print("Max Amount : " + maxAmount + "\n");
        showPay(maxAmount);
    }

    public static void showLowestAmount() {
        double minAmmount = netBankingPaymentArray[0].getAmount();
        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            if (netBankingPaymentArray[i].getAmount() < minAmmount) {
                minAmmount = netBankingPaymentArray[i].getAmount();
            }
        }
        System.out.print("Min Amount : " + minAmmount + "\n");
        showPay(minAmmount);
    }

    public static void showPay(double amount) {
        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            if (netBankingPaymentArray[i].getAmount() == amount) {
                System.out.println(netBankingPaymentArray[i]);
            }
        }
    }

    public static void showSumOfAmount() {
        double sum = 0;

        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            sum += netBankingPaymentArray[i].getAmount();
        }
        System.out.println("Total Sum : " + sum);
    }

    public static void showAvarageAmount() {
        double sum = 0;
        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            sum += netBankingPaymentArray[i].getAmount();
        }
        double avg = sum / netBankingPaymentArray.length;
        System.out.println("Avarage Amount : " + avg);
    }

    public static void showCountAmount() {
        int count = 0;
        for (int i = 0; i < netBankingPaymentArray.length; i++) {
            count++;
        }

        System.out.println("Total Count : " + count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetBankingPayment{");
        sb.append("username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", otp=").append(otp);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
