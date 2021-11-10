package Udemy.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

    private HashMap<String, String> contacts;

    public Contacts(){
        contacts=new HashMap<>();
    }
    public void addContacts(String phoneNumber, String name){
        contacts.put(phoneNumber,name);
    }
    public void removeContact(String phoneNumber){
        contacts.remove(phoneNumber);
    }
    public String getAllContacts(){
        String result="";
        for (String phoneNumber:contacts.keySet()) {
            String name=contacts.get(phoneNumber);
            result=result+name+ ": " + phoneNumber + "\n";
        }
        return result;
    }
    public String getName(String phoneNumber){
       String name = contacts.get(phoneNumber);
       if(name!=null){
           return name;
       }
       else {
           return "Name for this phone number " + phoneNumber + " not found";
       }
    }
    public ArrayList<String> getPhone(String name) {
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (name.equalsIgnoreCase(entry.getValue())) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
