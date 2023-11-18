import java.util.Scanner;


public class GrossPayCalculator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the name of the Employee: ");  
    String name = input.nextLine(); 
    System.out.print("Press F for full Time or P for Part Time :");
    String letter = input.nextLine();
    
    
    if( letter.equals("f")){
        System.out.println("- - - Full Time Employee - - -");
        System.out.print("Enter Basic pay: ");
        double pay = input.nextDouble();
        System.out.println("________________________________");
        System.out.print("Employee Name : "+name);
        System.out.println("");
        System.out.println("Basic pay :     "+pay);
        System.out.println("________________________________");
        System.out.println("Gross Pay :     "+pay);
    }
    else if(letter.equals("F")){
        System.out.println("- - - Full Time Employee - - -");
        System.out.print("Enter Basic pay: ");
        double pay = input.nextDouble();
        System.out.println("________________________________");
        System.out.print("Employee Name : "+name);
        System.out.println("");
        System.out.println("Basic pay :     "+pay);
        System.out.println("________________________________");
        System.out.println("Gross Pay :     "+pay);
    }
    else if(letter.equals("p")){
        System.out.println("- - - Part Time Employee - - -");
        System.out.print("Enter rate per hour :  ");
        int hour = input.nextInt();
        System.out.print("Enter no. of hours worked : ");
        int work = input.nextInt();
        System.out.print("Enter no. of overtime : ");
        int over = input.nextInt();
        System.out.println("________________________________");
        System.out.println("Employee Name : "+name);
        
        double basic = hour * work;
        double overpay = over*(hour * 1.25);
        
        System.out.println("Basic Pay :     "+basic);
        System.out.println("Overtime Pay :  "+overpay);
        System.out.println("________________________________");
        double total = basic + overpay;
        System.out.println("Gross Pay :     "+ total);
        
    
}
    else if(letter.equals("P")){
        System.out.println("- - - Part Time Employee - - -");
        System.out.print("Enter rate per hour :  ");
        int hour = input.nextInt();
        System.out.print("Enter no. of hours worked : ");
        int work = input.nextInt();
        System.out.print("Enter no. of overtime : ");
        int over = input.nextInt();
        System.out.println("________________________________");
        System.out.println("Employee Name : "+name);
        
        double basic = hour * work;
        double overpay = over*(hour * 1.25);
        
        System.out.println("Basic Pay :     "+basic);
        System.out.println("Overtime Pay :  "+overpay);
        System.out.println("________________________________");
        double total = basic + overpay;
        System.out.println("Gross Pay :     "+ total);           
} 
    else{
        System.out.println("ERROR!! INPUT!! PLS. RUN AGAIN :<");
}
}
}