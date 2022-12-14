public class Point2d {
    int y, x; // не переменные, а поле
    public Point2d(int valueX, int valueY) { //можно быстро добавить снипетом ctor
        x = valueX;
        y = valueY;       // не метод, нет возвращаемого типа. Конструктор
    }

    public Point2d() { // делаем перегрузку констуктора
        x = 0;
        y = 0;
    }

    public Point2d(int value) { //public - модификатор доступа, доступен всем, private : внутри того класса, где делаем
        x = value;
        y = value;
    }

    public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override // переопределили поведение, которое было до нас
    public String toString() {
        return getInfo();
    }
// перегрузка метода - для C#, Java, когда мы написали сами и переделали
   
}
