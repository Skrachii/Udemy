package Udemy.HashMap;

public class Ex4 {
    public static void main(String[] args) {

        Contacts theContacts=new Contacts();
        theContacts.addContacts("111111111","Stefan");
        theContacts.addContacts("222222222","Vladi");
        theContacts.addContacts("333333333","Emo");
        System.out.println(theContacts.getAllContacts());
        System.out.println(theContacts.getName("111111111"));
        theContacts.removeContact("3333333333");
        System.out.println(theContacts.getAllContacts());
        System.out.println(theContacts.getName("3333333333"));
        System.out.println(theContacts.getPhone("Vladi"));

    }
}
