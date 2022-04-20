public class Addition {
    /**
     * the methods calculates the sum of 2 integers
     * @return this returns the addition of 2 integers
     */
    public int sum(){
        int num1 = 600;//num1 is assigned to 10
        int num2 = 20000;//num2 is assigned to 20
        return num1 + num2;
    }

    public static void main(String[] args) {
        Addition assignment= new Addition();
        int result =assignment.sum();
        System.out.println("Addition ="+result);//output of result
    }
}


