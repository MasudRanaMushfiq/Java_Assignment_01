package Lab_Work_1;


import java.util.*; // class having access to Date class methods

    public class Templet
    {
        public static void main(String[] args)
        {
            Random random = new Random();

            // Pseudo Number Will generate between 10.             
            System.out.println(random.nextInt(10));
            System.out.println(random.nextBoolean());
            System.out.println(random.nextDouble());
            System.out.println(random.nextFloat());
            System.out.println("Gaussian: " + random.nextGaussian());

            System.out.println(random.nextLong());
            System.out.println(random.nextInt());


            Date mydate = new Date();

            // Displaying the current date and time
            System.out.println("System date : "+ mydate.toString() );

            // Is used to set time by milliseconds. Adds 15680
            // milliseconds to January 1, 1970 to get new time.
            mydate.setTime(15680876);

            System.out.println("Time after setting: " + mydate.toString());

            int d = mydate.hashCode();
            System.out.println("Amount (in ms) by which time" +
                    " is shifted : " + d);

        }


}
