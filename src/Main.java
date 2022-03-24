public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        /*
        Нужно исключить деление на 0. Можно:
        1. Возвращать в этом случае 0, как я реализовал
        2. Добавить обработчик арифметической ошибки
         */
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
