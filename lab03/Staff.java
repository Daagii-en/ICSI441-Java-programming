package b1;

public class Staff {

	public Staff(String name, String position){
        staffName=name;
        staffProfession= profession;
        staffAddress = "unknown";
        }
	public String getName(){
        return staffName;
    }
    public String getProfession(){
        return staffPosition;
    }
    public void setPhone(int Phone){
        phoneNumber=Phone;
    }
    public void setAddress(String Address ){
        staffAddress = Address;
    }
    public String toString(){
        return staffName  + "(" +staffProfession + ")" ;
        }
    public String getContactInfo(){
        return "mobile:" + phoneNumber+ "\naddress: "+staffAddress;
        }
    private String staffName;
    private int phoneNumber;
    private String staffAddress;
    private String staffProfession;
    public static void main(String[] args){
    	
		Staff s = new Staff("Davaajargal", "IT");
		s.setPhone(123445);
		s.setAddress("BZD-1-horoo");
		
		System.out.println(s+"\n  "+ s.getContactInfo());
	}
}
