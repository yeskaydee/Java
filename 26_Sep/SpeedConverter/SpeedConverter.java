public class SpeedConverter {
    public static void main(String[] args){
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);
        toMilesPerHour(0);


        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
        printConversion(0);

        double a=0;
        double b=1.609;
        double c;
        c=a/b;
        System.out.println(c);


    }
    public static long toMilesPerHour(double kilometeresPerHour){
        long milerPerHour;
        if (kilometeresPerHour>=0){
            milerPerHour= (long)(kilometeresPerHour/1.609);
            System.out.println (milerPerHour);
        }else  (kilometeresPerHour<0) {
            return -1;
        }
    }

    public static void printConversion(double kilometeresPerHour){
        long milesPerHour;
        milesPerHour= Math.round(kilometeresPerHour/1.609);
        if(kilometeresPerHour>=0) {
            System.out.println(kilometeresPerHour + " km/h = " + milesPerHour + " mi/h");
        }else if (kilometeresPerHour <0) {
            System.out.println("Invalid Value");
        }
    }


}
