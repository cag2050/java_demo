package stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// https://blog.csdn.net/zhangzehai2234/article/details/104913116
public class Collectors_joining {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("d");
        stringList.add("k");
        System.out.println(String.join(",", stringList));

        List<Object> objectList = new ArrayList<>();
        objectList.add(1L);
        objectList.add(10);
        objectList.add("很方便");
        System.out.println(objectList.stream().map(Objects::toString).collect(Collectors.joining()));
        System.out.println(objectList.stream().map(Objects::toString).collect(Collectors.joining(",")));
        System.out.println(objectList.stream().map(Objects::toString).collect(Collectors.joining("-")));
        System.out.println(stringList.stream().map(Objects::toString).collect(Collectors.joining("-")));
    }
}
