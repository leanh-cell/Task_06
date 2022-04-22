public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id,String name)
    {
        this.name=name;
        this.id=id;
    }
    public Account(String id,String name,int balance)
    {
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getBalance()
    {
        return balance;
    }
    public int credit(int amount)
    {
        return balance+amount;
    }
    public void debit(int amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else{
            System.out.println("amount exceeded");
        }
    }
    public void transferTo(Account another,int amount)
    {
        if(amount <= balance)
        {
           balance-=amount;
           another.balance+=amount;
        }
        else
        {
            System.out.println("amount exceeded");
        }
    }

    public String toString()
    {
       return id+" " + name+" " +balance;
    }
    public static void main(String[] args)
    {
        Account e = new Account("1","vinh",10000);
        System.out.println(e);
    }

}
