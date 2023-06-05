import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;
    {
        contacts = new ArrayList<>();
        contacts.add(new Contact("Tuta","Tama","88005553535"));
        contacts.add(new Contact("Pochi","Mochi","98475897598"));
        contacts.add(new Contact("Opa","Topa","88005553535"));
        contacts.add(new Contact("1","1","1"));
    }

    public void add(Contact contact) throws Exception {
        if (contacts.contains(contact)){
            throw new Exception("Uczje est etot contact");
        }
        contacts.add(contact);
    }
    public  void printAll(){
        int count = 1;
        for (Contact c:contacts) {
            System.out.println(count + ")" + c.toString());
            count++;
        }
    }
    public void delete(int index) throws Exception {
        if (contacts.size()>index && index>=0){
            contacts.remove(index);
        }else{
            throw new Exception("Incorrect index");
        }
    }
}
