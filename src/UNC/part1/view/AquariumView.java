package UNC.part1.view;

import UNC.part1.domain.Fish;
import UNC.part1.service.AquariumService;

import java.util.Scanner;

public class AquariumView {
    private AquariumService aquariumService = new AquariumService();

    public void  showFishes(){
        System.out.println("All fishes: ");
        aquariumService.getFishes().forEach(System.out::println);
    }

    public  void removeFish (long fishId1){
        if(aquariumService.removeFishById(fishId1)){
            System.out.println(String.format("Fish with id=%d has been removed", fishId1));
        } else {
            System.out.println(String.format("Fish with id=%d does not exists", fishId1));
        }
    }

    public  void addFish (Scanner in){
        System.out.println("Enter fish id: ");
        long fishId2 = in.nextInt();
        System.out.println("Enter food preference: ");
        long food2 = in.nextInt();
        System.out.println("Enter fish name: ");
        String name2 = in.next();
        Fish fish = new Fish(fishId2, name2, food2);
        aquariumService.addFishId(fish);
    }

    public void compareIdFood (Scanner in){
        System.out.println("Select fish id: ");
        long fishId3 = in.nextInt();
        System.out.println("Select food for fish: ");
        long food3 = in.nextInt();
        aquariumService.compare(fishId3, food3);
    }
}