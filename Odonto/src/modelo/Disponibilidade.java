package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tb_disponibilidade")
public class Disponibilidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_disponibilidade", nullable = false)
    private long codigoDisponibilidade;
    @Column(name = "dia_semana", nullable = false, length = 20)
    private String diaSemana;
    @Column(name = "hora_inicio", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Column(name = "hora_fim", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaFim;
   
    @ManyToOne(fetch=FetchType.EAGER)
	private Dentista dentista;

    public Disponibilidade() {
    }

    public Disponibilidade(Integer codigoDisponibilidade) {
        this.codigoDisponibilidade = codigoDisponibilidade;
    }

    public Disponibilidade(long codigoDisponibilidade, String diaSemana, Date horaInicio, Date horaFim) {
        this.codigoDisponibilidade = codigoDisponibilidade;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public long getCodigoDisponibilidade() {
        return codigoDisponibilidade;
    }

    public void setCodigoDisponibilidade(long codigoDisponibilidade) {
        this.codigoDisponibilidade = codigoDisponibilidade;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }
    
    public Dentista getDentista() {
		return dentista;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return getCodigoDisponibilidade()+getDiaSemana();
    }
    
}
