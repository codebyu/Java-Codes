import java.util.*;
public class SchedulePlanner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Schedule Planner . Let's Create or Check your schedule");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Add The Schedule");
        System.out.println("Enter the Plan");
            String Plan = sc.nextLine();
            System.out.println("Starting Date-Time ");
            String Time = sc.nextLine();
            System.out.println("DeadLine for this plan");
            String DeadLine = sc.nextLine();
            System.out.println("Bingo !! ");
                System.out.println("You have successfully planned. Here is the details");
                System.out.println("Plan :"+Plan);
                System.out.println("Date-Time :"+Time);
                System.out.println("DeadLine :"+DeadLine);
                
        System.out.println("Choose The Service by providing the respective number");
        
        System.out.println("1.Display My Planner ");
        System.out.println("2.Display the plan many times");
        int statement = sc.nextInt();
        
        switch (statement) {
             
            
            case 1: System.out.println("Hey !! Here's is your Scheduled Plan");
            System.out.println("Plan :"+Plan);
            System.out.println("Date-Time :"+Time);
            System.out.println("DeadLine :"+DeadLine);

            break;
            case 2: 
            System.out.println("How much do you want your plan to display in front of you  ");
        int display = sc.nextInt();
        for(int i = 1; i<=display; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(Plan +"  ");}}
            default:
             System.out.println("Invalid Action");
                break;
        }
        System.out.println("Thank You !!!!!!!!");
        
            }
        }
    
    

