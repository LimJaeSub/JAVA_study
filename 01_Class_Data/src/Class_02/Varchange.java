package Class_02;

public class Varchange {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA : "+ dataA);
        System.out.println("dataB : "+ dataB);

        // dataA 변경
        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);
    }
}
