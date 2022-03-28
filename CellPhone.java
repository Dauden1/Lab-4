public class CellPhone {
    private String name;
    private String phoneNumber;
    private String ringTone;
    private boolean doNotDisturb;
    public CellPhone(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        ringTone = "beep";
        doNotDisturb = false;
    }
    public CellPhone(){
        name = "John Doe";
        phoneNumber = "1234567890";
        ringTone = "beep";
        doNotDisturb = false;
    }
    public String getOwnerName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getRingTone() {
        return ringTone;
    }

    public boolean isDoNotDisturb() {
        return doNotDisturb;
    }
    public void setDoNotDisturb(boolean condition){
        doNotDisturb = condition;
    }
    public void setRingTone(String tone){
        ringTone = tone;
    }
    public void incomingCall(){
        if(!doNotDisturb){
            System.out.print(ringTone);
        }else{
            System.out.print("shhh");
        }
    }
    @Override
    public String toString(){
        return "Phone Owner : " + name + " , " + "Number : " + phoneNumber;
    }
    public static void main(String[] args){
        CellPhone phone = new CellPhone("Sue","888-999-000");
        phone.setRingTone("ringRing");
        phone.incomingCall();
        phone.setDoNotDisturb(true);
        phone.incomingCall();
    }
}
