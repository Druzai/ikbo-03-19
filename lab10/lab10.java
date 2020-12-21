package ru.mirea.lab10;

import java.util.Arrays;
import java.util.List;

class Generic1 {
    static <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }
}

class AnyArray<T>{
    private T[] data;
    private int currentSize;

    public AnyArray(int size){
        try {
            if (size < 0)
                throw new IndexOutOfBoundsException();
            data = (T[]) new Object[size];
            currentSize = 0;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong size!");
        }
    }

    public void add(T item) {
        try {
            data[currentSize++] = item;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("End of array!");
        }
    }

    public Object getById(int id){
        try {
            if (id > currentSize)
                throw new IndexOutOfBoundsException();
            return data[id];
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong id!");
        }
        return null;
    }

    @Override
    public String toString() {
        return "AnyArray{" +
                "data=" + Arrays.toString(data) +
                ", currentSize=" + currentSize +
                '}';
    }
}

public class lab10 {
    public static void main(String[] args){
        Object[] objectArray = {0, 0.5, "String", Boolean.FALSE};
        String[] stringArray = {"It's", "a", "string"};
        Integer[] intArray = {554, 771, 472575, 0, -225};

        System.out.println("Object: " + Generic1.convertToList(objectArray));
        System.out.println("String: " + Generic1.convertToList(stringArray));
        System.out.println("Integer: " + Generic1.convertToList(intArray));

        AnyArray<Integer> n_int = new AnyArray<>(3);
        n_int.add(3);
        n_int.add(2);
        n_int.add(1);
        System.out.println(n_int);

        AnyArray<String> str = new AnyArray<>(3);
        str.add("zero");
        str.add("one");
        str.add("two");
        System.out.println(str);
        System.out.println(str.getById(10));
    }
}
