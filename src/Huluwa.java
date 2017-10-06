import java.lang.*;
import java.lang.String;

public class Huluwa {
    protected String name;
    protected String color;
    protected int rank;
    public int random;

    public int getRank() {
        return this.rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    //构造函数
    public Huluwa(String name, String color, int rank) {
        this.name = name;
        this.color = color;
        this.rank=rank;
    }
    public void reportName() {
        System.out.print(this.name + " ");
    }
    public void reportColor() {
        System.out.print(this.color + " ");
    }
    public void reportRank(int x, int y) {
        System.out.println(String.format("%s: %d->%d",this.name, x,y));
    }

}
