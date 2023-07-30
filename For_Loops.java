public class For_Loops {
    public static void main(String[] args) {

        //counter++ => Counter = Counter + 1
        for(int counter = 0; counter < 10; counter = counter + 1) {
            System.out.println("Hello World");
        }

        for(int counter = 0; counter < 11; counter++) {
            System.out.println(counter);
        }

        for(int counter = 0; counter < 11; counter++) {
            System.out.print(counter + " ");
        }

        for(int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
    }
}