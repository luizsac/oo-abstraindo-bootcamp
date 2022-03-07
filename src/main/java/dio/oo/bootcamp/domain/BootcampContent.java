package dio.oo.bootcamp.domain;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class BootcampContent extends Content {

    protected static final double DEFAULT_XP_VALUE = 10d;

    public abstract double calcuteXP();

}
