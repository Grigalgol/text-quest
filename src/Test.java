public class Test {
    private Question start_question;
    Test() {
        start_question.q[0] = new Question("Что из перечисленного не относится к принципам ООП? \n"
                                            + "1) Полиморфизм \n" + "2) Инкапсуляция \n" + "3) Консервация \n" + "4) Наследование \n", 3 );
        start_question.q[1] = new Question("Для сокрытия методов или переменных класса от других классов используется модификатор доступа \n" + "1) private \n"
                                            + "2) public \n" + 3);

    }
}
