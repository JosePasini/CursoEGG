package egg_poo_10;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> A = new ArrayList();
        ArrayList<Double> B = new ArrayList();
        double x, aux = 0;

        for (int i = 0; i < 50; i++) {
            x = Math.random() * 9 + 1;
            x = Math.round(x * 100.0) / 100.0;
            A.add(x);
        }
        System.out.println("//////////////////////////////////");
        System.out.println("Arreglo A de 50 índices");
        System.out.println("//////////////////////////////////");
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }

        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - i - 1; j++) {
                if (A.get(j + 1) < A.get(j)) {
                    aux = A.get(j + 1);
                    A.set((j + 1), A.get(j));
                    A.set(j, aux);
                }
            }
        }
        System.out.println("//////////////////////////////////");
        System.out.println("Arreglo A de 50 índices Ordenado");
        System.out.println("//////////////////////////////////");
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }

        System.out.println("//////////////////////////////////");
        System.out.println("Arreglo B de 20 índices");
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                B.add(A.get(i));
            } else {
                B.add(0.5);
            }
        }
        System.out.println("//////////////////////////////////");
        for (int i = 0; i < B.size(); i++) {
            System.out.println(B.get(i));
        }
    }

}
