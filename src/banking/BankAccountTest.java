package banking;

import static org.junit.Assert.*;

public class BankAccountTest {

    // 8 LÄGG TILL ACCOUNTYPE
//3
    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Helena", "Johansson", 2000, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        // här kan vi använda assert för att asserta att värdet ska vara 2200
        assertEquals(2200.00, balance, 0);
        // delta the maximum delta between expected and actual
        // for which both numbers are still considered equal.

        // kör testerna
        // nu är det här testet grönt
        // vi kan ha fler än en assert

        // OBS 4
       // assertEquals(2200.00, account.getBalance(), 0);
        // blir fortfarande grönt
        // ett test ska vara self contained
        // alltså ett test ska inte vara beroende av vad som händer i ett annat test
        // och testet ska kunna köras helt självständigt
        // vi kan dock ha instans variabler i en test metod vilket ibland kan behövas
        // men tänk på att alltid ställa frågan kan testet köras själv?
        // och svaret bör alltid vara ja


        //fail("This test has not been implemented yet");
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This test has not been implemented yet");
    }

    // 5 ta bort asser med account på första
    // kör tester sen och nu har vi två gröna tester
    /*@org.junit.Test
    public void getBalance() throws Exception {
        BankAccount account = new BankAccount("Helena", "Johansson", 2000);
        account.deposit(200.00, true);
        assertEquals(2200.00, account.getBalance(), 0);
    }*/

    // en viktig sak är att testmetoder bör ha tydliga namn
    // så vi döper om
    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Helena", "Johansson", 2000,  BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(2200.00, account.getBalance(), 0);
    }

    // 6
    // kör vi det här har vi 3 av 4 gröna
    // finns en toggle knapp den lilla bocken i test consolen
    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Helena", "Johansson", 2000,  BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(1800.00, account.getBalance(), 0);
    }

    // 7 gör en ny metod i BankAccount

    // 9
    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Helena", "Johansson", 2000,  BankAccount.CHECKING);
        //assertEquals(true, account.isChecking());
        // vi kan glra så här
        // men det är bättre att använda assertTrue eller false
        //assertTrue(account.isChecking());
        // och vi kör igen

        //10
        // nu kan vi testa vårt meddelande
        //BankAccount account = new BankAccount("Helena", "Johansson", 2000,  BankAccount.SAVINGS);
        // såna här meddelanden är superbra när vi automatiserar tester i ci för att
        // se vad som går fel

        // vi kan lägga in ett meddelande som visas om det inte är true
        //assertTrue("The account is NOT a checking account", account.isChecking());
    }




    // 2
   // @org.junit.Test
   // public void dummyTest() {
        // vi skapar assertions om vad vi tror ska hända
        // och om dom här assertions är uppfyllda
        // så blir testet grönt annars failar det
        // men ett test kan bli grönt även om vår kod innehåller
        // buggar för att vi inte har assertat rätt
        // så en tom testmetod blir grön
     //   assertEquals(20, 21);
        // första värdet är det vi förväntar oss och andra är det vi vill testa
        // klicka på grön pil till vänster
        // och självklart failar det
        // vi kan ta bort den här metoden
        // gå till dropdown till höger
        // välj edit cofig ta bort dummy test
   // }
}



