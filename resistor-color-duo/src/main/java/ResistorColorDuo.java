import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    private String[] colorsArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    private  List<Object> colorsList = Arrays.asList(colorsArray);

    int value(String[] colors) {
//      int result = 0;
//      for (int i = 0; i < colorsArray.length; i++){
//          if (colorsArray[i].equals(colors[0]))result += 10 * i;
//          if (colorsArray[i].equals(colors[1]))result += i;
//      }
//        return result;

        int firstColor = 0;
        int secondColor = 0;
        firstColor = colorsList.indexOf(colors[0]);
        secondColor = colorsList.indexOf(colors[1]);

        return Integer.parseInt(firstColor + "" + secondColor);
    }
}
