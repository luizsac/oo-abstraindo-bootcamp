package dio.oo.bootcamp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class Content {

    protected static final double DEFAULT_XP_VALUE = 10d;

    private String title;
    private String description;

    public abstract double calcuteXP();

}
