package com.hanlongfu;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // the list is empty, so this item becomes the head
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            // newItem is greater than current item, move right if possible
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem);
                    // if not set to previous, it would default to null
                    newItem.setPrevious(currentItem);
                    return true;
                }
                //newItem is less than currentItem, insert before currentItem
            } else if(comparison > 0){
                if(currentItem.previous() != null){
                    //insert the newItem before current Item and after previous item
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    // the node without a previous is the root
                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;   //newItem is the head (newItem root)
                }
                return true;
                //newItem and currenItem are equal, no need to add
            } else{
                System.out.println(newItem.getValue() + " is already present. not added.");
                return false;
            }
        }
        //don't forget to return something...
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            //compare root to the item passed in
            int comparison = currentItem.compareTo(item);
            //we found the item to delete if comparison == 0
            if(comparison == 0){
                //there is no entry before currenItem
                if(currentItem == this.root){
                    this.root = currentItem.next();
                    //there is an entry before currentItem
                } else {
                    //point the previous item to the item after current item after removing currentItem
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0){
                currentItem = currentItem.next();
            } else { //comparison > 0
                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        return true;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        } else {
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

        //rewrite this function using recursion
//        if(root != null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }

    }




}
