package dio.oo.bootcamp.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MentorshipTest {

    private Mentorship mentorship;

    @BeforeAll
    public void init() {
        mentorship = Mentorship.builder()
                .title("Test Mentorship Title")
                .description("Test Mentorship Description")
                .dateTime(LocalDateTime.of(2022, 3, 8, 16, 0))
                .build();
    }

    //Tests if Lombok's @SuperBuilder is working properly on the child class
    @Test
    public void testsIfMentorshipBuilderIsWorkingProperly() {
        assertEquals("Test Mentorship Title", mentorship.getTitle());
        assertEquals("Test Mentorship Description", mentorship.getDescription());
        assertEquals(LocalDateTime.of(2022, 3, 8, 16, 0), mentorship.getDateTime());
    }

    @Test
    public void whenCalculateXP_thenReturnRightAmountOfXP() {
        assertEquals(20 + BootcampContent.DEFAULT_XP_VALUE, mentorship.calcuteXP());
    }

}
