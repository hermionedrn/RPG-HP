package HPCode;

import HPCode.composants.Characters.Wizard;
import HPCode.composants.Levels.*;
import HPCode.composants.Other.SortingHat;
import HPCode.composants.Other.Potion;
import HPCode.composants.WandStuff.Wand;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // --------------- Initialisation of the character --------------- //
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("");
        System.out.println("*---* Bienvenue dans le monde d'Harry Potter, qui es-tu ? *---*");
        // Creating the main character
        System.out.print("Entre ton prénom : ");
        String firstName = sc.nextLine();
        System.out.print("Entre ton nom de famille : ");
        String lastName = sc.nextLine();
        // Setting the data of the character
        Potion smallHealPotion = new Potion("Potion de vie", 20);
        Wand wand = new Wand();
        wand.getCore();
        wand.setSize(wand.getWandSize());
        Wizard wizard = new Wizard(22, 0, 5, 0, 10, firstName, lastName, null, wand, null, new ArrayList<>(), new ArrayList<>());
        SortingHat.assignHouse(wizard);

        // --------------- Chapters --------------- //
        Levels(wizard);

    }

    private static void Levels(Wizard wizard) throws InterruptedException {
        // --------------- Introduction --------------- //
        Introduction introduction = new Introduction();
        introduction.runi(wizard);
        // --------------- Level 1 --------------- //
        Level1 level1 = new Level1(wizard);
        level1.run1(wizard);
        // --------------- Level 2 --------------- //
        Level2 level2 = new Level2(wizard);
        level2.run2(wizard);
        // --------------- Level 3 --------------- //
        Level3 level3 = new Level3(wizard);
        level3.run3(wizard);
        // --------------- Level 4 --------------- //
        Level4 level4 = new Level4(wizard);
        level4.run4(wizard);
        // --------------- Level 5 --------------- //
        Level5 level5 = new Level5(wizard);
        level5.run5(wizard);
        // --------------- Level 6 --------------- //
        Level6 level6 = new Level6(wizard);
        level6.run6(wizard);
    }
}
