package app.design_patterns.iterator_pattern;

public class NameRepository implements Container {

    public String names[] = {"Omar" , "Kapten Maged" ,"Tom" , "Gery"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
