package etherealcv.showcase;
import connectiondriver.MongoCred;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ShowcaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShowcaseApplication.class, args);
	}


	MongoCred mongoCred;

}

