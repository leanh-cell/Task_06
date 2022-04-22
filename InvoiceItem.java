public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;
    public InvoiceItem(String id,String desc,int qty,double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public int setQty(int qty) {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public double setUnitPrice(double unitPrice){
        return unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }

    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public static void main(String[] args) {
        InvoiceItem I1 = new InvoiceItem("01","ao",1,100);
        System.out.println(I1.toString());
        System.out.println("the ID is: "+I1.getId());
        System.out.println("the DESC is: "+I1.getDesc());
        System.out.println("the QTY is: "+I1.getQty());
        System.out.println("the Unit Price is: "+I1.getUnitPrice());
    }
}

