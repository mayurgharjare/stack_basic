package STACK;
import java.util.Stack;

public class PancakeStack {
    public static void main(String[] args) {
        Stack<String> pancakes = new Stack<>();

        // Making pancakes
        pancakes.push("Plain");
        pancakes.push("Blueberry");
        pancakes.push("Chocolate Chip");

        System.out.println("Pancake stack: " + pancakes);

        // Eating the top pancake
        String eatenPancake = pancakes.pop();
        System.out.println("Yum! Just ate a " + eatenPancake + " pancake.");

        // Checking the next pancake
        System.out.println("Next pancake is: " + pancakes.peek());

        // Adding more pancakes
        pancakes.push("Banana");

        // Checking stack size
        System.out.println("Number of pancakes left: " + pancakes.size());

        // Searching for a pancake
        int position = pancakes.search("Plain");
        if (position != -1) {
            System.out.println("Plain pancake is " + position + " from the top.");
        } else {
            System.out.println("No plain pancakes left!");
        }
    }
}

    

