public class Test {
    public static int indexOf(String source, char target) {
        if (source == null) {
            return -1;
        }
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                return i;
            }
        }
        return -1;
        // return source.indexOf(target);
    }

    public static int indexOf2(String source, char target) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                return i;
            }
        }
        throw new StringIndexOutOfBoundsException();
        // return source.indexOf(target);
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf2("abc", 'a'));
            System.out.println(indexOf2("abc", 'b'));
            System.out.println(indexOf2("abc", 'c'));
            System.out.println(indexOf2("abc", 'd'));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Character not found");
        }
    }
}
