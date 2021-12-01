package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	
	public static ArrayList<Pais> paises= new ArrayList<Pais>() ;
	String nombre;
	
	public Pais(String nombre) {
		this.nombre= nombre;
		paises.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	static public Pais paisMasVendedor() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (Pais pais: paises) {
			int b = 0;
			for(Vehiculo vehiculo : Vehiculo.vehiculos) {
				if(vehiculo.getFabricante().getPais().getNombre() == pais.getNombre()) {
					b++ ;
				}
			}
			a.add(b);	
		}
		return paises.get(a.indexOf(Collections.max(a)));
	}   

}
