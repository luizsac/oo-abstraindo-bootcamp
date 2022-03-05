package dio.oo.bootcamp;

import dio.oo.bootcamp.domain.Course;

public abstract class Main {

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

    }

}
