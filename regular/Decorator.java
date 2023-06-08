package seminar_1.regular;

/**
 * Decorator
 */
public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой "Вот ваше число"
     * @param a - число, требуещее декорации
     * @return Отформатированая строка
     */
    public static String decorate(int a){

        /**
         * Метод декорирует числа, добавляет к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Here is your number: %d", a);
    }
}
