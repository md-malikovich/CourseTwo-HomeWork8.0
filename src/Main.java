public class Main {

    public static void main(String[] args) {
        Box<Number> num1 = new Box<Number>(new Double(8.0), new Integer(7));
        num1.getNumber1();
        num1.getNumber2();
        System.out.println("Первый объект. Number1 = " + num1.getNumber1());
        System.out.println("Первый объект. Number2 = " + num1.getNumber2());
        System.out.println("___________________");

        Box<Float> num2 = new Box<>(12.1F, 10.5F);
        num2.getNumber1();
        num2.getNumber2();
        System.out.println("Второй объект. Number1 = " + num2.getNumber1());
        System.out.println("Второй объект. Number2 = " + num2.getNumber2());
        System.out.println("___________________");

        System.out.println("Результат сложения - " + addition(num1, num2));
        System.out.println("Результат умножения - " + multiplication(num1, num2));
    }

    public static Number multiplication(Box<? extends Number> num1, Box<? extends Number> number2) {
        return num1.getNumber1().doubleValue() * number2.getNumber2().floatValue();
    }

    public static Number addition(Box<? extends Number> num1, Box<? extends Number> number2) {
        return num1.getNumber1().doubleValue() + number2.getNumber2().floatValue();
    }
}

//+В главном классе создать 2 объекта типа Box.
//+1-й хранящий числа типа Number, и добавить 2 числа (Double и Integer)
//+2-й хранящий числа типа Float, и добавить 2 числа (Float и Float)

//В главном классе написать 2 метода, принимающие 2 параметра типа обобщенного класса Box с подстановочными символами,
// ограниченные только числовыми типами данных
//1-й addition метод должен суммировать все 4 поля двух объектов
//2-й multiplication метод должен умножать все 4 поля двух объектов
