package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService();

        System.out.print("How many values? ");
        int n = key.nextInt();

        for(int i = 0; i < n; i++){
            Integer value = key.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        key.close();
    }
}
