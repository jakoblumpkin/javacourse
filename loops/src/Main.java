public class Main {

    public static void main(String[] args) {
        // do while loop/ loop / while loop

        int number = 20, count = 1;

        while (number > 1) {
            count *= number;
            number--;
        }
        System.out.print(count);

        //do while

        int iVal = 150;

        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);


        //Array

        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        // float[] theVals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;

    /*for (int i = 0; i<theVals.length; i++) {
        sum += theVals[i];
    }*/

        //System.out.print(sum);


        //forEach

        for (float currentVal : theVals) {
            sum += currentVal;
        }

        System.out.print(sum);

    //switch only char or integer can be used

    int switchNumber = 25;

    switch(switchNumber % 2) {
        case 0:
            System.out.print("\n"+ switchNumber);
            System.out.print(" is even");
            break;
        case 1:
            System.out.print("\n"+ switchNumber);
            System.out.print(" is odd");
            break;
        default:
            System.out.print("\noops it broke");
            break;
    }
  }
}
