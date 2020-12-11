package Classes;

public class Menugenerator {
    Menu menu =new Menu();
    Menu menu1 =new Menu();
    Menu menuback = new Menu();
    Menu menu11 = new Menu();
    Menu menu12 = new Menu();
    Menu menu13 = new Menu();
    Menu menu2 = new Menu();
    Menu menu21 = new Menu();
    Menu menu22 = new Menu();
    Menu menu4 = new Menu();
    public Menugenerator(){
        menu.addTitle("1.danh sách cầu thủ");
        menu.addTitle("2.Lịch thi đấu");
        menu.addTitle("3:Tat toan don hang");
        menu.addTitle("4:chinh sua don hang");
        menu1.addTitle("1:Hiển thị toàn bộ danh sách");
        menu1.addTitle("2:Hiển thị danh sách sắp xếp theo tên");
        menu1.addTitle("3:Hiển thị danh sách tìm kiếm theo tên");
        menuback.addTitle("0:Quay về trang chủ");
        menuback.addTitle("1:Quay về trang trước đó");
        menu11 =menu12=menu13=menu21=menuback;
        menu2.addTitle("1:Hiển thị lịch thi đấu");
        menu2.addTitle("2:Book vé");
        menu22.addTitle("1:Mua tiep");
        menu22.addTitle("2:Back ve menu goc");
        menu4.addTitle("1:Mua them");
        menu4.addTitle("2:sua so luong");
        menu4.addTitle("3:Xoa don hang");

    }

    public void show(Menu menuex) {
       menuex.show();
    }

    public Menu getMenu() {
        return menu;
    }

    public Menu getMenu1() {
        return menu1;
    }

    public Menu getMenuback() {
        return menuback;
    }

    public Menu getMenu11() {
        return menu11;
    }

    public Menu getMenu12() {
        return menu12;
    }

    public Menu getMenu13() {
        return menu13;
    }

    public Menu getMenu2() {
        return menu2;
    }

    public Menu getMenu21() {
        return menu21;
    }

    public Menu getMenu22() {
        return menu22;
    }

    public Menu getMenu4() {
        return menu4;
    }
}
