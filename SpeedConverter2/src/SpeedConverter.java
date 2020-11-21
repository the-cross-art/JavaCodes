public class SpeedConverter {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer){
            if(temperature>=25 && temperature<=45){
                return true;
            }
            else {
                return false;
            }
        }else{
            if(temperature>=25 && temperature<=35){
                return true;
            }else {
                return false;
            }
        }
    }
}


//public class SpeedConverter {
//    public SpeedConverter() {
//    }
//
//    public static long toMilesPerHour(double kilometersPerHour) {
//        return kilometersPerHour < 0.0D ? -1L : Math.round(kilometersPerHour / 1.609D);
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//        if (kilometersPerHour < 0.0D) {
//            System.out.println("Invalid Value");
//        } else {
//            long milesPerHour = toMilesPerHour(kilometersPerHour);
//            System.out.println(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
//        }
//
//    }
//}