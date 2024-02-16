public class Main {
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }

    public static void main(String[] args){

        int addition1 = add(5,6);
        int addition2 = add(534,21);
        int addition3 = add(1,97);
        int subtraction1 = subtract(12,3);
        int subtraction2 = subtract(64,123);
        int subtraction3 = subtract(1200,34);

        Integer[] additionResults = {addition1,addition2,addition3};
        Integer[] subtractionResults = {subtraction1,subtraction2,subtraction3};

        System.out.println("Addition results with for loop: ");
        for (Integer i : additionResults){
            if (i % 2 == 0){
                System.out.println(i+" is even");
            } else {
                System.out.println(i+ " is odd");
            }
        }

        System.out.println();
        System.out.println("Subtraction results with for loop:");
        for (Integer i : subtractionResults) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

        System.out.println();
        System.out.println("Addition and subtraction results with for loop: ");
        int i = 0;
        while (i < additionResults.length){
            if (additionResults[i] % 2 == 0) {
                System.out.print(additionResults[i] + " is even ");
            } else {
                System.out.print(additionResults[i] + " is odd ");
            }
            i++;
        }

        int x = 0;
        while (x < subtractionResults.length){
            if (subtractionResults[x] % 2 == 0) {
                System.out.print(subtractionResults[x] + " is even ");
            } else {
                System.out.print(subtractionResults[x] + " is odd ");
            }
            x++;
        }
    }
}