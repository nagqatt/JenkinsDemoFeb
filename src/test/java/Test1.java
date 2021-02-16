import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    @Test
    public void test1(){
        System.out.println("Running test 1");
        Assert.fail();
    }
    public void test2(){
        System.out.println("Running test 2");
        System.out.println("Added new code");

    }
    public void test3(){
        System.out.println("Running test 3");
    }
    public void test4(){
        System.out.println("Running test 4");
    }
    public void test5(){
        System.out.println("Running test 5");
    }
}
