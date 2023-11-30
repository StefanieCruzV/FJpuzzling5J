import java.util.Date;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
         
    ArrayList<Integer> getTenRolls(){

        Random random = new Random();
        ArrayList<Integer> arrayToReturn = new ArrayList<Integer>();
        System.out.println(arrayToReturn); 
        arrayToReturn.add(5);

        // int val = random.nextInt(21);  
        // System.out.println("Random Integer value : "+ val);
        for (var i = 0 ;i <=10; i++) {
            arrayToReturn.add(random.nextInt(21));
        }

        return  arrayToReturn;
    }

     char getRandomLetter(){
        Random random = new Random();
         char [] letters = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y','z'}; 
        int val = random.nextInt(27);  
        char randomchar =letters[val];
        return  randomchar;
    }

     String generatePassword(){
        String password = "";
         for (var i = 0 ;i <=7; i++) {
            password = password + getRandomLetter();
        }

        return password;
     }

     String getNewPasswordSet(int value){
        String passwordSet = "";
         for (var i = 0 ;i <= value -1; i++) {
            passwordSet = passwordSet + getRandomLetter();
        }

        return passwordSet;
     }


}

