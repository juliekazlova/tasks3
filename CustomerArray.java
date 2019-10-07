package j_lab;


public class CustomerArray {
    private Customer[] customers;
    private int count=0;
    private int defCapacity=20;

    public CustomerArray(Customer[] customers) {
        this.customers = customers;
        count=customers.length;
    }

    public CustomerArray(int size) {
        this.customers = new Customer[size];
    }

    public CustomerArray(){
        this.customers=new Customer[defCapacity];
    }

    public int getCount() {
        return count;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void add(Customer obj){
        if(count>=customers.length) {
            Customer[] newCustomers = new Customer[customers.length + defCapacity];
            for (int i = 0; i < count; i++) {
                newCustomers[i] = customers[i];

            }
            customers[count] = obj;
            count++;
        }
    }



    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Customers:\n");
        for(int i=0; i<count; i++){
            sb.append(customers[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public void sort(){
        Customer cur;
        for(int i=0; i<count-1; i++){
            for(int j=i; j<count-1; j++){
                if(customers[i].getSurname().compareTo(customers[i+1].getSurname())>0){
                    cur=customers[i];
                    customers[i]=customers[i+1];
                    customers[i+1]=cur;
                }
                else if(customers[i].getSurname().compareTo(customers[i+1].getSurname())==0){
                    if(customers[i].getFirstName().compareTo(customers[i+1].getFirstName())>0){
                        cur=customers[i];
                        customers[i]=customers[i+1];
                        customers[i+1]=cur;
                    }
                    else if(customers[i].getFirstName().compareTo(customers[i+1].getFirstName())==0){
                        if(customers[i].getFathersName().compareTo(customers[i+1].getFathersName())>0){
                            cur=customers[i];
                            customers[i]=customers[i+1];
                            customers[i+1]=cur;
                        }
                    }
                }
            }
        }
    }


    public CustomerArray cardNumberSearch(long a, long b){
        CustomerArray ca=new CustomerArray();
        for(int i=0; i<count; i++){
            if(customers[i].getCardNumber()>a&&customers[i].getCardNumber()<b){
                ca.add(customers[i]);
            }
        }

        return ca;
    }
}
