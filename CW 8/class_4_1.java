package class_work_8;
import cw8.RatioNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class class_4_1 {
    ArrayList<RatioNumber> arr;
    int degree;

    public Polinom(ArrayList<RatioNumber> fillArr, int degree) {
        for (int i = 0; i < this.arr.size(); i++) {
            this.arr.set(i, fillArr.get(i));
        }
        this.degree = degree;
    }

    public void print() {
        for (int i = 0; i < this.arr.size(); i++) {
            System.out.print(this.arr.get(i) + " * x^" + (this.arr.size() - i) + " ");
        }
        System.out.println();
    }

    public Polinom plus(Polinom that) {
        int maxDegree = (this.degree < that.degree) ? that.degree : this.degree;

        ArrayList<RatioNumber> arr = new ArrayList<RatioNumber>();

        for (int i = 0; i < maxDegree; i++) {
            RatioNumber r = this.arr.get(i).plus(that.arr.get(i));
            arr.add(r);
        }

        return new Polinom(arr, maxDegree);
    }
}