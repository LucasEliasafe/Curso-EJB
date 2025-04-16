import javax.ejb.*;

@Stateless
public class InterfaceRemoteCalculator implements CalculatorRemote {
    public int add(int x, int y) {
        return x + y;
    }
    public int subtract(int x, int y) {
        return x - y;
    }
}
