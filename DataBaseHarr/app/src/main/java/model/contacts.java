package model;

public class contacts {

    // names of contact class variables.
    private int id;
    private String name;
    private String phoneNumber;

    // make constructors for contact.  if anyone want to take name and (phone number).

    public contacts( String name , String phoneNumber){

        this.name= name;
        this.phoneNumber=phoneNumber;

    }

    // make constructors for contact.  if anyone want to take (id,name and phone number).
    public contacts(int id,String name, String phoneNumber){
        this.id = id;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    // make constructors for contact.  if anyone do not want anything. make default constructor.

    public contacts(){

    }

    // make geter and seter for above constructors.


       // for id.
    public void setId(){
          this.id=id;
    }
    public int getId(){
        return id;
    }

       // for name.

      public void setName(String s){
        this.name=name;
      }
      public String getName(){
        return name;
      }


         // for phoneNumber.

    public void setPhoneNumber(String i){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber = phoneNumber;
    }




}
