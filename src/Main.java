import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
