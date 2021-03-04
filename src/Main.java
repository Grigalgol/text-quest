import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать, пожалуйста представьтесь. \n" + "---------------------------------------------");
        System.out.println("Введите своё имя: ");
        String name = in.next();
        System.out.println("Выберите сложность: \n" + "1) Легкая (5 жизней) \n" + "2) Средняя (3 жизни) \n" + "3) Сложная (1 жизнь) ");
        System.out.println("Напишите пункт сложности, которую вы выбрали: ");
        int choose = in.nextInt();
        Character character = new Character(name, choose);
        boolean flag = true;

        System.out.println("Тест по знанию ООП Java состоит из 10 вопросов, для успешного прохождения требуется решить все 10 вопросов");
        for(int i = 0; i<10; i++) {
            if(character.getHp() < 0) {
                flag = false;
                break;
            }

        //нужно продумать класс ситуации и вопросы
        }
    }
}
