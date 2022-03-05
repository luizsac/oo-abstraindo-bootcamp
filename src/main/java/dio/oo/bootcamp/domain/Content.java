package dio.oo.bootcamp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Content {

    protected static final double DEFAULT_XP_VALUE = 10d;

    private String title;
    private String description;

    public abstract double calcuteXP();

}
