package siu.example.com.temworkgit;

/**
 * Created by Billy on 4/11/16.
 */
public class Actor {
    String name;
    String DOB;
    int oscarWon;


    public Actor(String name, String DOB, int oscarWon) {
        this.name = name;
        this.DOB = DOB;
        this.oscarWon = oscarWon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getOscarWon() {
        return oscarWon;
    }

    public void setOscarWon(int oscarWon) {
        this.oscarWon = oscarWon;
    }


}
