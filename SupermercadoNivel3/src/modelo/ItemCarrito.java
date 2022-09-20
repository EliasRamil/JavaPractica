package modelo;

public class ItemCarrito {
	private int iIDItem;
	private Producto producto;
	private int iCantidad;
	
	//Constructores:
	public ItemCarrito(int iIDItem, Producto producto, int iCantidad) {
		this.iIDItem = iIDItem;
		this.producto = producto;
		this.iCantidad = iCantidad;
	}
	
	//Metodos:
	

	
	//Funciones basicas:
	public int getiIDItem() {
		return iIDItem;
	}

	protected void setiIDItem(int iIDItem) {
		this.iIDItem = iIDItem;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getiCantidad() {
		return iCantidad;
	}

	public void setiCantidad(int iCantidad) {
		this.iCantidad = iCantidad;
	}

	@Override
	public String toString() {
		return "ItemCarrito [ID= " + iIDItem + ", Nombre= " + producto + ", Cantidad= " + iCantidad + "]";
	}
	
	public boolean equals(ItemCarrito i) {
		return (iIDItem == i.iIDItem && producto.equals(i.producto) && iCantidad == i.iCantidad) ? true : false;
	}
}
