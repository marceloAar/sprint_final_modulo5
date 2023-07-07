package m5abpro1.Model;

import java.time.LocalDate;

public class Visita {
	private int id;
	private int cliente_id;
	private LocalDate fecha_visita;
	private String detalle;
	private int profesional_id;
	
	public Visita() {
		super();
	}

	public Visita(int id, int cliente_id, LocalDate fecha_visita, String detalle, int profesional_id) {
		super();
		this.id = id;
		this.cliente_id = cliente_id;
		this.fecha_visita = fecha_visita;
		this.detalle = detalle;
		this.profesional_id = profesional_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public LocalDate getFecha_visita() {
		return fecha_visita;
	}

	public void setFecha_visita(LocalDate fecha_visita) {
		this.fecha_visita = fecha_visita;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getProfesional_id() {
		return profesional_id;
	}

	public void setProfesional_id(int profesional_id) {
		this.profesional_id = profesional_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Visita [id=");
		builder.append(id);
		builder.append(", cliente_id=");
		builder.append(cliente_id);
		builder.append(", fecha_visita=");
		builder.append(fecha_visita);
		builder.append(", detalle=");
		builder.append(detalle);
		builder.append(", profesional_id=");
		builder.append(profesional_id);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
