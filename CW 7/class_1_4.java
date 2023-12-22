package class_work_7;


public class class_1_4 {
    protected int data;
    public void setData(int value) {
        this.data = value;
    }
    public int getData() {
        return this.data;
    }
}
class Main {
    public static void main(String[] args) {
        Task7_1_4 obj = new Task7_1_4();
        obj.setData(42);
        System.out.println("Значення поля: " + obj.getData());
    }
}
