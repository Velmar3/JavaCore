package seminar_1.regular;

/**
 * Калькулятор
 */
public class Calculate {

    /**
     * Функция сумирования двух целых чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return частное a и b, без проверки на переполнение переменной.
     */
    public static int sum(int a, int b) {
        return a + b;
    }
    /**
     * Функция вычитания двух целых чисел
     * @param a первое уменьшаемое
     * @param b второе вычитаемое
     * @return разность a и b, без проверки на переполнение переменной.
     */
    public static int sub(int a, int b) {
        return a - b;
    }
    /**
     * Функция произведения двух целых чисел
     * @param a первое множитель
     * @param b второе множитель
     * @return произведение a и b, без проверки на переполнение переменной.
     */
    public static int mult(int a, int b) {
        return a * b;
    }
    /**
     * Функция деления двух целых чисел
     * @param a первое делимое
     * @param b второе делитель
     * @return частное a и b, без проверки на переполнение переменной.
     */
    public static int div(int a, int b) {
        return b == 0 ? a : a / b;
    }
}
