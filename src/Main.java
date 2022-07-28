import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java",8);
        Curso curso2 = new Curso("curso js", "descrição curso js",4);

        System.out.println(curso1);
        System.out.println(curso2);


        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateText = date.format(formatter);
        LocalDate parseDate = LocalDate.parse(dateText, formatter);

        System.out.println(dateText);

        Mentoria mentoria1 = new Mentoria("mentoria de java", "descrição mentoria java", parseDate);
        Mentoria mentoria2 = new Mentoria("mentoria de js", "descrição mentoria js", parseDate);

//        System.out.println(mentoria1);
//        System.out.println(mentoria2);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.inscreverBootcamp(bootcamp);
        dev.setNome("Antônio Alves");
        System.out.println("Conteúdos Inscritos Antônio" + dev.getConteudosInscritos());
        System.out.println("XP Antônio: " + dev.calcularTotalXp());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Inscritos Antônio" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Antônio" + dev.getConteudosConcluidos());
        System.out.println("XP Antônio: " + dev.calcularTotalXp());


        Dev dev1 = new Dev();
        dev1.inscreverBootcamp(bootcamp);
        dev1.setNome("João");
        System.out.println("Conteúdos Inscritos João" + dev1.getConteudosInscritos());
        System.out.println("XP João: " + dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteúdos Inscritos João" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João" + dev1.getConteudosConcluidos());
        System.out.println("XP João: " + dev1.calcularTotalXp());

    }
}
