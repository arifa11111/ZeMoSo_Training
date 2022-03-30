package JavaAssignment;

public class RelationalOperators {
    public static void main(String args[]){
        int MyAge = 20;
        int SisterAge = 30;
        int BrotherAge = 24;
        String MyName = "Arifa";
        String MyFriendName = "Arifa";
        System.out.println("Sister is younger than me :"+ (MyAge>SisterAge));
        System.out.println("Brother is yonger than sister :"+ (SisterAge>BrotherAge));
        System.out.println("Is my name and my sister name are same : "+MyFriendName.equals(MyName));
        boolean obj = MyFriendName==MyName;
        System.out.println("Both referses the same object :"+obj);
    }
}
