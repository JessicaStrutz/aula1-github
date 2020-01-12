package entities;

public class Product {
	public String sNome;
	public double dPreco;
	public long ulQtd;
	public double dTotalValueInStock() {
		return ulQtd * dPreco;
	}
	
	public void AddProducts(long ulQtd) {
		this.ulQtd += ulQtd;
	}
	
	public void RemoveProducts(long ulQtd) {
		this.ulQtd -= ulQtd;
	}
	
	public String toString() {
		
	return "Product data: " + sNome + ", $ " + String.format("%.2f", dPreco)
	+ ", " + ulQtd + " units, Total: $ "
	+ String.format("%.2f", dTotalValueInStock());
	}
}
	//se usa this para se referenciar a um atributo e o diferenciá-lo de um parâmetro.
		

