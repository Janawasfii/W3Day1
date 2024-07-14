//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("1111248367","Jana",-30000);
        Account acc2 = new Account("1000527846","Sara",50000);
        Account acc3 = new Account("1029384738","Jenan",40000);
        Account acc4 = new Account("1029365488","Rayan",60000);

        if (acc1.hasMoney()) {
            System.out.println("Account " + acc1.getId() + " has money.");
        } else {
            System.out.println("Account " + acc1.getId() + " has no money.");
        }
        if (acc2.hasMoney()) {
            System.out.println("Account " + acc2.getId() + " has money.");
        } else {
            System.out.println("Account " + acc2.getId() + " has no money.");
        }if (acc3.hasMoney()) {
            System.out.println("Account " + acc3.getId() + " has money.");
        } else {
            System.out.println("Account " + acc3.getId() + " has no money.");
        }if (acc4.hasMoney()) {
            System.out.println("Account " + acc4.getId() + " has money.");
        } else {
            System.out.println("Account " + acc4.getId() + " has no money.");
        }
        System.out.println("*******************************************************");

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);

        System.out.println("*******************************************************");

         acc1.setName("Anan");
         acc2.setBalance(750);
         acc3.setBalance(60000);


        //acc1.credit(200);

        acc2.debit(300);
        acc1.transferTo(acc2, 100);

        acc2.credit(500);
        acc3.debit(800);
        acc2.transferTo(acc3,1000);

        acc4.debit(100);



        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);


        /*Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();*/
/////////////////////////////////////////////////////////
     /*   acc1.setId("1111248367");
        System.out.println(acc1.getId());
        acc1.setName("Jana");
        System.out.println(acc1.getName());
        acc1.setBalance(70000);
        System.out.println(acc1.getBalance());
        System.out.println();
/////////////////////////////////////////////////////////
        acc2.setId("1000527846");
        System.out.println(acc2.getId());
        acc2.setName("Jenan");
        System.out.println(acc2.getName());
        acc2.setBalance(50000);
        System.out.println(acc2.getBalance());
        System.out.println();
////////////////////////////////////////////////////////
        acc3.setId("1029384738");
        System.out.println(acc3.getId());
        acc3.setName("Tojan");
        System.out.println(acc3.getName());
        acc3.setBalance(40000);
        System.out.println(acc3.getBalance());
        System.out.println();*/
////////////////////////////////////////////////////////
    }
}