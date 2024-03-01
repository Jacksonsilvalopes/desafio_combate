package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int amor;

    public Champion(String name, int life, int attack, int amor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.amor = amor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAmor() {
        return amor;
    }

    public void setAmor(int amor) {
        this.amor = amor;
    }

    public void takeDamage(Champion other) {

        if (getAmor() > other.getAttack()) {
            setLife(getLife() - 1);
        } else {
            setLife(getLife() + getAmor() - other.getAttack());
        }

        if (getLife() < 0) {
            setLife(0);
        }
    }

    public String status() {

        if (getLife() > 0) {
            return getName() + " : " + getLife() + " de vida";
        }
        return getName() + " : " + getLife() + " de vida " + (getLife() == 0 ? "(morreu)" : "");
    }


    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", amor=" + amor +
                '}';
    }
}
