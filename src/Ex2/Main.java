package Ex2;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class: ");
        String className = scanner.nextLine();
        System.out.println("Choose prefix: 1 - java.lang; 2 - java.util: ");
        String prefix = scanner.nextLine();
        if (prefix.equals("1")) {
            className = "java.lang." + className;
        } else if (prefix.equals("2")){
            className = "java.util." + className;
        } else {
            System.out.println("Wrong choice");
            return;
        }
        printClassInfo(className);
    }

    public static void printClassInfo(String className) throws ClassNotFoundException {
        Class<?> classInfo = Class.forName(className);
        System.out.println(classInfo);
        System.out.println("Class modifier: \n" + Modifier.toString(classInfo.getModifiers()));
        System.out.println("Class interface: \n" + Arrays.toString(classInfo.getInterfaces()));
        System.out.println("Class super: \n" + classInfo.getSuperclass().toString());
        System.out.println("Class fields: ");
        Arrays.stream(classInfo.getFields()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Class declared fields: ");
        Arrays.stream(classInfo.getDeclaredFields()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Class constructor: ");
        Arrays.stream(classInfo.getConstructors()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Class methods: ");
        Arrays.stream(classInfo.getMethods()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Class annotations: ");
        Arrays.stream(classInfo.getAnnotations()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
