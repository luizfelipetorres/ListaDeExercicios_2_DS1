package utils;

import java.util.Scanner;

abstract public class Utils  {
    private Scanner s;
    public Utils(){
        super();
        this.s = new Scanner(System.in);
    }

    public int getInt(String message){
        System.out.printf(message);
        return s.nextInt();
    }

    public double getDouble(String message){
        System.out.printf(message);
        return s.nextDouble();
    }
}
