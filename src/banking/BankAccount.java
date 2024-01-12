package banking;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    // 7
    // vi skulle kunna ha enum men vi har bar två
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    // OBS TYPEOF ACCOUNT KOMMER I STEG 7
    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    // 7
    public boolean isChecking() {
        return accountType == CHECKING;
    }// TILLBAKA TILL TEST KLASSEN

    // branch is true if the customer is performing the transaction
    // at a branch with a banking staff
    // it's false if the customer is performing the transaction at a atm
    public double deposit (double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // branch is true if the customer is performing the transaction
    // at a branch with a banking staff
    // it's false if the customer is performing the transaction at a atm
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    // intellij har junit by default men det lägger inte till det i projektet
    // public class BankAccount + opt+enter eller alt+enter
    // välj 4

    // vi får en ny bank class för test som blir röd
    // en unit är oftast en metod
    // vår referens till junit är inte fixad än därför är den röd
    // project structure => modules => klicka i 4 sen klicka compile istället för test

    // högerklicka utanför en metod och välj run/debug
    // gör nån println i main och kör filen
    // sen kan vi köra teste filen

    // till vänster ser vi alla våra tester och hur lång tid
    // det tog att köra testerna
    // men det här är inte bra faktiskt för vi har ju ingenting i metoderna?
    // lägg till throws Eception
    // fail()
    // testerna failar
    // och det här gör att vi kan säkra upp att vi inte kör tester som
    // råkar bli gröna
    // det vi gör är att vi kommer testa en assertion mot det som vi förväntar oss
    // och om assertion failar failar testet

    // lägga till ett test i vår klass, på riktigt hade vi inte gjort så
    // ett test måste annoteras, vara public och returnera void
    // äldre versioner hade inte annoreringar då började dom med Test i namnet



}
