/**
 * @author David Auden
 * @version 1.0
 */
public class Case {
    protected String caseColor;
    protected String caseOwner;
    public Case(String name,String color){
        caseColor = color;
        caseOwner = name;
    }

    /**
     * Color of case object
     * @return color instance
     */
    public String getColor(){
        return caseColor;
    }

    /**
     * Returns Name of case object
     * @return caseOwner instance
     */
    public String getOwnerName(){
        return caseOwner;
    }

    /**
     * Returns Object as String Representation
     * @return String
     */
    @Override
    public String toString(){
        return "Case Owner : "+caseOwner+" , "+"Color : "+caseColor;
    }
    public static void main(String[] args){
        Case case1 = new Case("Sue","Maroon");
        System.out.println(case1.toString());
    }
}
