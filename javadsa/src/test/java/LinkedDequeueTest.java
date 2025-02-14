import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.digiteched.javadsa.LinkedDequeue;
import com.digiteched.javadsa.exceptions.FailedToDequeueFromEmptyQueueException;
import com.digiteched.javadsa.interfaces.IDequeue;
import com.digiteched.javadsa.interfaces.IQueue;

public class LinkedDequeueTest {
    @Test
    public void itShouldCreateAnEmptyQueue() {
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();

        assertEquals(0, dequeue.size());
    }

    @Test
    public void itShouldAddFirstItem() {
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();
        dequeue.addFirst(0);
        assertEquals(1, dequeue.size());
        assertEquals(0, dequeue.getFirst().intValue());

    }

    @Test
    public void itShouldAddLastItem() {
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();
        dequeue.addLast(0);
        assertEquals(1, dequeue.size());
        assertEquals(0, dequeue.getLast().intValue());
    }

    @Test
    public void itShouldPopTilEmpty() {
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();
        int numberOfItems = 10;
        for(int i = 0; i < numberOfItems; i++){
            assertEquals(2*i, dequeue.size());
            dequeue.addFirst(i);
            dequeue.addLast(i);
            
        }

        for(int i = numberOfItems; i > 0; i--){
            assertEquals(i-1, dequeue.removeFirst().intValue());
            assertEquals(i-1, dequeue.removeLast().intValue());
            
        }
    }

    @Test
    public void itShouldThrowWhenRemovingFromEmptyQueue() {
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();
         assertThrows(FailedToDequeueFromEmptyQueueException.class, () -> {
            dequeue.removeFirst();
        });
        assertThrows(FailedToDequeueFromEmptyQueueException.class, () -> {
            dequeue.removeLast();
        });
    }

    @Test
    public void itShouldRemoveTheLastItem(){
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();
        int numberOfItems = 10;

        for(int i = 0; i < numberOfItems; i++){
            assertEquals(i, dequeue.size());
            dequeue.addFirst(i);
            
        }

        for(int i = 0; i < numberOfItems; i++){
            assertEquals(i, dequeue.removeLast().intValue());
           
        }
    }

    @Test
    public void itShouldRemoveTheFirstItem(){
        IDequeue<Integer> dequeue = new LinkedDequeue<Integer>();
        int numberOfItems = 10;

        for(int i = 0; i < numberOfItems; i++){
            assertEquals(i, dequeue.size());
            dequeue.addFirst(i);
            
        }

        for(int i = 0; i < numberOfItems; i++){
            assertEquals(numberOfItems - i-1, dequeue.removeFirst().intValue());
            
        }
        
    }
}
