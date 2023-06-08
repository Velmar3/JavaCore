package seminar_1.sample;

import seminar_1.regular.Calculate;
import seminar_1.regular.Decorator;

public class Main {

    /**
     * Точка входа в программу. С неё всегда все начинается.
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = Calculate.div(2, 3);
        System.out.println(Decorator.decorate(result));
        result = Calculate.sum(4, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculate.mult(4, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculate.sub(4, 2);
        System.out.println(Decorator.decorate(result));
    }
}
