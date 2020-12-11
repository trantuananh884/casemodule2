package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> titleList = new ArrayList<>();
    static int inputInt = 0;
    public Menu(){
    }

    public void addTitle(String newtitle) {
        titleList.add(newtitle);
    }

    public void show() {
        for (String title : titleList) {
            System.out.println(title);
        }
        setInputInt();
    }

    public static void setInputInt() {
        try{
            Scanner scannerMenu = new Scanner(System.in);
            inputInt = scannerMenu.nextInt();
        }catch (Exception e){
            setInputInt();
        }
    }
}
