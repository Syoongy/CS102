// extends Exception -> checked exception
// extends RuntimeException -> unchecked exception
class ExceptionA extends Exception {
    public ExceptionA(String s) {
        super(s);
    }

    public ExceptionA(Throwable e) {
        super(e);
    }
}

class Example2 {

    public static void doX() throws ExceptionA {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            // throw new ExceptionA("error");
            throw new ExceptionA(e);
        }
    }

    public static void main(String[] args) throws ExceptionA {
        doX();
    }
}
