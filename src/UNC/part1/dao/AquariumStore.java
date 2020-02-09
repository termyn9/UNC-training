package UNC.part1.dao;

import java.util.ArrayList;
import java.util.List;
import UNC.part1.domain.Fish;

public class AquariumStore {
    private List <Fish> fishes = new ArrayList<>();

    private static AquariumStore instance;

    public static  AquariumStore getInstance(){
        if (instance == null) {
            instance = new AquariumStore();
        }
        return instance;
    }

    private AquariumStore() { populateFishes();}

    public List<Fish> getFishes() {return fishes;}

    public boolean removeFish(Fish fish) {return fishes.remove(fish);}
    public boolean addFish(Fish fish) {return fishes.add(fish);}
    public Fish getFishById(long fishId3) {
        for (Fish fish : fishes){
            if (fish.getId().equals(fishId3)){
                return fish;
            }
        }
        return null;
    }

    private void populateFishes(){
        for (int i = 1; i < 10; i++) {
            Fish fish = new Fish((long) i, "Fish_" + i, (long) i);
            fishes.add(fish);
        }
    }
}
