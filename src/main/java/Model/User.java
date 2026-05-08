package Model;

public class User {
  public int userid;
    String name;

    User(int userid,String name ){
        this.name=name;
        this.userid=userid;

    }
    void DisplayUser(){
        System.out.println(userid + " "+ name);
    }
}
