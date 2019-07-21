public class Box <E> {
    private E number1;
    private E number2;

    public Box(E number1, E number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public E getNumber1() {
        return number1;
    }

    public E getNumber2() {
        return number2;
    }
}
//+Создать обобщенный класс Box, который имеет 2 поля неопределенного типа - number1, number2.
//+Класс должен быть ограничен только числовыми типами.
//+Добавить getter-ы для этих полей.
//+Также добавить конструктор для инициализации полей