package dio.oo.bootcamp.domain;

import dio.oo.bootcamp.utils.ObjectFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CourseTest {

    private Course course;

    @BeforeAll
    public void init() {
        course = Course.builder()
                .title("Test Course Title")
                .description("Test Course Description")
                .workload(5)
                .build();
    }

    //Tests if Lombok's @SuperBuilder is working properly on the child class
    @Test
    public void testsIfCourseBuilderIsWorkingProperly() {
        assertEquals("Test Course Title", course.getTitle());
        assertEquals("Test Course Description", course.getDescription());
        assertEquals(5, course.getWorkload());
    }

    @Test
    public void whenCalculateXP_thenReturnRightAmountOfXP() {
        assertEquals(course.getWorkload() * BootcampContent.DEFAULT_XP_VALUE, course.calcuteXP());
    }

}
