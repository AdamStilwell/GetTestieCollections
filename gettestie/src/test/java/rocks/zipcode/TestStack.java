package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void hashMapTest(){
        HashMap<String, Integer> map = new HashMap<>();
        int expected = 2000;
        Person p = new Person("Mr. Fitz", expected);
        map.put(p.getName(), p.getYearOfBirth());

        int actual = map.get("Mr. Fitz");

        Assert.assertEquals(expected, actual);
    }
    // Make a bigger test exercising more Stack methods.....
    @Test
    public void stackPopTest(){
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);
        String actual = stack.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stackPeekTest(){
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);
        String actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashSetTest(){
        //test to see if the hash will add the same value more than once (it won't)
        Set<String> hash = new HashSet();
        String s = "Hello world";
        for(int i = 0; i< 4; i++) {
            hash.add(s);
        }
        int expected = 1;
        int actual = hash.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayListTest(){
        ArrayList<String> arrayList = new ArrayList<>();
        String s = "Hello";
        String s2 = "World";
        for(int i = 0; i< 10; i++){
            if(i % 2 == 0){
                arrayList.add(s);
            }else{
                arrayList.add(s2);
            }
        }
        //removes every instance of s in the arraylist
        arrayList.removeAll(Collections.singleton(s));

        int expected = 5;
        int actual = arrayList.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void linkedListTest(){
        Queue<String> queue = new LinkedList<>();
        String first = "Hello";
        String second = "World";
        queue.add(first);
        queue.add(second);

        String[] expected = {"Hello", "World"};
        String[] actual = new String[2];
        for(int i = 0; i< expected.length; i++){
            actual[i] = queue.remove();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTest2(){
        Queue<String> queue = new LinkedList<>();
        String first = "Hello";
        String second = "World";
        queue.add(first);
        queue.add(second);

        String[] expected = {"World", "Hello"};
        String[] actual = new String[2];
        for(int i = 0; i< expected.length; i++){
            actual[i] = queue.remove();
        }

        Assert.assertFalse(expected.toString().equals(actual.toString()));
    }

    @Test
    public void arrayDequeueTest(){
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i< 10; i++){
            deque.add(i);
        }
        int expected = 0;
        int actual = deque.getFirst();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDequeueTest2(){
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i< 10; i++){
            deque.add(i);
        }
        int expected = 9;
        int actual = deque.getLast();

        Assert.assertEquals(expected, actual);
    }

    // Vector,
    // TreeMap,
    // TreeSet,
    // Iterator,
    // PriorityQueue
    // Comparable
}
