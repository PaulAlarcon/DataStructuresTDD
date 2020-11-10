import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void stackEmptyAfterCreation() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void stackNonEmptyAfterPush() {
        Stack stack = new Stack();
        stack.push(10);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void stackEmptyAfterPushAndPop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void stackNonEmptyAfterTwoPushesAndOnePop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void stackEmptyAfterTwoPushesAndTwoPops() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }


    @Test
    public void stackPushAndPopSameElement() {
        Stack stack = new Stack();
        int target = 10;
        stack.push(target);
        Assert.assertEquals(target, stack.pop());
    }

    @Test
    public void stackPushTwiceAndPopLastPushedElement() {
        Stack stack = new Stack();
        stack.push(0);
        int target = 1;
        stack.push(target);
        Assert.assertEquals(target, stack.pop());
    }

    @Test
    public void stackPushTwicePopTwiceGetsFirstPushedElement() {
        Stack stack = new Stack();
        int target = 1;
        stack.push(target);
        stack.push(0);
        stack.pop();
        Assert.assertEquals(target, stack.pop());
    }

    @Test
    public void stackPushThricePopTwiceGetsSecondPushedElement() {
        Stack stack = new Stack();
        //first push
        stack.push(-1);
        //second push
        int target = 1;
        stack.push(target);
        //third push
        stack.push(0);
        //first pop
        stack.pop();
        //second pop
        Assert.assertEquals(target, stack.pop());
        //add a structure instead of saving the elements in individual variables
    }

    @Test
    public void stackPushFourTimesPopThriceGetsSecondPushedElement() {
        Stack stack = new Stack();
        //first push
        stack.push(3);
        //second push
        int target = 1;
        stack.push(target);
        //third push
        stack.push(5);
        //fourth push
        stack.push(0);
        //first pop
        stack.pop();
        //second pop
        stack.pop();
        //third pop
        Assert.assertEquals(target, stack.pop());
        //add an array to keep track of all the pushed elements
    }

    @Test
    public void stackHoldsThousandsElements() {
        Stack stack = new Stack();
        for(int i = 0; i < 1000; ++i)
            stack.push(0);
        Assert.assertEquals(1000, stack.size);
    }

    @Test
    public void stackHoldsMaxCapacity(){
        Stack stack = new Stack();
        for (int i = 0; i < Stack.MAX_CAPACITY; ++i)
            stack.push(0);
        Assert.assertEquals(stack.size, Stack.MAX_CAPACITY);
    }

    @Test
    public void stackContainsMethod(){
        Stack stack = new Stack();
        stack.push(10);
        Assert.assertTrue(stack.contains(10));
    }

    @Test
    public void stackPeekMethod(){
        Stack stack = new Stack();
        stack.push(10);
        Assert.assertEquals(10, stack.peek());
    }




}
