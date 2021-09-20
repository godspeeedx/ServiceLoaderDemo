package pack;

import java.util.ServiceLoader;

public class Demo {

    public static ServiceLoader<Engine> engineLoader = ServiceLoader.load(Engine.class);

    public static void main(String[] args) {

        Engine engine = getEngine(60);

        System.out.println(engine.getCost());

    }

    public static Engine getEngine(int maxcost) {
        for (Engine engine : engineLoader) {
            if (engine.getCost() < maxcost)
                return engine;
        }
        return null;
    }

}
