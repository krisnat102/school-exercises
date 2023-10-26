import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Planet implements Comparable<Planet>{

    String name;
    int number;
    int moons;
    float size;

    public Planet(String name, int number, int moons, float size) {
        this.name = name;
        this.number = number;
        this.moons = moons;
        this.size = size;
    }

    public int compareTo(Planet other) {
        if (this.size != other.size) {
            return Double.compare(other.size, this.size);
        }
        int nameComparison = Integer.compare(this.name.length(), other.name.length());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.number, other.number);
    }
}

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        if(n > 100){
                System.out.println("must be less than 100");
                System. exit(0);
            }
        
        List<Planet> planets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if(name.length() > 30){
                System.out.println("must be less than 30 chars");
                System. exit(0);
            }
            String[] planetData = sc.nextLine().split(" ");
            int number = Integer.parseInt(planetData[0]);
            int moons = Integer.parseInt(planetData[1]);
            float size = Float.parseFloat(planetData[2]);
            planets.add(new Planet(name, number, moons, size));
        }
        Collections.sort(planets);

        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%3d. %s\n", i + 1, planets.get(i).name);
        }

        System.out.println("enter a substring");

        String substring = sc.nextLine();

        List<Planet> filteredPlanets = new ArrayList<>();

        for (Planet planet : planets) {
            if (planet.name.contains(substring)) {
                filteredPlanets.add(planet);
            }
        }

        Collections.sort(filteredPlanets, (p1, p2) -> Integer.compare(p2.moons, p1.moons));

        for (int i = 0; i < filteredPlanets.size(); i++) {
            System.out.printf("%3d. %s\n", i + 1, filteredPlanets.get(i).name);
        }
        sc.close();
    }
}