import java.util.UUID;

/**
 * Created by staLker on 23-06-2017.
 */
public class MyCustomer {
    public static final String SUCCESSFUL_VALIDATION_OF_CUSTOMER = "valid data";
    private int id;
    private String fName;
    private String lName;
    private long contact;
    private String password;
    private String gender = null;

    public MyCustomer(){
        this.id = 1000 + (int)(Math.random() * 8999);
    }

    public void setMyCustomer(String fName, String lName, long contact, String password, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.contact = contact;
        this.password = password;
        this.gender = gender;
    }
    public String validateCustomer(String anotherPassword){
        String message = "";
        if(isFNameValid()&&isLNameValid()&&isContactValid()&&isPasswordMatched(anotherPassword)&&isGenderValid()){
            message = SUCCESSFUL_VALIDATION_OF_CUSTOMER;
        }
        else {
            if(!isFNameValid()){
                message = message+"Invalid First Name..it must start with a Capital letter.\n";
            }
            if(!isLNameValid()){
                message = message+"Invalid Last Name..it must start with a Capital letter.\n";
            }
            if(!isContactValid()){
                message = message+"Enter a valid 10-digit contact no.\n";
            }
            if(!isPasswordMatched(anotherPassword)){
                message = message+"Both password must match\n";
            }
            if (!isGenderValid()){
                message = message+"Select gender\n";
            }

        }


        return message;
    }
    private boolean isFNameValid(){
        if(this.fName.matches( "[A-Z][a-zA-Z]*" )){
            return true;
        }
        else return false;
    }
    private boolean isLNameValid(){
        if(this.lName.matches( "[A-Z][a-zA-Z]*" )){
            return true;
        }
        else return false;

    }
    private boolean isContactValid(){
        if(String.valueOf(this.contact).matches( "\\d{10}" )){
            return true;
        }
        else return false;
    }
    private boolean isPasswordMatched(String anotherPassword){
        if(this.password.intern() == anotherPassword.intern()){
            return true;
        }
        else return false;

    }
    private boolean isGenderValid(){
        if(this.gender!=null){
            return true;
        }
        else return false;
    }


    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public long getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }
}
