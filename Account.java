public class Account {
 private String Id;
 private String name;
 private int balance =0;
 private int credit;
 private int debit;
 public Account(String Id, String name, int balance){
     this.Id = Id;
     this.name = name;
     this.balance = balance;
 }
 public Account(String Id, String name){
     this.Id=Id;
     this.name= name; }

public Account() {

    }

public boolean hasMoney() {
        return this.balance > 0;}

public void credit(int amount ){
    this.balance += amount;

 }

public void debit(int amount){
    this.balance -= amount;

 }

public void transferTo(Account other, int amount) {
        this.debit(amount);
        other.credit(amount);
    }


public String toString() {
        return "Account{" + "id='" + Id + '\'' + ", name='" + name + '\'' + ", balance=" + balance + '}';}

public void setId(String Id){

     this.Id = Id;
 }
public void setName(String name){
     this.name = name;
}
public void setBalance(int balance){
     balance = debit - credit;
     this.balance = balance;
}


public String getId() {
        return Id;
    }

public String getName(){
         return name;
    }

public int getBalance(){
     return balance;
    }

}
