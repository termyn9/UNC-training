package UNC.part1;

import UNC.part1.domain.Fish;
import UNC.part1.service.AquariumService;
import UNC.part1.view.AquariumView;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner in = new Scanner (System.in);
    private AquariumView aquariumView = new AquariumView();

    public void run() {showMainMenu();}

    private void showMainMenu(){
        while (true) {
            System.out.println("===MENU===");

            System.out.println("1.Show all fishes");
            System.out.println("2.Delete fish № (?)");
            System.out.println("3.Add new fish");
            System.out.println("4.Feed of fishes");
            System.out.println("Enter 10 - exit");

            int menuItem = in.nextInt();

            switch (menuItem){
                case 1:
                    System.out.println("All fishes are shown");
                    aquariumView.showFishes();
                    break;
                case 2:
                    System.out.println("Enter fish id: ");
                    int fishId1 = in.nextInt();
                    aquariumView.removeFish(fishId1);
                    break;
                case 3:
                    aquariumView.addFish(in);
                    break;
                case 4:
                    System.out.println("Select id fish and her food");
                    aquariumView.compareIdFood(in);
                    break;
                case 10:
                    System.exit(0);
            }
        }
    }
}
