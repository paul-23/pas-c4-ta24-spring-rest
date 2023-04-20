package pas.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "trabajo")
	private String trabajo;

	@Column(name = "salario")
	private double salario;

	public Empleado() {

	}

	public Empleado(Long id, String nombre, String trabajo) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = asignarSalario(trabajo);
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public double getSalario() {
		return asignarSalario(trabajo);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public enum Trabajo {
		PROGRAMADOR(3000.00), DISEÑADOR(2500.00), GERENTE(5000.00), VENDEDOR(2000.00);

		private final double salario;

		Trabajo(double salario) {
			this.salario = salario;
		}

		public double getSalario() {
			return salario;
		}
	}

	public double asignarSalario(String trabajo) {
		
		Trabajo[] listaTrabajos = Trabajo.values();

		for (Trabajo trabajos : listaTrabajos) {
			if (trabajos.name().equalsIgnoreCase(trabajo)) {
				return trabajos.getSalario();
			}
		}
		return 0.0;
	}

}
