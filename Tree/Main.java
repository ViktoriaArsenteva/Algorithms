package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // HashMap hm = new HashMap();
        // for(int i=0; i<10; i++){
        //     hm.add(i, i*i);
        // }
        // hm.add(150, 45);
        // hm.del(5);
        // hm.del(13);
        // hm.print();

        // System.out.println(hm.find(150));
        // System.out.println(hm.find(143));
        final RedBlackTree tree = new RedBlackTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                } catch (Exception ignored) {
                    
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}