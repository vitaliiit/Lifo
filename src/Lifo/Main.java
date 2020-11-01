package Lifo;

public class Main {
    public static void main(String[] args) {

        try {
            Lifo lifo = new Lifo();

            lifo.add(5);
            lifo.add(6);
            lifo.add(7);

            System.out.println(lifo.pop());
            System.out.println(lifo.pop());
            System.out.println(lifo.pop());
            System.out.println(lifo.pop());
            System.out.println(lifo.pop());

        } catch (Exception e) {
            System.out.println("Don't do this!");
        } finally {
            System.out.println("Still working!");
        }
    }
}

