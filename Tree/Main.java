package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("Well done");
                } catch (Exception ignored) {
                    
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    // final RedBlackTree tree = new RedBlackTree();
    //     for(int i = 0; i < 10;i++){
    //         tree.add(i);
    //         System.out.println("Well done");
    //     }
    
    }
}