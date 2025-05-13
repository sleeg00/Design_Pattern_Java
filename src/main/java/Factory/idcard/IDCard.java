package Factory.idcard;

import Factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }
    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner +"]";
    }
    public String getOwner() {
        return this.owner;
    }
}
