package pas.ejercicio01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ta23C4SpringEjercicio02Application {

	public static void main(String[] args) {
		SpringApplication.run(Ta23C4SpringEjercicio02Application.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return String.format("Mensaje de bienvenida Graddle");
	}

	@GetMapping("/saludo")
	public String saludo() {
		return String.format("Bienvenido saludo desde Graddle");
	}

	@GetMapping("/saludar")
	public String saludo(@RequestParam(value = "nombre", defaultValue = "usuario") String nombre) {
		return String.format("Bienvenido %s desde Graddle!", nombre);
	}
}
