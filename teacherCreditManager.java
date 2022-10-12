package interfaceDemo;

public class teacherCreditManager extends BaseCreditManager implements iCreditManager {

	@Override
	public void calculator() {
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}

}
