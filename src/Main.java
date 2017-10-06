import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Grandpa yeye;
        yeye = new Grandpa("爷爷");
        Huluwa hulu0, hulu1, hulu2, hulu3, hulu4, hulu5, hulu6;
        hulu0 = new Huluwa("老大", "赤", 0);
        hulu1 = new Huluwa("老二", "橙", 1);
        hulu2 = new Huluwa("老三", "黄", 2);
        hulu3 = new Huluwa("老四", "绿", 3);
        hulu4 = new Huluwa("老五", "青", 4);
        hulu5 = new Huluwa("老六", "蓝", 5);
        hulu6 = new Huluwa("老七", "紫", 6);

        Huluwa huluwas[] = {hulu0, hulu1, hulu2, hulu3, hulu4, hulu5, hulu6};
        yeye.huluwas = huluwas;
        yeye.line();
        yeye.BubbleSort();
        yeye.line();
        yeye.HalfSort();
    }
    
}
