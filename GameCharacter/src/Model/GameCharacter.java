package Model;

public class GameCharacter {

    protected String name;
    protected long maxHp;
    protected long curHp;
    protected Weapon myWeapon;

    public GameCharacter(String name, long maxHp,long curHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.curHp=curHp;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(long maxHp) {
        this.maxHp = maxHp;
    }

    public long getCurpHp() {
        return curHp;
    }

    public void setCurpHp(long curHp) {
        this.curHp = curHp;
    }

    public Weapon getMyWeapon() {
        return myWeapon;
    }

    public void setMyWeapon(Weapon myWeapon) {
        this.myWeapon = myWeapon;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", maxHp=" + maxHp +
                ", curHp=" + curHp +
                ", myWeapon=" + myWeapon +
                '}';
    }
}
