import java.util.Scanner;

public class clg_cls_2 {
    class Payment {
        int amount;

        Payment(int amount) {
            this.amount = amount;
        }

        void transaction(int card, int mm, int yy, int cvv, String name) {
            System.out.println("Done with credit/debit card");
        }

        void transaction(String user_name, String password) {
            System.out.println("Done with netbanking");
        }

        void transaction(int Phone_number) {
            System.out.println("Done with UPI");
        }
    }

    public static void main(String[] args) {
        clg_cls_2 obj = new clg_cls_2();
        clg_cls_2.Payment ob = obj.new Payment(730);
        ob.transaction(5432464, 12, 35, 455, "covi");
        ob.transaction(123478);
        ob.transaction("covi", "Done");
    }
}