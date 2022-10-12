package interfaceDemo;

public class militaryCreditManager extends BaseCreditManager implements iCreditManager {

	@Override
	public void calculator() {
		System.out.println("Asker kredisi hesaplandı");
		
	}


}
