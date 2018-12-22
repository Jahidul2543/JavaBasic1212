package enumdemo;

public class UseEnum {
    public static void main(String[] args) {
        
        Day day = Day.FRIDAY;
        
        String environment = null;
        
        switch (day){
            case MONDAY: environment = "Is a sad";
            break;
            case TUESDAY: environment= "Busy";
            break;
            case WEDNESDAY: environment = "Waiting for weekend";
            break;
            case THURSDAY: environment = "Work from home, happy day";
            break;
            case FRIDAY: environment = "prepare for weekend";
            break;
        }
        System.out.println(environment);
        
    }
}
