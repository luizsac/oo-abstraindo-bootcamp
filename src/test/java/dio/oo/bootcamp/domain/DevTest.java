package dio.oo.bootcamp.domain;

import dio.oo.bootcamp.utils.ObjectFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DevTest {

    private Dev dev;
    private Bootcamp bootcamp;
    private Course course;
    private Mentorship mentorship;

    @BeforeAll
    public void init() {
        dev = ObjectFactory.buildDev();
        bootcamp = ObjectFactory.buildBootcamp();
        course = ObjectFactory.buildCourse();
        mentorship = ObjectFactory.buildMentorship();

        bootcamp.addContent(course);
        bootcamp.addContent(mentorship);
    }

    @Test
    public void whenEnrollInBootcamp_thenBootcampContentShouldContainContentFromBootcamp() {
        dev.enrollInBootcamp(bootcamp);

        assertEquals(bootcamp.getContent(), dev.getBootcampContent());
        assertTrue(bootcamp.getEnrolledDevs().contains(dev));
    }

    @Test
    public void whenAdvance_thenMoveContentAccordingly() {
        assertTrue(dev.getCompletedContent().isEmpty());
        assertEquals(2, dev.getBootcampContent().size());

        dev.advance();

        assertEquals(1, dev.getBootcampContent().size());
        assertEquals(1, dev.getCompletedContent().size());

        dev.advance();

        assertTrue(dev.getBootcampContent().isEmpty());
        assertEquals(2, dev.getCompletedContent().size());
    }

    @Test
    public void whenCalculateTotalXP_thenReturnRightAmountOfXP() {
        assertEquals(course.calcuteXP() + mentorship.calcuteXP(), dev.calculateTotalXP());
    }

    @Test
    public void whenCancelEnrollment_thenBootcampContentShouldBeEmpty() {
        dev.cancelEnrollment(bootcamp);

        assertTrue(dev.getBootcampContent().isEmpty());
        assertFalse(bootcamp.getEnrolledDevs().contains(dev));
    }

}
