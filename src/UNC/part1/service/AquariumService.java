package UNC.part1.service;

import UNC.part1.dao.AquariumStore;
import UNC.part1.domain.Fish;

import java.util.List;

public class AquariumService {
    private AquariumStore aquariumStore = AquariumStore.getInstance();

    public List<Fish> getFishes() {return aquariumStore.getFishes();}

    public boolean removeFishById(long fishId1){
        Fish fish = new Fish(fishId1);
        return aquariumStore.removeFish(fish);
    }

    public boolean addFishId(Fish fish) {
        return aquariumStore.addFish(fish);
    }

    public void compare(long fishId3, long food3){
        Fish fish = aquariumStore.getFishById(fishId3);
                if (fish.getFood() == food3) {
                    System.out.println("Fish " + fishId3 + " think that food " + food3 + " very delicious");
                } else {
                    System.out.println("Fish " + fishId3 + " wants to refuse food " + food3);
                }
            }
}


