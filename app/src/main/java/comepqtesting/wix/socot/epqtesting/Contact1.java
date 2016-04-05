package comepqtesting.wix.socot.epqtesting;

/**
 * Created by Scott on 4/5/2016.
 */
public class Contact1 {

    private String _name1, _phone1, _email1, _address1;

    public Contact1 (String name, String phone, String email, String address) {
        _name1 = name;
        _phone1 = phone;
        _email1 = email;
        _address1 = address;

    }

    public String getName1() {
        return _name1;
    }

    public String get_phone1() {
        return _phone1;
    }

    public  String get_email1() {
        return _email1;
    }

    public String get_address1(){
        return _address1;
    }

}
