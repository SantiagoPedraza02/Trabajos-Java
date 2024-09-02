package Model;

public class Weapon {
    protected String name;
    protected long maxDmg;
    protected long minDmg;

    public Weapon(String name, long maxDmg, long minDmg) {
        this.name = name;
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
    }

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(long maxDmg) {
        this.maxDmg = maxDmg;
    }

    public long getMinDmg() {
        return minDmg;
    }

    public void setMinDmg(long minDmg) {
        this.minDmg = minDmg;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", maxDmg=" + maxDmg +
                ", minDmg=" + minDmg +
                '}';
    }
}
