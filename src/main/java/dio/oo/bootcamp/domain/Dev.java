package dio.oo.bootcamp.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
public class Dev {

    private String name;
    private Set<BootcampContent> bootcampContent;
    private Set<BootcampContent> completedContent;

    @Builder
    public Dev(String name) {
        this.name = name;
        this.bootcampContent = new LinkedHashSet<>();
        this.completedContent = new LinkedHashSet<>();
    }

}