package org.nisanth.implementation;

public class DynamicArray {

    int initialCapacity=16;
        int arr[];
        int capacity;
        int size;

        DynamicArray()
        {
            size=0;
            arr=new int[initialCapacity];
            capacity=initialCapacity;

        }

        public void add(int val)
        {
            if(size==capacity)
            {
                expandArray();
            }
            arr[size++]=val;
        }

     private void   expandArray()
     {
         capacity*=capacity;
         // expand the array with new capacity
         arr=java.util.Arrays.copyOf(arr,capacity);
     }

     public void display()
     {
         System.out.println("Element in the List:");
         for(int i=0;i<size;i++)
         {
             System.out.print(arr[i]+" ");
         }
     }


     public void addAtSpecifiedPosition(int pos,int val)
     {
         if(size==capacity)
         {
             expandArray();
         // first shift the last element
         // last element = size-1
         for(int i=size-1;i>=pos;i--)
         {
             arr[i+1]=arr[i];

         }
             arr[pos]=val;
             size++;

     }
     }

     public void deleteAtPosition(int pos)
     {
         for(int i=pos+1;i<size;i++)
         {
             arr[i-1]=arr[i];

         }
         size--;
     }

}
