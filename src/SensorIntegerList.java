public class SensorIntegerList {
    private SensorMethods[] elements;
    private int dim;

    public SensorIntegerList(int size) {
        elements = new SensorMethods[size];
    }

    public boolean isEmpty() {
        return dim == 0;
    }

    public void add(SensorMethods element) {
        if (dim >= elements.length) throw new ArrayIndexOutOfBoundsException();
        elements[dim++] = element;
    }

    public int contains(Sensor element) {
        for (int i = 0; i < dim; i++) {
            if (elements[i] == element) return i;
        }
        return -1;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= dim) return false;
        System.arraycopy(elements, index + 1, elements, index, dim - 1 - index); //copialo en bloque hasta index
        dim--;
        return true;
    }

    public SensorMethods[] getElements() {
        return elements;
    }

}