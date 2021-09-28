class Store {
    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class Customer implements Member {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("OK I will visit " + name);
    }
}

interface Member {
    void callback();
}


public class CallBack {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
