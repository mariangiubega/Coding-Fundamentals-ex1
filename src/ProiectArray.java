import java.util.Scanner;

public class ProiectArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray(input);
        int N = input.nextInt();
        System.out.println(getNthOdd(array,N));
    }

        private static int getNthOdd(int[] array, int N){
        int count=1;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                if(count==N)
                    return array[i];
                count++;
            }
        }
            return -1;
        }

        private static int [] getArray (Scanner input) {
            System.out.println("Introduceti elementele: ");
            String line = input.nextLine();
            String[] elements = line.split (" ");
            int[] array = new int [elements.length];
            for (int i=0; i<elements.length; i++)
                array[i]=Integer.valueOf(elements[i]);
            return array;
        }

    }

