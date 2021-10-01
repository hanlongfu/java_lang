package com.hanlongfu;

public abstract class ListItem {
    //two variables + one object
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    //constructor
    public ListItem(Object value) {
        this.value = value;
    }

    //abstract methods
    abstract ListItem next();
    abstract void setNext(ListItem item);
    abstract ListItem previous();
    abstract void setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    //setter and getter
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }




}
