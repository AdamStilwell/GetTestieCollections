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
    @Test
    public void vectorTest(){
        //vectors lessen the load of increasing in size while adding elements
        Vector<Integer> vector = new Vector<>();

        vector.ensureCapacity(100);
        for(int i =0; i<100; i++){
            vector.add(10);
        }
        int expected = 100;
        int actual = vector.capacity();

        Assert.assertEquals(expected,actual);
    }
    // TreeMap,
    @Test
    public void treeMapTest(){
        TreeMap<String, Integer> map = new TreeMap<>();
        Person p = new Person("Henry Fish", 1930);

        map.put(p.getName(), p.getYearOfBirth());
        Integer expected = 1930;
        Integer actual = map.get("Henry Fish");

        Assert.assertEquals(expected, actual);

    }
    // TreeSet,
    @Test
    public void treeSetTest(){
        //tree sets order the objects added to it by a comparator
        TreeSet<Integer> map = new TreeSet<>();
        Person p = new Person("Henry Fish", 1930);

        map.add(10);
        map.add(5);
        map.add(15);

        Integer expected = 5;
        Integer actual = map.first();

        Assert.assertEquals(expected, actual);

    }
    // Iterator,
    @Test
    public void iteratorTest(){
        ArrayList<Integer> list = new ArrayList<>();
        Iterator iter = list.iterator();

        list.add(15);
        list.add(20);

        boolean actual = iter.hasNext();;

        Assert.assertTrue(actual);

    }
    // PriorityQueue
    @Test
    public void priorityQueueTest(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Person p = new Person("Henry Fish", 1930);

        priorityQueue.add(10);
        priorityQueue.add(11);
        priorityQueue.add(9);

        Integer expected = 9;
        Integer actual = priorityQueue.remove();

        Assert.assertEquals(expected, actual);

    }
    // Comparable
    @Test
    public void comparableTest(){
        Person p = new Person("Henry Fish",1930);
        Person p2 = new Person("Henry Fisk" ,1930);



        Integer expected = -1;
        Integer actual = p.compareTo(p2);

        Assert.assertEquals(expected, actual);

    }
}
