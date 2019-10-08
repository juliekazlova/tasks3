package by.epam.j_lab.unit3.avolzak;

public class Customer {
    static int customersCount=0;
    private int id;
    private String surname;
    private String firstName;
    private String fathersName;
    private String adress;
    private long cardNumber;
    private long bankAccountNumber;


    public Customer( String surname, String firstName, String fathersName, String adress, long cardNumber, long bankAccountNumber) {
        this.id = customersCount;
        customersCount++;
        this.surname = surname;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer( String surname, String firstName, String fathersName) {
        this.id = customersCount;
        customersCount++;
        this.surname = surname;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.adress = null;
        this.cardNumber = 0;
        this.bankAccountNumber = 0;
    }

    public Customer() {
        this.id = customersCount;
        customersCount++;
        this.surname = "NO_NAME";
        this.firstName = null;
        this.fathersName =null;
        this.adress = null;
        this.cardNumber = 0;
        this.bankAccountNumber = 0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public static int getCustomersCount() {
        return customersCount;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(id).append(": ").append(surname).append(" ").append(firstName).append(" ").append(fathersName).append(", ").append(adress).append(", card: ").append(", account: ").append(bankAccountNumber);
        return  sb.toString();
    }
}
