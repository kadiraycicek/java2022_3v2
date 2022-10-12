package interfaceDemo;

public class CustomerManager {
	public CustomerManager(Customer customer, iCreditManager creditManager) {

	}

	public void Save() {
		System.out.println("Müşteri Kaydedildi");
	}

	public void Delete() {
		System.out.println("Müşteri Silindi");
	}

	public void GiveCredit() {
		creditManager.calculate();
		System.out.println("Kredi Verildi");
	}

}
