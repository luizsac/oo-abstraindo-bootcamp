package dio.oo.bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BootcampTest {

    @Test
    public void testsIfBootcampBuilderIsWorkingProperly() {
        Bootcamp bootcamp = Bootcamp.builder()
                .title("Test Bootcamp Builder")
                .description("This is a test for the Bootcamp Builder")
                .startDate(LocalDate.of(2022, 3, 8))
                .daysToComplete(45)
                .build();

        assertEquals("Test Bootcamp Builder", bootcamp.getTitle());
        assertEquals("This is a test for the Bootcamp Builder", bootcamp.getDescription());
        assertEquals(LocalDate.of(2022, 3, 8), bootcamp.getStartDate());
        assertEquals(45, bootcamp.getDaysToComplete());
        assertEquals(LocalDate.of(2022, 3, 8).plusDays(45), bootcamp.getDeadlineToFinish());
        assertNotNull(bootcamp.getContent());
        assertNotNull(bootcamp.getEnrolledDevs());
    }

}
