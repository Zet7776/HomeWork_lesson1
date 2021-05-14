public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");

    }
    public static void checkSumSign() {
        int a = 15;
        int b = -20;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
        private static void printColor(){
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value <= 100){
            System.out.println("Желтый");
            }
        else if (value >= 100){
            System.out.println("Зеленый");
        }

        }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b){
            System.out.println("a>=b");
        }
        else if (a < b){
            System.out.println("a < b");
        }

    }





}
