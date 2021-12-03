package edu.pnu.collection;

import java.util.Arrays;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

     public void setStudent(Object Student){
         data[size] = Student;
         size += 1;
     }
//     public void setSize(int cnt){
//         this.size = cnt;
//     }
    public Object getData(Object obj){
         for(int i = 0; i < size; i++){              // data 저장된 게 genericList 안에 있으니깐
             if(data[i].equals(obj))
                 return data[i];
         }
         return null;
     }
     public int getSize(){return size;}
     public void setData(int limit){
        data = new Object[DEFAULT_SIZE];
     }
     public void setDataNull(){
         for(int i = 0; i < size; i++){
             data[i] = null;
         }
         size = 0;
     }


    @Override
    public String toString() {
         String result = "";
        for(int i = 0; i < size; i++){
            result += "\t"+ data[i].toString() + "\n";
        }
//        result += "\n";
        return result;
    }
}
