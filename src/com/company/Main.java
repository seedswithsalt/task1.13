package com.company;
import java.util.Scanner;

    public class Main {
    public static double calculateTime(int v1,int v2, int a1, int a2, int s) {
        return (-(v1 + v2) + Math.sqrt((v1 + v2) * (v1 + v2) + (a1 + a2) * 2 * s)) / (a1 + a2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите скорость v1: ");
        int v1 = scanner.nextInt();
        System.out.print("Введите скорость v2: ");
        int v2 = scanner.nextInt();
        System.out.print("Введите ускорениу a1: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите ускорение a2: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите начальное расстояние s: ");
        int s = scanner.nextInt();
        System.out.print("Время = " + calculateTime(v1, v2, a1, a2, s));
    }
}
