package _06_tea_party;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
 public String welcome(String name, boolean isWoman, boolean isKnighted) {
	       if(isWoman == true && isKnighted == true) {
	    	   return "Hello Lady " + name;  }
	       if(isWoman == true && isKnighted == false) {
	    	   return "Hello Ms. " + name; }
	       if(isWoman == false && isKnighted == true) {
	    	   return "Hello Sir " + name; }
	       if (isWoman == false && isKnighted == false) {
	    	   return "Hello Mr. " + name;}
	       return name;
	    }
	}


