import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            String name = sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            int distance = Integer.parseInt(data[0]);
            int moons = Integer.parseInt(data[1]);
            float size = Integer.parseInt(data[2]);

            planet planet = new planet(name, distance, moons, size);

        }
    }
}