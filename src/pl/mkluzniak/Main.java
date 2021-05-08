package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // 2D arrays = an array of arrays

        String[][] cars = {{"Camaro", "Corvette", "Silverado"},
                {"Mustng", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}}; //set names for every car we need to put on array


        for (int i = 0; i < cars.length; i++) { //loop to display every data we input in string
            System.out.println();//blank is to move to next line to create column
            for (int j = 0; j < cars[i].length; j++) {//loop in loop to display column in array
                System.out.print(cars[i][j] + " ");//print on console array with space of every car
            }
        }


    }
}
