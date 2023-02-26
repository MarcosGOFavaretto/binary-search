# Binary Search in Java.

Binary search is a way to find a specific value at a set of ordenated values without the need of iterate over every term. Here, we arre going to understand a little bit more about it and also try to use that.

## Definition.


## Example of use.


## Using Java's binary search.

## TODO: Add on doc.

1. Differences beetween the following binary search's methods:
- [Recursive](https://www.geeksforgeeks.org/binary-search/#:~:text=Recursive%20implementation%20of,Javascript)
- [Iterative 1](https://www.geeksforgeeks.org/binary-search/#:~:text=Another%20Iterative%20Approach%20to%20Binary%20Search)
- [Iterative 2](https://www.geeksforgeeks.org/binary-search/#:~:text=Iterative%20implementation%20of%20Binary%20Search%C2%A0)

1.1. Add both recursive and iterative ways for binary searches.

2. When we could use.

3. When we could not use.

4. Advantages and disvantages.

5. Make an association with dictionaries.

6. [Performance impacts of Recursive and Interation binary searches.](https://www.baeldung.com/java-binary-search#5-performance)

7. Methods from Java libraries([Arrays](https://www.baeldung.com/java-binary-search#3-using-arraysbinarysearch) and [Collections](https://www.baeldung.com/java-binary-search#4-using-collectionsbinarysearch)).
- [It can help](https://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/#:~:text=As%20above%20we%20already%20have%20discussed%20that%20we%20can%20operate%20this%20algorithm%20either%20Arrays.binarysearch()%20vs%20Collections.binarysearch().%20Arrays.binarysearch()%20works%20for%20arrays%20which%20can%20be%20of%20primitive%20data%20type%20also.%20Collections.binarysearch()%20works%20for%20objects%20Collections%20like%20ArrayList%20and%20LinkedList.%C2%A0).

8. Read all comments of posts I used.

9. Find some real case.

## TODO: Understand more.

1. Big O.

On Geeks for Geeks's post, it was said that the big O of a linear search is O(x), and on binary searches is O(log x). What I need to understand is how that binary's big O was calculated. At the same post, two Big Os was showed: Time Complexity and Auxiliary Space. What is the difference of them?

2. Algorithmic Paradigm: [Decrease and Conquer](https://www.geeksforgeeks.org/decrease-and-conquer/).

On Geeks for Geeks's post, it was mentioned as the paradigm used by one of the implementations of the binary search. I neet to understando a little more about that paradigm.

3. Another search algorithms.

On Geeks for Geeks's post, another two search algorithms was quoted: interpolation and exponential search.

4. Treatment for int overflow.

On some of the posts I studied, they said that it is better to use the expression "int mid = low + ((high – low) / 2)" to find the middle index than use "int mid = (hig - low) / 2", since on the first way we avoid int overflows. I need to understand a little more about how the "low +" term can help us with that.

# References

- [Geeks for Geeks](https://www.geeksforgeeks.org/binary-search/);
- [Coding with John](https://www.youtube.com/watch?v=NFhOrxtXXcM);
- [Baeldung](https://www.baeldung.com/java-binary-search);
- [Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms#binary-search);
- [Shikhar on Geeks for Geeks](https://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/);
- [Fireship](https://www.youtube.com/watch?v=MFhxShGxHWc).
