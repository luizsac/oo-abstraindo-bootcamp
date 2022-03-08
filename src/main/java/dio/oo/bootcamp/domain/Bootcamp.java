package dio.oo.bootcamp.domain;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
public class Bootcamp extends Content {

    private LocalDate startDate;
    private LocalDate deadlineToFinish;
    private int daysToComplete;
    private Set<BootcampContent> content;
    private Set<Dev> enrolledDevs;

    @Builder
    public Bootcamp(String title, String description, LocalDate startDate, int daysToComplete) {
        super(title, description);
        this.startDate = startDate;
        this.daysToComplete = daysToComplete;
        this.deadlineToFinish = startDate.plusDays(daysToComplete);
        this.content = new LinkedHashSet<>();
        this.enrolledDevs = new HashSet<>();
    }

    public void addContent(BootcampContent content) {
        this.content.add(content);
    }

    public void enrollDev(Dev dev) {
        enrolledDevs.add(dev);
    }

    public void cancelEnrollment(Dev dev) {
        enrolledDevs.remove(dev);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return daysToComplete == bootcamp.daysToComplete && Objects.equals(startDate, bootcamp.startDate) &&
                Objects.equals(deadlineToFinish, bootcamp.deadlineToFinish) && Objects.equals(enrolledDevs, bootcamp.enrolledDevs) &&
                Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, deadlineToFinish, daysToComplete, enrolledDevs, content);
    }
}
