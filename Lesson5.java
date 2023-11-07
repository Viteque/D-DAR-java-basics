public class Lesson5 {
    public static void main(String[] args) {
//        int a = 40;
//        int b = 20;
//
//        if (a == b){
//            System.out.println("Квадрат");
//        }else {
//            System.out.println("Прямоугольник");
//        }

//        int a = 6000;
//        if (a > 5000) {
//            System.out.println(a * 0.1 - a);
//        } else {
//            System.out.println(a);
//        }

//        int grade = 100;
//        char letterGrade = 0;
//        if (grade >= 0 && grade <= 25) {
//            letterGrade = 'F';
//        } else if (grade >= 25 && grade <= 45) {
//            letterGrade = 'E';
//        } else if (grade >= 45 && grade <= 50) {
//            letterGrade = 'D';
//        } else if (grade >= 50 && grade <= 60) {
//            letterGrade = 'C';
//        } else if (grade >= 60 && grade <= 80) {
//            letterGrade = 'B';
//        } else if (grade >= 80 && grade <= 100) {
//            letterGrade = 'A';
//        }
//        System.out.println("Grade: " + grade + ", Letter: " + letterGrade);

//        int number = 12345;
//        String numberSTR = Integer.toString(number);
//        String numberREV = "";
//        for (int i = numberSTR.length() - 1; i >= 0; i--) {
//            numberREV += numberSTR.charAt(i);
//
//        }
//        System.out.println("Reversed: " + numberREV);

//        int a = 5;
//        boolean isComposite = false;
//        if (a % 2 == 0){
//            isComposite = true;
//
//        }else{
//            for (int i = 3; i<a; i++){
//                if (a % i ==0) {
//                    isComposite = true;
//                    break;
//                }
//            }
//        }
//        if (isComposite){
//            System.out.println("Целое число");
//        }else {
//            System.out.println("Простое число");
//        }
//        int a = 4;
//        int b= 10;
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();

//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print("  ");
//            }
//
//
//            for (int k = i; k >= 1; k--) {
//                System.out.print(k);
//            }
//
//
//            for (int l = 2; l <= i; l++) {
//                System.out.print(l);
//            }
//
//            System.out.println();
//        }

//        int a = 10;
//        int sum = 0;
//
//        for (int b = 5; b <= a ; b++){
//            sum += b;
//        }
//        System.out.println(sum);

//        double salary = 200000;
//        char employeGrade = 'C';
//        switch (employeGrade) {
//            case 'A' -> salary *= 1.5;
//            case 'B' -> salary *= 1.25;
//            case 'C' -> salary = salary;
//
//        }
//        System.out.println(salary);


        int number = 10;
        int[] array = new int[number];
        array[0] = 1;
        array[1] = 1;
        for (int i =2; i < array.length; i++){
            array[i] = array[i-1]+array[i-2];
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "");
        }
    }
}
