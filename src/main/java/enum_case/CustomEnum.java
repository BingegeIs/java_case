package enum_case;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public enum CustomEnum {
    FIRST(1),
    SECOND(2),
    THIRD(3);

    private int index;

    CustomEnum(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        analysTest(CustomEnum.class);
    }

    private static void analysTest(Class<CustomEnum> customEnumClass) {
        System.out.println("------Interfaces:");
        for (Type type : customEnumClass.getGenericInterfaces()) {
            System.out.println(type.getTypeName());
        }
        System.out.println("------Super Class:");
        System.out.println(customEnumClass.getSuperclass().getName());
        System.out.println("------Declared Methods");
        for (Method method : customEnumClass.getDeclaredMethods()) {
            System.out.print(method.getName() + " ");
        }
        System.out.println();
        System.out.println("------Methods");
        for (Method method : customEnumClass.getMethods()) {
            System.out.print(method.getName() + " ");
        }
    }

    private static void test3() {
        System.out.println(Enum.valueOf(CustomEnum.class, "THIRD"));
    }

    private static void test2() {
        System.out.println(CustomEnum.FIRST.equals(CustomEnum.SECOND)
        );
        System.out.println(CustomEnum.FIRST.compareTo(CustomEnum.SECOND)
        );
        System.out.println(CustomEnum.FIRST == CustomEnum.SECOND
        );
        System.out.println(CustomEnum.FIRST.getDeclaringClass());
        System.out.println(CustomEnum.FIRST.ordinal());
        System.out.println(CustomEnum.SECOND.ordinal());
        System.out.println(CustomEnum.THIRD.ordinal());
        System.out.println(CustomEnum.FIRST.name());
    }

    private static void test1() {
        for (CustomEnum customEnum : CustomEnum.values()) {
            System.out.println(customEnum);
        }
    }
}
