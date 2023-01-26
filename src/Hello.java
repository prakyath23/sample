public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Prakyath");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien");
        }
        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score");
        }
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
        if (topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if(!isCar) {
            System.out.println(" This is a error");
        }
            String makeOfString = "Volkswagen";
            boolean isDomestic = makeOfString == "Volkswagen" ? false : true;
            if(isDomestic){
                System.out.println("Volkswagen is Domestic");
            }

        int ageOfClient = 20;
            String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a Kid";
        System.out.println("Our client is" +ageText);
double inputOne = 20.00d;
double inputTwo = 80.00d;
double inputThree = (inputOne + inputTwo) * 100.00d;
double Remainder = inputThree % 40.00d;
boolean variable = Remainder == 0.0 ? true : false;
        System.out.println(variable);
        if(Remainder != 0.0){
            System.out.println("Got some remainder");
        }

    }

}
