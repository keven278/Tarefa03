package Questao4;
import java.util.Date;
import java.sql.Time;

public class Consulta {
    private Date data;
    private Time hora;
    private String descricao;

    public Consulta(Date data, Time hora, String descricao) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }
    public String listarConsulta() {
        return "Consulta em " + data + " às " + hora + ": " + descricao;
    }
}

