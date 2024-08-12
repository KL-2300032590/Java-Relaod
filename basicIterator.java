package iterator;

import java.util.ArrayList;
import java.util.Iterator;

class basicIterator{
    private long Id;
    private String name;
    public basicIterator(long i,String n){
        this.Id=i;
        this.name=n;
    }
    public String toString(){
        return "Name : "+name+" Id : "+Id;
    }
    public static void main(String[] args){
        ArrayList<basicIterator> a = new ArrayList<>();
        a.add(new basicIterator(103,"pardhu"));
        a.add(new basicIterator(104,"arun"));
        a.add(new basicIterator(105,"pannu"));
        Iterator<basicIterator> i =a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}