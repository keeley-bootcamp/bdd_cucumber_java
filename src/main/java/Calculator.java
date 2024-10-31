import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    private final Deque<Number> stack = new LinkedList<>();
    private static final List<String> OPERATORS = List.of("+", "-", "*");

    public void push(Object arg) {
        if (OPERATORS.contains(arg)) {
            Number y = stack.removeLast();
            Number x = stack.removeLast();
            Double answer = null;

            if (arg.equals("+")) {
                answer = x.doubleValue() + y.doubleValue();
            }
            else if (arg.equals("-")) {
                answer = y.doubleValue() - x.doubleValue();
            }
            else if (arg.equals("*")) {
                answer = x.doubleValue() * y.doubleValue();
            }
            stack.add(answer);
        }
        else {
            try {
                double num = Double.parseDouble(arg.toString());
                stack.add(num);
            }
            catch (Exception e) {
                throw new IllegalArgumentException("Invalid input: " + arg);
            }
        }
    }

    public Number value() {
        return stack.getLast();
    }
}

