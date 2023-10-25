public abstract class planet implements Comparable <planet> {
    String name;
    int distance;
    int moons;
    float size;

    public planet(String name, int distance, int moons, float size){
        this.name = name;
        this.distance = distance;
        this.moons = moons;
        this.size = size;
    }
}
