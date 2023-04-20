package pas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pas.dto.Empleado;
import pas.serrvice.IEmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	IEmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoService.listarEmpleados();
	}

	@GetMapping("/empleados/trabajo/{nombretrabajo}")
	public List<Empleado> findByTrabajo(@PathVariable(name = "nombretrabajo") String nombreTrabajo) {
		return empleadoService.findByTrabajo(nombreTrabajo);
	}

	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		Empleado nuevoEmpleado = new Empleado(empleado.getId(), empleado.getNombre(), empleado.getTrabajo());
		return empleadoService.guardarEmpleado(nuevoEmpleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleadoPorId(@PathVariable(name = "id") Long id) {

		Empleado empleado_por_id = new Empleado();

		empleado_por_id = empleadoService.empleadoXID(id);

		return empleado_por_id;
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = new Empleado(id, empleado.getNombre(), empleado.getTrabajo());
		Empleado empleado_actualizado = new Empleado();

		empleado_actualizado = empleadoService.actualizarEmpleado(empleado_seleccionado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{id}")
	public void eliminarCliente(@PathVariable(name = "id") Long id) {
		empleadoService.eliminarEmpleado(id);
	}

}
