package LearnMethod;

public class Converson { // ép kiểu
    public static void main(String[] args) {

        // implicit type conversion ép kiểu ngầm định
        int i = 1;
        System.out.println(i);

        float m = i;
        System.out.println(m);

        // explicit type conversion ép kiểu tường minh
        float j = 5.5f;
        System.out.println(j);

        int n = (int)j;
        System.out.println(n);

        // Ép kiểu biến nguyên thủy và biến đối tượng
        int x = new Integer(323);
        System.out.println(x);

        // float y = 6.5f;
        // int z = new Integer(y);
        // System.out.println(z);   ======>>> wrong

    }
}
