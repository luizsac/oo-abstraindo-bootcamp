package dio.oo.bootcamp.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
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

    public void enrollInBootcamp(Bootcamp bootcamp) {
        this.bootcampContent.addAll(bootcamp.getContent());
        bootcamp.enrollDev(this);
    }

    public void cancelEnrollment(Bootcamp bootcamp) {
        this.bootcampContent.clear();
        this.completedContent.clear();
        bootcamp.cancelEnrollment(this);
    }

    public void advance() {
        Optional<BootcampContent> opBootcampContent = this.bootcampContent.stream().findFirst();

        if (opBootcampContent.isPresent()) {
            this.completedContent.add(opBootcampContent.get());
            this.bootcampContent.remove(opBootcampContent.get());
        } else if (!this.completedContent.isEmpty()) {
            System.out.println(this.name + " completou todo o conteudo do bootcamp");
        } else {
            System.out.println(this.name + " nao esta matriculado em um bootcamp");
        }
    }

    public double calculateTotalXP() {
        return this.completedContent
                .stream()
                .mapToDouble(BootcampContent::calcuteXP)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(bootcampContent, dev.bootcampContent) &&
                Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bootcampContent, completedContent);
    }
}