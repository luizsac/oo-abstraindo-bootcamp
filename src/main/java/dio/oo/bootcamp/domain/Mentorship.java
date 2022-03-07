package dio.oo.bootcamp.domain;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@SuperBuilder
public class Mentorship extends BootcampContent {

    private LocalDateTime dateTime;

    @Override
    public double calcuteXP() {
        return DEFAULT_XP_VALUE + 20;
    }

    @Override
    public String toString() {
        return "Mentoria" + "\n" +
                "\tTítulo: " + getTitle() + "\n" +
                "\tDescrição: " + getDescription() + "\n" +
                "\tData: " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n" +
                "\tExperiência: " + calcuteXP();
    }

}
