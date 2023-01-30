import java.util.Scanner;

class HW1 {
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
        task4();
    }
    
public static void task1(){
/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n)
*/
System.out.print("Введите число: ");
int num = scanner.nextInt();
int res = num * (num + 1) / 2;
System.out.println("Сумма чисел от 1 до " + num + " равна: " + res + "\n");
}

public static void task2(){
/*
Вычислить n! (произведение чисел от 1 до n)
*/
Scanner scanner = new Scanner(System.in);
System.out.print("Введите число: ");
int num = scanner.nextInt();
int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
}
System.out.println("Произведение чисел от 1 до " + num + " равно: " + res);
}

public static void task3(){
/*
Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.
Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
*/
for (int i = 2; i < 1001; i++) {
    int count = 0;
    for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
            count++;
        }
    }
    if (count <= 2) {
        System.out.println(i);
    }
}
}

public static void task4(){
/*
Реализовать простой калькулятор 
("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
*/
System.out.print("Введите операцию для чисел: ");
String arithmeString = new String();
arithmeString = scanner.nextLine();
System.out.print("Введите первое число: ");
int num = scanner.nextInt();
System.out.print("Введите второе число: ");
int num2 = scanner.nextInt();

if(arithmeString.equals("+")){
    int resPlus = num + num2;
    System.out.println(num + " + " + num2 + " = " + resPlus);
}
else if ((arithmeString.equals("-"))) {
    int resMinus = num - num2;
    System.out.println(num + " - " + num2 + " = " + resMinus);
}
else if ((arithmeString.equals("*"))) {
    int resMultiply = num * num2;
    System.out.println(num + " * " + num2 + " = " + resMultiply);
}
else if ((arithmeString.equals("/"))) {
    double resDivide = (double) num / (double) num2;
    System.out.println(num + " / " + num2 + " = " + resDivide);
    System.out.printf("Округленный результат до двух знаков: %.2f \n", resDivide);
}
else {
    System.out.println("Такой операции нет\n");
}
}
}

