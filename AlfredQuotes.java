import java.util.Date;
import java.text.SimpleDateFormat;  

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greetingAGuest = String.format("Hello, %s. Lovely to see you.", name);
        return greetingAGuest;
    }

    public String guestGreeting(String name, String dayPeriod) {
        String greetingAGuest = String.format("good %s, %s. Lovely to see you.", dayPeriod ,name);
        return greetingAGuest;
    }
    
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat hour = new SimpleDateFormat("HH");
        int hours = Integer.parseInt(hour.format(date));
        if (hours > 4 && hours < 11){
            return "good morning. Lovely to see you.";
        } else if (hours > 11 && hours < 16){
            return "good afternoon. Lovely to see you.";
        } else {
            return "good evening. Lovely to see you.";
        }
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date + " .";
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally.";
        } else if (conversation.indexOf("gaga") > -1){
            String a = "abracadabra";
            return a.toUpperCase();
        }    else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

