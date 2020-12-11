package Classes;

import java.util.Collections;
import java.util.Scanner;

public class Method {
    Menugenerator menugenerator = new Menugenerator();
    PlayerList playerList = new PlayerList();
    Scanner scannerMethod = new Scanner(System.in);
    Fixtures fixtures = new Fixtures();
    Cart cart = new Cart();
    int ticketchoice = 0;
    int ticketquantity =0;

    public void startProgram() {

        menugenerator.show(menugenerator.getMenu());
        switch (menugenerator.getMenu().inputInt) {
            case 1:
                doWhenmenuChoose1();
                break;
            case 2:
                doWhenmenuChoose2();
                break;
            case 3:
                doWhenmenuChoose3();
                break;
            case 4:
                doWhenmenuchoose4();
        }
    }


    public void doWhenmenuChoose1() {
        menugenerator.show(menugenerator.getMenu1());
        switch (menugenerator.getMenu1().inputInt){
            case 1:
                doWhenmenuChoose11();
                break;
            case 2:
                doWhenmenuChoose12();
                break;
            case 3:
                doWhenmenuChoose13();
                break;
        }
    }
    public void doWhenmenuChoose2(){
        menugenerator.show(menugenerator.getMenu2());
        switch (menugenerator.getMenu2().inputInt){
            case 1:
                doWhenmenuchoose21();
                break;
            case 2:
                doWhenmenuchoose22();
        }
    }
    public void showplayerList(){
        for (PlayerList.Players player : playerList.playerListArray) {
            System.out.println(player.toString());
        }

    }

    public void doWhenmenuChoose11() {
        showplayerList();
        menugenerator.show(menugenerator.getMenu11());
        switch (menugenerator.getMenu11().inputInt){
            case 0:
                startProgram();
            case 1:
                doWhenmenuChoose1();

        }
    }
    public void doWhenmenuChoose12(){
       playerList.sort();
        showplayerList();
        menugenerator.show(menugenerator.getMenu12());
        switch (menugenerator.getMenu12().inputInt){
            case 0:
                startProgram();
            case 1:
                doWhenmenuChoose1();

        }
    }
    public void doWhenmenuChoose13(){
        System.out.println("Nhập tên cầu thủ bạn muốn tìm");
        String hint = scannerMethod.nextLine();
        boolean isFound = false;
        for (int i = 0; i <hint.length() ; i++) {
            String hinttocheck = hint.substring(0,hint.length()-i);
            for (int j = 0; j < playerList.playerListArray.size(); j++) {
                if(playerList.playerListArray.get(j).getPlayerName().contains(hinttocheck)){
                    System.out.println("kết quả tìm kiếm là:");
                    System.out.println(playerList.playerListArray.get(j).toString());
                    isFound = true;
                }
            }
            if(isFound){
                break;
            }
        }
        if(isFound == false){
            System.out.println("không tìm thấy");
        }
        menugenerator.show(menugenerator.getMenu13());
        switch (menugenerator.getMenu13().inputInt){
            case 0:
                startProgram();
                break;
            case 1:
                doWhenmenuChoose1();
                break;
        }
    }
    public void doWhenmenuchoose21(){
        fixtures.showFixtures();
        menugenerator.show(menugenerator.getMenu21());
        switch (menugenerator.getMenu21().inputInt){
            case 0: startProgram();
            break;
            case 1:doWhenmenuChoose2();
        }
    }
    public void doWhenmenuchoose22(){
        fixtures.showTickets();
        System.out.println("Nhập id của trận đấu bạn muốn book vé");
        setticketchoice();
        while (!fixtures.fixtureList.get(ticketchoice-1).isEnoughToBuy() || !fixtures.fixtureList.get(ticketchoice-1).isEnoughforCart() ){
            System.out.println("trận đấu bạn muốn mua đã hết vé hoặc vượt quá số lượng vé tối đa, vui lòng chọn id trận khác");
            setticketchoice();
        }
        System.out.println("Nhập số lượng vé bạn muốn mua");
        setTicketquantity();
        fixtures.fixtureList.get(ticketchoice-1).updateAvailable(ticketquantity);
        while (!fixtures.fixtureList.get(ticketchoice-1).isEnoughforCart()){
            System.out.println("Bạn đã đặt quá số lượng vé tối đa, mời chọn lại số lượng");
            setTicketquantity();
            fixtures.fixtureList.get(ticketchoice-1).updateAvailable(ticketquantity);
        }
        fixtures.fixtureList.get(ticketchoice-1).setIncart(ticketquantity);
        cart.updateCartList(fixtures.fixtureList);
        menugenerator.show(menugenerator.getMenu22());
        switch (Menu.inputInt){
            case 1:
                doWhenmenuchoose22();
                break;
            case 2:
                startProgram();
        }

    }
    public void setticketchoice(){
        Menu.setInputInt();
        switch (Menu.inputInt){
            case 1:
                ticketchoice = 1;
                break;
            case 2:
                ticketchoice =2;
                break;
            case 3:
                ticketchoice =3;
                break;
            case 4:
                ticketchoice= 4;
                break;
            default:
                System.out.println("Id không hợp lệ");
                setticketchoice();
        }
    }
    public void setTicketquantity(){
        Menu.setInputInt();
        ticketquantity = Menu.inputInt;
    }
    public void doWhenmenuChoose3(){
        for(Goods tickets: cart.cartList){
            fixtures.fixtureList.get(tickets.getId()+1).updateStock();
        }
    }
    public void doWhenmenuchoose4(){
        cart.showcartList();
        menugenerator.getMenu4().show();
    }
}