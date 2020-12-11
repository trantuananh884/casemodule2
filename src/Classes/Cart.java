package Classes;

import java.util.ArrayList;

public class Cart {
    ArrayList<Goods>cartList = new ArrayList<>();

    public ArrayList<Goods> getCart() {
        return cartList;
    }

    public void updateCartList(ArrayList<?extends Goods> arrayList) {
        for (Goods goods : arrayList){
            if(goods.incart>0){
                this.cartList.add(goods);
            }
        }
    }
    public void showcartList(){
        for(Goods goods :cartList){
            System.out.println(goods.toString());
        }
    }
}
