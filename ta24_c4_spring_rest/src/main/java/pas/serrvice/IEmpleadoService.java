package pas.serrvice;

import java.util.List;

import pas.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar all 
	
	public List<Empleado> findByTrabajo(String trabajo);// Listar empleados por trabajo
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado empleadoXID(Long id); //Leer datos de un empleado READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE
	
	
}
