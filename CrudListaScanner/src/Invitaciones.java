
public class Invitaciones {
//Atributos
	private int numeroInvitacion;
	private String direccion;
	private int numMesa;
	private String familia;
	private String horaInicio;
	
	
	public Invitaciones(int numeroInvitacion, String direccion, int numMesa, String familia, String horaInicio) {
		this.numeroInvitacion = numeroInvitacion;
		this.direccion = direccion;
		this.numMesa = numMesa;
		this.familia = familia;
		this.horaInicio = horaInicio;
	}


	public Invitaciones() {
	}


	@Override
	public String toString() {
		return "Invitaciones [numeroInvitacion=" + numeroInvitacion + ", direccion=" + direccion + ", numMesa="
				+ numMesa + ", familia=" + familia + ", horaInicio=" + horaInicio + "]\n";
	}


	public int getNumeroInvitacion() {
		return numeroInvitacion;
	}


	public void setNumeroInvitacion(int numeroInvitacion) {
		this.numeroInvitacion = numeroInvitacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumMesa() {
		return numMesa;
	}


	public void setNumMesa(int numMesa) {
		this.numMesa = numMesa;
	}


	public String getFamilia() {
		return familia;
	}


	public void setFamilia(String familia) {
		this.familia = familia;
	}


	public String getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	
}
