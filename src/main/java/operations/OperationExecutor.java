package operations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class OperationExecutor extends Thread{

    private static OperationExecutor instance;

    LinkedBlockingQueue<IOperation> pendingOperations;
    List<IOperation> allOperations;

    private OperationExecutor()
    {
        pendingOperations = new LinkedBlockingQueue<>();
        allOperations = new ArrayList<>();
    }

    @Override
    public void run() {
        while(true)
        {
            if(pendingOperations.peek() != null)
            {
                IOperation operation =  pendingOperations.poll();
                operation.execute();
            }
        }
    }

    public void addOperation(IOperation operation)
    {
        pendingOperations.add(operation);
        allOperations.add(operation);
    }

    public List<IOperation> getAllOperations()
    {
        return allOperations;
    }
}
