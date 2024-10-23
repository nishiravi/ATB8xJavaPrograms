package October.ex_23102024.CustomException;

public class Bank {
    private String currency;
    private Integer amount;
    Bank(String currency, Integer amount)
    {
        this.currency=currency;
        this.amount=amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer addAmount(Bank bankName) throws Exception// bankName is object of type class Bank
    {
      if(bankName.currency!=this.currency)
          // Bellow we wre throwing custome exception by using "throw" and throws
          throw new Exception("Currency didt match , cant give total");
          return bankName.amount+this.amount;


    }
}
