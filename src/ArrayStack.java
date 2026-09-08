import java.util.Arrays;

public class ArrayStack implements StackInterface{
    int size;
    Object[] array;
    int top;

    public ArrayStack(int size) {
        this.size = size;
        this.array = new Object[size];
        this.top = -1;
    }

    @Override
    public void clear() {
        array = new Object[size];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public Object peek() {
        if (isEmpty()){return null;}
        return array[top];
    }

    @Override
    public Object pop() {
        if (isEmpty()){return null;}
        Object valorEliminado = array[top];
        array[top] = null;
        top--;
        return valorEliminado;
    }

    @Override
    public boolean push(Object object) {
        if (top >= size-1){
            return false;
        }else {
            array[top+1] = object;
            top++;
            return true;
        }
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean search(Object object) {
        if (isEmpty()){return false;}
        for (int i = 0; i < top+1; i++) {
            if (array[i].equals(object)){return true;}
        }
        return false;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                ", top=" + top +
                '}';
    }
}