package TT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> andudaa= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> bertho=new ArrayList<>();
        bertho=andudaa.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
        for(int i:bertho){
            System.out.println(i);
        }
    }
}
