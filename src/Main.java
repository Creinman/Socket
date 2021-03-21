public class JvmComprehension { // подгрузка классов

    public static void main(String[] args) { //создание фрейма в stack memory for main()
        int i = 1;                      // 1 создание примитива в стеке
        Object o = new Object();        // 2 создается объект и кладется в кучу (heap) внутренняя переменная o лежит в стеке в виде ссылки на кучу
        Integer ii = 2;                 // 3 Ссылочный тип данных - объект в куче, ссылка ii - в стеке
        printAll(o, i, ii);             // 4 все переменные в стеке
        System.out.println("finished"); // 7 создание фрейма в стеке
    }

    private static void printAll(Object o, int i, Integer ii) {//создание фрейма в стеке для printAll() Object, Integer - куча, o ii int i - стек i
        Integer uselessVar = 700;                   // 5 uselessVar - в стек, Integer - в кучу
        System.out.println(o.toString() + i + ii);  // 6 новый фрейм в стеке, куда передаётся o i ii
    }
}
