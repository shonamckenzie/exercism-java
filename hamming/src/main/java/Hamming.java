import java.util.stream.IntStream;

public class Hamming {
    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if (leftStrand.length() != rightStrand.length()){

            if(leftStrand.isEmpty()){
                throw new IllegalArgumentException("left strand must not be empty.");
            }

            if(rightStrand.isEmpty()){
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
//        if (leftStrand.equals(rightStrand)){
//            return 0;
//        } else {
//            return (int) IntStream.range(0, leftStrand.length())
//                    .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
//                    .count();
//        }
        return IntStream.range(0, leftStrand.length())
                .map(i -> leftStrand.charAt(i) != rightStrand.charAt(i) ? 1 : 0)
                .sum();
    }
}
