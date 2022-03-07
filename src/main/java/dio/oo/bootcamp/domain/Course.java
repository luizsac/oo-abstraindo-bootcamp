package dio.oo.bootcamp.domain;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Course extends BootcampContent {

    private int workload;

    @Override
    public double calcuteXP() {
        return DEFAULT_XP_VALUE * workload;
    }

    @Override
    public String toString() {
        return "Curso" + "\n" +
                "\tTítulo: " + getTitle() + "\n" +
                "\tDescrição: " + getDescription() + "\n" +
                "\tCarga horária: " + workload + "\n" +
                "\tExperiência: " + calcuteXP();
    }
}
