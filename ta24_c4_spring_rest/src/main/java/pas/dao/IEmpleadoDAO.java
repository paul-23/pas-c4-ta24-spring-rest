package pas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	
	public List<Empleado> findByTrabajo(String trabajo);
	
}
