package Ex4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Animal cat = new Animal();
        System.out.println("Before: \n" + cat);
        Class<Animal> classAnimal = Animal.class;
        Field[] fields =  classAnimal.getDeclaredFields();
        for (Field field : fields) {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            if (field.getName().equals("name")){
                field.set(cat, "newName");
            } else if (field.getName().equals("age")){
                field.set(cat, 10);
            } else if (field.getName().equals("sex")){
                field.set(cat, "female");
            } else {
                System.out.println("New field detected in the class: " + field.getName() + "; " + field.getType());
            }
            field.setAccessible(isAccessible);
        }
        System.out.println("After \n" + cat);
    }
}
