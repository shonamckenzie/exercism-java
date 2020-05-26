class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
//        convert provided number to string to allow loop through
        String numberToCheckString = Integer.toString(numberToCheck);
//        initialise sum and set to 0
        int sum = 0;
//        loop through each number and pass number and length of string in pow method, then add to sum
        for (int i = 0; i < numberToCheckString.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numberToCheckString.charAt(i)), numberToCheckString.length());
        }
// return true if sum = number passed in
        return sum == numberToCheck;
    }
}
