package hello;
import java.math.BigDecimal;
public class TransactionMain {

	public static void main(String[] args) {
		// Une transaction a deux variables d'instance:
		// - type String (debit ou credit)
		// - amount: double (toujours positif)
		// créer 4 transaction
		// - 10 //+20//-30//+15
		
		Transaction t1 = new Transaction("debit", new BigDecimal (10)) ;
		/*t1.setType("debit");
		t1.setAmount(10);*/
		
		Transaction t2 = new Transaction("credit", new BigDecimal(20)) ;
		/*t2.setType("credit");
		t2.setAmount(20);*/
		
		Transaction t3 = new Transaction("debit", new BigDecimal(10)) ;
		/*t3.setType("debit");
		t3.setAmount(10);*/
		
		Transaction t4 = new Transaction("credit", new BigDecimal(15)) ;
	/*	t4.setType("credit");
		t4.setAmount(15);*/
		
		Transaction[] transaction = new Transaction[4];
		transaction[0] = t1;
		transaction[1] = t2;
		transaction[2] = t3;
		transaction[3] = t4;
		
		// Transaction[] transaction = {t1, t2, t3, t4};
		
		// Calculer le total des transactions
		
		BigDecimal total = BigDecimal.ZERO;
		for (int i = 0; i < transaction.length; i++) {
			if(transaction[i].getType().equals("debit")) {
				total = transaction[i].getAmount().subtract(transaction[i].getAmount());
			} else if (transaction[i].getType().equals("credit")) {
				total = transaction[i].getAmount().add(transaction[i].getAmount());
			} else {
				System.out.println("type de transacation incoonu");
				
			}
			}
		System.out.println("Total des transactions:" + total);
		}

}


