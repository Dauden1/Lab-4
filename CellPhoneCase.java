public class CellPhoneCase extends Case {
    private CellPhone phone;
    private CellPhone temp;
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
        CellPhoneCase temp = new CellPhoneCase();
        case1 = temp;
    }
}
