package ru.stqa.pft.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Dmitry");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}

/*Создание пакетов refactor - move
Функция - именованный блок кода.
Форматирование - code - reformat code. Только названия классов с большой буквы, все остальное с маленькой.
CamelCase - части названий соединяются без пробелов и начинаются с большой буквы.
Класс - описание структуры однотипных объектов (представители или экземпляры).
Приведено описание конструктора и внутри ключевое слово this для использования как экземпляра метода
Метод - функция, ассоциированная с каким-то объектом.
static используется для пометки функций, которые не ассоциированы ни с каким объектом*/