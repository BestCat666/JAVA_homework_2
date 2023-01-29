//К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Ex_3 {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(Ex_3.class.getName());
        FileHandler fh = new FileHandler("log_ex3.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setLevel(Level.INFO);
        
        Scanner iScanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {   
            System.out.println("Введите первое число: ");
            double a = iScanner.nextDouble();
            logger.info("Пользователь ввёл первое число");
            System.out.println("Введите второе число: ");
            double b = iScanner.nextDouble();
            logger.info("Пользователь ввёл второе число");
            System.out.println("Введите операцию. Если Вы хотите завершить программу, нажмите 's': ");
            char operation = iScanner.next().charAt(0);
            logger.info("Пользователь операцию");
            double sum = 0;
            double mult = 0;
            double diff = 0;
            double quotient = 0;
            if (operation == '+') {
                sum = a + b;
                System.out.println(sum);
                logger.info("Выполнено суммирование");
            } else if (operation == '-') {
                diff = a - b;
                System.out.println(diff);
                logger.info("Выполнено вычитание");
            } else if (operation == '*') {
                mult = a * b;
                System.out.println(mult);
                logger.info("Выполнено умножение");
            } else if (operation == '/') {
                quotient = a / b;
                System.out.println(quotient);
                logger.info("Выполнено деление");
            } else if (operation == 's') {
                stop = true;
                System.out.println("Работа программы завершена");
                logger.info("Выход");
            } else
                System.out.println("");
        }
        iScanner.close();
    }
}
   /*
    public static void log(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex_3.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        logger.setLevel(Level.INFO);
        logger.info("Тестовое логирование 2");

    }

}
 */





    