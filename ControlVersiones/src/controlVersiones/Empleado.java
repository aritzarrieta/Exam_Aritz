package controlVersiones;
/**
 * 
 * @author Aritz
 * @version 1,2021
 * @since 24/05/2021
 * 	
 */
public class Empleado {
	
	private String nombre;
	private String apellidos;
	private double salario; 
	

/**
 * 
 * 
 *	@param nombre string de nombre
 *	@param apellido string de apellido
 *	@param salario un num doble que es el salario 
 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
/**
 * 
 * @param subida el metodo de subirsalario es para añadir al subsalario una subida
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}


}