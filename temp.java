import java.util.Scanner;

class temp {
    public static void main (String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.println("Would you like to convert \n 1. Celsius to Fahrenheit \n 2. Fahrenheit to Celsius");
        int tempNumber = temp.nextInt();

        double fahrenheit = (celsius/5*9)+32;
        double celcius = (fahrenheit-32)*5/9;

        switch(tempNumber) {
            case 1: System.out.println("Temperature in Celsius");
                celsius = temp.nextDouble();
                System.out.println(fahrenheit+"°F");
                break;

            case 2: System.out.Println("Temperature in Fahrenheit");
                fahrenheit = temp.nextDouble();
                System.out.println(celcius+"°C");
                break;

            default: System.out.Println("Please choose one");
        }



    }
}
