package cw23052018t1;

public class Stringa {
    String str = new String();
    Stringa (String str){
        this.str = str;
    }

    public void concat(String str){
        this.str = this.str + str;
    }

    public int length(){
        return this.str.length();
    }

    public String toString(){
        return this.str;
    }
}
