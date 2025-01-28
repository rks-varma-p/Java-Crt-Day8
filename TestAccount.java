
public class TestAccount {

	public static void main(String[] args) {
	 SbiAccount AccNo=new SbiAccount("Varma","9xxxxxxxxx9",5000);
	 System.out.println(AccNo);
	 AccNo.deposit(15000);
	 AccNo.checkBalance();
	 AccNo.withDraw(1000);
	 AccNo.checkBalance();
	}

} 