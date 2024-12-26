package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTask_2 {
    @Test
    public void Test()
    {
        task_1 test_task_1;
        task_2 test_task_2;

        test_task_1 = new task_1(1,-3,2);
        test_task_2 = new task_2(test_task_1);

        assertEquals(
                2.0,
                test_task_2.getMaxElement(),
                "Больший корень должен быть 2.0"
        );

         test_task_1 = new task_1(1,0,1);
         test_task_2 = new task_2(test_task_1);

        assertThrows(IllegalStateException.class,
                test_task_2::getMaxElement,
                "Ожидалось исключение из-за отсутствия корней"
        );

        test_task_1 = new task_1(1,-3,2);
         test_task_2 = new task_2(test_task_1);

        assertEquals(
                2.0,
                test_task_2.getMaxElement(),
                "Больший корень должен быть 2.0"
        );

        assertThrows(IllegalArgumentException.class, () ->
                 new task_2(null),
                "Ожидалось исключение при null-значении");

    }
}
