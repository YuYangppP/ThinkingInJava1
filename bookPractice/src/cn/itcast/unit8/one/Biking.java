package cn.itcast.unit8.one;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Biking.java
 * @Description TODO
 * @Date 2019/10/8 20:31
 */
class Cycle {
    private String name = "Cycle";
    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }
    @Override
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    @Override
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    @Override
    public String toString() {
        return this.name;
    }

}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    @Override
    public String toString() {
        return this.name;
    }
}

public class Biking {
    public static void ride(Cycle c) {
        c.travel(c);
    }
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}

