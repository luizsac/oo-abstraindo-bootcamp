package dio.oo.bootcamp;

import dio.oo.bootcamp.domain.Bootcamp;
import dio.oo.bootcamp.domain.Course;
import dio.oo.bootcamp.domain.Dev;
import dio.oo.bootcamp.domain.Mentorship;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Course course1 = Course.builder()
                .title("Desenvolvimento básico em Java")
                .description("A linguagem Java é orientada a objetos e uma das mais usadas por desenvolvedores no " +
                        "mundo. Aprenda desde os conceitos e instalação até a execução de projetos em Java.")
                .workload(6)
                .build();

        Course course2 = Course.builder()
                .title("Desenvolvimento avançado em Java")
                .description("Aprenda em 8 horas de curso a executar de forma eficaz e ágil a linguagem Java e ainda " +
                        "conheça quais são as novidades nas versões da tecnologia: Java 10 e Java 11.")
                .workload(8)
                .build();

        Mentorship mentorship = Mentorship.builder()
                .title("Start coding - Java Essentials 1")
                .description("Aprenda com a Dri os conceitos básicos da linguagem Java nessa mentoria exclusiva.")
                .dateTime(LocalDateTime.of(2021, 12, 2, 16, 0))
                .build();

        Bootcamp bootcamp = Bootcamp.builder()
                .title("Spread Java Developer")
                .description("Com o Bootcamp Spread Java Developer, você aprenderá sobre os principais fundamentos de" +
                        " Java e se especializará dentro desta área.")
                .startDate(LocalDate.of(2021, 11, 10))
                .daysToComplete(60)
                .build();

        bootcamp.addContent(course1);
        bootcamp.addContent(course2);
        bootcamp.addContent(mentorship);

        Dev dev = Dev.builder()
                .name("Foo")
                .build();

        dev.enrollInBootcamp(bootcamp);

        System.out.println(dev.getName() + " está matriculado nos conteúdos:\n" + dev.getBootcampContent());
        System.out.println(dev.getName() + " possui " + dev.calculateTotalXP() + " pontos de experiência");

        dev.advance();
        dev.advance();
        dev.advance();

        System.out.println(dev.getName() + " possui " + dev.calculateTotalXP() + " pontos de experiência");

        dev.advance();

        dev.cancelEnrollment(bootcamp);

        dev.advance();

    }

}
