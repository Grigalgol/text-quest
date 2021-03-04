import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать, пожалуйста представьтесь. \n" + "---------------------------------------------");
        System.out.println("Введите своё имя: ");
        String name = in.next();
        System.out.println("Выберите сложность: \n" + "1) Легкая (3 жизни) \n" + "2) Средняя (2 жизни) \n" + "3) Сложная (1 жизнь) ");
        System.out.println("Напишите пункт сложности, которую вы выбрали: ");
        int choose = in.nextInt();
        Character character = new Character(name, choose);

        Question[] q = new Question[2];

        //составляем вопросы
        q[0].setQuestion("Что из перечисленного не относится к принципам ООП? \n" + "1) Полиморфизм \n" + "2) Инкапсуляция \n" + "3) Консервация \n" + "4) Наследование \n");
        q[0].setRightanswer(3);
        q[1].setQuestion("Для сокрытия методов или переменных класса от других классов используется модификатор доступа \n" + "1) private \n" + "2) public \n" + "3) default \n" + "4) protected \n");
        q[1].setRightanswer(1);

        boolean flag = true;

        System.out.println("Тест по знанию ООП Java состоит из 5 вопросов, для успешного прохождения требуется решить все 5 вопросов");

        for(int i = 0; i< q.length; i++) {
            if(character.getHp() < 0) {
                flag = false;
                break;
            }
            q[i].printQuestion();
            System.out.println("Ваш ответ:");
            q[i].setAnswer(in.nextInt());
            if(q[i].getAnswer() == q[i].getRightanswer()) System.out.println("Ответ правильный! \n");
            else {
                character.deleteHP();
                System.out.println("Ответ не правильный, вы теряете жизнь! \n");
            }
        }
        if(!flag) System.out.println("Вы проиграл!");
        else System.out.println("Тест пройден, поздравляю пидрила!");
    }
}
