package com.salesianos.TusMayores;

import com.salesianos.TusMayores.model.Familiar;
import com.salesianos.TusMayores.model.Resident;
import com.salesianos.TusMayores.model.Worker;
import com.salesianos.TusMayores.services.familiarService;
import com.salesianos.TusMayores.services.residentService;
import com.salesianos.TusMayores.services.userService;
import com.salesianos.TusMayores.services.workerService;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class TusMayoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(TusMayoresApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(residentService residentService, familiarService familiarService, workerService workerService, PasswordEncoder passwordEncoder) {
		return args -> {

			Worker w = new Worker();
			w.setNombre("Antonio");
			w.setApellidos("Montero García");
			w.setEmail("antoniomonterosk8@gmail.com");
			w.setNombrePuesto("Encargado");
			w.setFechaAlta(LocalDate.now());
			w.setPassword(passwordEncoder.encode("1234"));

			Resident r = new Resident();
			r.setNombre("Jose Manuel");
			r.setApellidos("Pérez García");
			r.setFechaNac(LocalDate.of(1972, Month.MAY, 23));
			r.setFechaEntradaResi(LocalDate.of(2021, Month.OCTOBER, 23));

			Resident r1 = new Resident();
			r.setNombre("David");
			r.setApellidos("Mártinez Terra");
			r.setFechaNac(LocalDate.of(1954, Month.MAY, 12));
			r.setFechaEntradaResi(LocalDate.of(2015, Month.SEPTEMBER, 30));
			r.setFechaSalida(LocalDate.of(2021, Month.JANUARY, 12));
			r.setCausaSalida("Fallecimiento");

			Familiar f = new Familiar();
			f.setNombre("Luis Miguel");
			f.setApellidos("López Magaña");
			f.setEmail("lmlopez@tusmayores.com");
			f.setDni("123456789X");
			f.setFechaAlta(LocalDate.of(1987, Month.JANUARY, 12));
			f.setPassword(passwordEncoder.encode("1234"));
			f.setResident(r);



			residentService.save(r);
			residentService.save(r1);
			familiarService.save(f);
			workerService.save(w);
		};
	}

}
