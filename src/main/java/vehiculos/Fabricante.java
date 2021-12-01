package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	
	public static ArrayList<Fabricante> fabricantes=  new ArrayList<Fabricante>();
	String nombre;
	Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre= nombre;
		this.pais= pais;
		fabricantes.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre= nombre;			
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
	this.pais= pais;
    }
	
	public Pais getPais() {
		return pais;
	}
	
	static public Fabricante fabricaMayorVentas() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (Fabricante fabricante: fabricantes) {
			int b = 0;
			for(Vehiculo vehiculo : Vehiculo.vehiculos) {
				if(vehiculo.getFabricante().getNombre() == fabricante.getNombre()) {
					b++ ;
				}
			}
			a.add(b);	
		}
		return fabricantes.get(a.indexOf(Collections.max(a)));
	}   
}
