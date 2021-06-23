import java.util.List;
import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();

        input.add(new Interval(1, 4));
        input.add(new Interval(6, 9));
        input.add(new Interval(2, 5));

        List<Interval> output = mergeInterval(input);

        for(Interval result : output) {
            System.out.println(result.start + " " + result.end);
        }
    }

    static List<Interval> mergeInterval(List<Interval> intervals){
        if(intervals.size() < 2){
            return intervals;
        }

        List<Interval> output = new ArrayList<>();

        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));

        Interval temp = intervals.get(0);
        int start = temp.start;
        int end = temp.end;

        for(int i = 1; i < intervals.size(); i++){
            temp = intervals.get(i);

            if(temp.start <= end){
                end = Math.max(end, temp.end);
            }
            else{
                output.add(new Interval(start, end));
                start = temp.start;
                end = temp.end;
            }
        }

        output.add(new Interval(start, end));
        return output;

    }
}

class Interval{

    int start,end;

    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}