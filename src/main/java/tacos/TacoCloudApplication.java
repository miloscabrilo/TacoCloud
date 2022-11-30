package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
		System.out.println("Hi from the other side");
		MathOperation sum = new MathOperation();
		System.out.println(sum.addTwoNumbers(1, 2));
	
	}
	
	

}
