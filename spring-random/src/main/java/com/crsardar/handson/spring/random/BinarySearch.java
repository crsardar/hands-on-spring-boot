package com.crsardar.handson.spring.random;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch
{
//    @Autowired
    private SortingAlgo sortingAlgo;

    public BinarySearch(SortingAlgo sortingAlgo)
    {
        this.sortingAlgo = sortingAlgo;
    }

    public int search(int[] arr, int number)
    {
        System.out.println("Sorting algo used = " + sortingAlgo);
        return 3;
    }
}
