import java.lang.*;
import java.util.ArrayList;
import java.util.Random;

public class Grandpa {
    protected String name;

    //构造函数
    public Grandpa(String name) {
        this.name = name;
    }
    public Huluwa huluwas[]={};

    public void line() {
        int index;
        Huluwa temp;
        for(int i = 0 ;i < huluwas.length ;i++){
            index = new Random().nextInt(4);
            temp = huluwas[i];
            huluwas[i] = huluwas[index];
            huluwas[index] = temp;
        }
    }

    public void BubbleSort() {
        System.out.println("随机站队：");
        for (Huluwa hulu : huluwas) {
            System.out.print(hulu.name + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("冒泡排序：");
        for (int i = 0; i < huluwas.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < huluwas.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (huluwas[j].rank > huluwas[j + 1].rank) {
                    Huluwa temp = huluwas[j];
                    huluwas[j].reportRank(j,j+1);
                    huluwas[j] = huluwas[j + 1];
                    huluwas[j + 1].reportRank(j+1,j);
                    huluwas[j + 1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("冒泡排序后：");
        for (int i = 0; i < huluwas.length; i++) {
            huluwas[i].reportName();
        }
        System.out.println("");
        System.out.println("");
    }

    public void HalfSort() {
        System.out.println("随机站队：");
        for (Huluwa hulu : huluwas) {
            System.out.print(hulu.color + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("二分法排序：");
        for (int i = 0; i < huluwas.length; i++) {
            int low = 0, mid = 0, high = i;
            Huluwa temp = huluwas[i];
            while (low <= high) {
                mid = (low + high) / 2;
                if (huluwas[mid].rank < temp.rank) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            // 将这个位置以后的所有元素向后移动
            for (int j = i - 1; j > high; j--) {
                huluwas[j].reportRank(j,(j+1));
                huluwas[j + 1] = huluwas[j];

            }

            huluwas[high + 1] = temp;
        }
        System.out.println("");
        System.out.println("二分法排序后：");
        for (int i = 0; i < huluwas.length; i++) {
            huluwas[i].reportColor();
        }
    }
}
