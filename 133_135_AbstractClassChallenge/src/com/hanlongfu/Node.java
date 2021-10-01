package com.hanlongfu;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    void setNext(ListItem item) {
       this.rightLink = item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    void setPrevious(ListItem item) {
        this.leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            //String class has its built-in compareTo method
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
