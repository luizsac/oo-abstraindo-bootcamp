package dio.oo.bootcamp.utils;

import dio.oo.bootcamp.domain.Bootcamp;
import dio.oo.bootcamp.domain.Course;
import dio.oo.bootcamp.domain.Dev;
import dio.oo.bootcamp.domain.Mentorship;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class ObjectFactory {

    public static Bootcamp buildBootcamp() {
        return Bootcamp.builder()
                .title("Test Bootcamp")
                .description("Description for Test Bootcamp")
                .startDate(LocalDate.of(2022, 3, 8))
                .daysToComplete(40)
                .build();
    }

    public static Course buildCourse() {
        return Course.builder()
                .title("Test Course")
                .description("Description for Test Course")
                .workload(6)
                .build();
    }

    public static Mentorship buildMentorship() {
        return Mentorship.builder()
                .title("Test Mentorship")
                .description("Description for Test Mentorship")
                .dateTime(LocalDateTime.of(2022, 3, 8, 16, 0))
                .build();
    }

    public static Dev buildDev() {
        return Dev.builder()
                .name("Test Dev")
                .build();
    }

}
