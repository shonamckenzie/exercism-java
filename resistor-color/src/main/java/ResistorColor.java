import java.util.Arrays;

class ResistorColor {
    private String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
//        int index = -1;
//        for (int i=0; i < colors.length; i++){
//            if (colors[i].equals(color)){
//                index = i;
//            }
//        }return index;

//       Use the Arrays class to convert the colors array to a List<String> object. The List class has a method(.indexOf) which will return the index of the passed in object
        return Arrays.asList(colors).indexOf(color);
    }

    String[] colors() {
        return colors;
    }
}
