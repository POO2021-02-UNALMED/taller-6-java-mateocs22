package vehiculos;

public class Camion extends Vehiculo {
	
	private static int numCamion;
	int ejes;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes= ejes;
		numCamion++;
		
	}
	
	public void setEjes(int ejes) {
		this.ejes= ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	static public int getNumCamion() {
		return numCamion;
	}

}
