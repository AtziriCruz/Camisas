package fes.aragon.producto;

public class camisa {
	private String tipo;
	private String manga;
	private float precio;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getManga() {
		return manga;
	}

	public void setManga(String manga) {
		this.manga = manga;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public camisa(String tipo, String manga, float precio) {
		this.tipo = tipo;
		this.manga = manga;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "camisas [tipo=" + tipo + ", manga=" + manga + ", precio=" + precio + "]";
	}



}