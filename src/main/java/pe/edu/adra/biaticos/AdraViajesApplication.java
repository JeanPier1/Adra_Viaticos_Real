package pe.edu.adra.biaticos;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AdraViajesApplication /*implements CommandLineRunner*/ {

//	@Autowired
//	private BCryptPasswordEncoder passednco;
	
	public static void main(String[] args) {
		SpringApplication.run(AdraViajesApplication.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String password = "123";
		
		for (int i = 0; i < 4; i++) {
			String passwordBycytp = passednco.encode(password);
			System.out.println(passwordBycytp);
		}
	}*/

}
