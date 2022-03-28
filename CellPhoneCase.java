public class CellPhoneCase extends Case {
    private CellPhone phone;
    public CellPhoneCase(String name, String color, String phoneNumber){
        super(name,color);
        phone = new CellPhone(name,phoneNumber);
    }
    public CellPhone getCellPhone(){
        return phone;
    }
    private void quietPhone(){
        phone.setDoNotDisturb(true);
    }
    public static void swapPhones(CellPhoneCase case1, CellPhoneCase case2){
        CellPhoneCase temp;
        temp = case1;
        case1= case2;
        case2=temp;
    }
    @Override
    public String toString(){
        return super.toString()+ " , " + phone.toString();
    }
    public static void main(String[] args){
        Cell
    }
}
