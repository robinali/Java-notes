// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer peek;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
        this.peek = null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(this.peek == null && this.iterator.hasNext()) {
            this.peek = this.iterator.next();
        }
        return this.peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int tmp = peek();
        if(iterator.hasNext()) {
            this.peek = this.iterator.next();
        } else {
            this.peek = null;
        }
        return tmp;
	}

	@Override
	public boolean hasNext() {
	    return this.peek != null || this.iterator.hasNext();
	}
}