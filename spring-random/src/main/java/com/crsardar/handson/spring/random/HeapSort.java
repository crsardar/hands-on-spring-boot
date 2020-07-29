package com.crsardar.handson.spring.random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HeapSort implements SortingAlgo
{
    @Override
    public int[] sort(int[] numbers)
    {
        return numbers;
    }
}
