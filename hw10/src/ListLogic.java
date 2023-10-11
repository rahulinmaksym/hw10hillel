
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListLogic {

    public void findOccurance(List<String> strings, String aim) {
        int result = 0;
        if(strings.contains(aim)) {
            for (String str : strings) {
                if(Objects.equals(str, aim)) result++;
            }
        }
        System.out.println("String \"" + aim + "\" occurs " + result + " times.");
    }

    public List<Line> findOccurance(List<String> strings) {
        List<Line> lineList = new ArrayList<>();
        List<String> used = new ArrayList<>();
        for(String str : strings) {
            if(!used.contains(str)) {
                int result = 0;
                for (String strInside : strings) {
                    if(Objects.equals(str, strInside)) result++;
                }
                if(result > 1) {
                    lineList.add(new Line(str, result));
                    used.add(str);
                }
            }
        }
        return lineList;
    }

    public <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public List<Double> findUnique(List<Double> numberList) {
        List<Double> result = new ArrayList<>();
        for(Double number : numberList) {
            int occuranceCount = 0;
            for(Double numberInside : numberList) {
                if(Objects.equals(number, numberInside)) occuranceCount++;
            }
            if(occuranceCount == 1) result.add(number);
        }
        return result;
    }

    public void calcOccurance(List<String> strings) {
        List<String> used = new ArrayList<>();
        for(String str : strings) {
            if(!used.contains(str)) {
                int result = 0;
                for (String strInside : strings) {
                    if(Objects.equals(str, strInside)) result++;
                }
                if(result > 1) {
                    System.out.println(str + ": " + result);
                    used.add(str);
                }
            }
        }
    }

}
