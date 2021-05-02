package com.salesianos.TusMayores;

import com.salesianos.TusMayores.model.Worker;
import com.salesianos.TusMayores.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@SpringBootApplication
public class TusMayoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(TusMayoresApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserService service, PasswordEncoder passwordEncoder) {
		return args -> {

			Worker w = new Worker();
			w.setNombre("Antonio");
			w.setApellidos("Montero García");
			w.setEmail("antoniomonterosk8@gmail.com");
			w.setNombrePuesto("Encargado");
			w.setFechaAlta(LocalDate.now());
			w.setPassword(passwordEncoder.encode("1234"));

			service.save(w);
		};
	}

}
