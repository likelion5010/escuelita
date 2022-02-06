package txt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author INGESIS
 */
public class usuario {
    
     //Zona de variables 
	private String nombre;
    private String apellido;
    private String id;
    private String grado;
	private String usuario;
    private String password;
    File   FicheroProducto= new File("estudiantes.txt");
    ArrayList<usuario> usuarios =new ArrayList<usuario>();
    usuario objeto = null;
    //zona de metodos
    
	public String getNombre() {
		return nombre;
	}
	public usuario(String nombre, String apellido, String id, String grado, String usuario, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.grado = grado;
		this.usuario = usuario;
		this.password = password;
	}
	public usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}

}