package Questao4;
import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("SESP", "Folha 17");
        UnidadeAtendimento unidade = new UnidadeAtendimento("Pronto Socorro", "Urgência");
        hospital.adicionarUnidade(unidade);

        Medico medico = new Medico("Dr exemplo", "123456-PA", "CLinicoGeral");
        unidade.adicionarMedico(medico);

        Paciente paciente = new Paciente("Keven", "123.456.789-00");
        Date data = new Date(); // Data atual
        Time hora = new Time(System.currentTimeMillis()); // Hora atual
        medico.realizarConsulta(paciente, "Febre e Dor de cabeça", data, hora);

        System.out.println("Unidades no hospital:");
        for (UnidadeAtendimento u : hospital.listarUnidades()) {
            System.out.println("- " + u.getNome() + " (" + u.getTipos() + ")");
        }
        System.out.println("\nMédicos na unidade:");
        for (Medico m : unidade.listarMedicos()) {
            System.out.println("- " + m.getNome() + " (CRM: " + m.getCrm() + ")");
        }
        System.out.println("\nConsultas do paciente:");
        for (Consulta c : paciente.listarConsultas()) {
            System.out.println(c.listarConsulta());
        }
    }
}
