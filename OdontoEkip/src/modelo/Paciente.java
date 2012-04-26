package modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
@PrimaryKeyJoinColumn(name="codigoUsuario")
public class Paciente extends Usuario{

	@Column(name="responsavelPaciente", length=50)
	private String responsavelPaciente;
	@Column(name="statusPaciente", nullable=false)
	private String statusPaciente;
	@Column(name="tipoConvenio", nullable=false)
	private String tipoConvenio;
	@Column(name="logradouroPaciente", length=100)
	private String logradrouroPaciente;
	@Column(name="numeroPaciente")
	private Integer numeroPaciente;
	@Column(name="complementoPaciente")
	private String complementoPaciente;
	@Column(name="bairroPaciente")
	private String bairroPaciente;
	@Column(name="cidadePaciente")
	private String cidadePaciente;
	@Column(name="estadoPaciente")
	private String estadoPaciente;
	@Column(name="cepPaciente", length=10)
	private String cepPaciente;
	
	@OneToMany(mappedBy="paciente", fetch=FetchType.EAGER)
	private List<TelefonePaciente> telefonePaciente;

	
	public List<TelefonePaciente> getTelefonePaciente() {
		return telefonePaciente;
	}

	public void setTelefonePaciente(List<TelefonePaciente> telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public String getResponsavelPaciente() {
		return responsavelPaciente;
	}

	public void setResponsavelPaciente(String responsavelPaciente) {
		this.responsavelPaciente = responsavelPaciente;
	}

	public String getStatusPaciente() {
		return statusPaciente;
	}

	public void setStatusPaciente(String statusPaciente) {
		this.statusPaciente = statusPaciente;
	}

	public String getTipoConvenio() {
		return tipoConvenio;
	}

	public void setTipoConvenio(String tipoConvenio) {
		this.tipoConvenio = tipoConvenio;
	}

	public String getLogradrouroPaciente() {
		return logradrouroPaciente;
	}

	public void setLogradrouroPaciente(String logradrouroPaciente) {
		this.logradrouroPaciente = logradrouroPaciente;
	}

	public Integer getNumeroPaciente() {
		return numeroPaciente;
	}

	public void setNumeroPaciente(Integer numeroPaciente) {
		this.numeroPaciente = numeroPaciente;
	}

	public String getComplementoPaciente() {
		return complementoPaciente;
	}

	public void setComplementoPaciente(String complementoPaciente) {
		this.complementoPaciente = complementoPaciente;
	}

	public String getBairroPaciente() {
		return bairroPaciente;
	}

	public void setBairroPaciente(String bairroPaciente) {
		this.bairroPaciente = bairroPaciente;
	}

	public String getCidadePaciente() {
		return cidadePaciente;
	}

	public void setCidadePaciente(String cidadePaciente) {
		this.cidadePaciente = cidadePaciente;
	}

	public String getEstadoPaciente() {
		return estadoPaciente;
	}

	public void setEstadoPaciente(String estadoPaciente) {
		this.estadoPaciente = estadoPaciente;
	}

	public String getCepPaciente() {
		return cepPaciente;
	}

	public void setCepPaciente(String cepPaciente) {
		this.cepPaciente = cepPaciente;
	}
	
	public Paciente() {
	
	}

	public Paciente(String responsavelPaciente, String statusPaciente,
			String tipoConvenio, String logradrouroPaciente,
			Integer numeroPaciente, String complementoPaciente,
			String bairroPaciente, String cidadePaciente,
			String estadoPaciente, String cepPaciente,
			List<TelefonePaciente> telefonePaciente) {
		super();
		this.responsavelPaciente = responsavelPaciente;
		this.statusPaciente = statusPaciente;
		this.tipoConvenio = tipoConvenio;
		this.logradrouroPaciente = logradrouroPaciente;
		this.numeroPaciente = numeroPaciente;
		this.complementoPaciente = complementoPaciente;
		this.bairroPaciente = bairroPaciente;
		this.cidadePaciente = cidadePaciente;
		this.estadoPaciente = estadoPaciente;
		this.cepPaciente = cepPaciente;
		this.telefonePaciente = telefonePaciente;
	}
	
	
	
}