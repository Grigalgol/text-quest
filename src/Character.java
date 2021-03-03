public class Character {
    private int hp;
    private String name;
    public Character(String name, int choose) {
        this.name = name;
        switch (choose) {
            case 1:
                hp = 5;
                break;
            case 2:
                hp = 3;
                break;
            case 3:
                hp = 1;
                break;
        }
    }

    public void deleteHP () {
        hp--;
    }

    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }

}
