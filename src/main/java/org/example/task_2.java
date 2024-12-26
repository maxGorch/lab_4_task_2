package org.example;

import java.util.Arrays;

public class task_2
{
    public task_1 moduleTask_1;
    public task_2(task_1 moduleTask_1)
    {
        if(moduleTask_1 == null)
        {
            throw new IllegalArgumentException("Не может быть null");
        }
        this.moduleTask_1 = moduleTask_1;
    }

    public double getMaxElement()
    {
        double[] roots = moduleTask_1.execute();
        if(roots.length == 0)
        {
            throw new IllegalStateException("Нет корней у квадратного уравнения.");
        }
        return Arrays.stream(roots).max().orElseThrow();
    }
    @Override
    public String toString() {
        return "Квадратный трёхчлен: " + moduleTask_1;
    }
    public static void main(String[] args) {
        task_1 equation = new task_1(1, -3, 2);
        task_2 rootFinder = new task_2(equation);
        System.out.println(rootFinder);
        System.out.println("Больший корень: " + rootFinder.getMaxElement());
    }
}