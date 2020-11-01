package Lifo;

public class Lifo {

    private int[] array = new int[10];
    int elementsNumber;

    public void add(int a) {
        if (elementsNumber == 10) {
            System.out.println("I am full!");
        } else {
            array[elementsNumber] = a;
            elementsNumber++;
            System.out.println("Element was added!");
        }
    }

    public int pop() {
        if (elementsNumber == 0) {
            System.out.print("I'm empty. I have now elements in the array - ");
            return elementsNumber;

        } else {
            int element0 = array[0];
            shiftArray();
            elementsNumber--;
            return element0;

        }
    }

    private void shiftArray() { // переписати через цикл,

        for (int arraySh : array) {
            arraySh = ++arraySh;
        }
    }
}


/*array[0] = array[1];
        array[1] = array[2];
        array[2] = array[3];
        array[3] = array[4];
        array[4] = array[5];
        array[5] = array[6];
        array[6] = array[7];
        array[7] = array[8];
        array[8] = array[9];*/





/*
    String st = "I am empty!";
    int in = 0;
            System.out.println(st);
                    switch (in) {
                    case 0: System.out.println("I am empty!");break;
                    return in;
                    }*/
