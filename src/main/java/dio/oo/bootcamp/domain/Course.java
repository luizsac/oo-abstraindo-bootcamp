package dio.oo.bootcamp.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Course extends Content {

    private int workload;

    @Builder
    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

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
