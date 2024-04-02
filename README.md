# SmartBubbleSort
This code should be used if the user needs to sort an array of characters. The algorithm sorts based on ASCII. Characters with a lower ASCII value move to the front of the array and vice versa.

## BubbleSort
The BubbleSort sorts by using a nested for loop. The outside forloop is the counter and makes sure the BubbleSort runs the required amount of times(length times). The inside for loop compares each element with the element to the right. If the right element has a lower ASCII value it swaps the position of the two elements so that the element to the right has the greater ASCII value. 

## Smart
This type of BubbleSort is called the smart bubble sort because it doesn't just sort the characters once. It sorts the amount of times needed for the characters to be sorted. It does this through the outside for loop going though length repetitions. Length repetitions is the worst-case scenario for the bubblesort because if the character with the lowest ASCII holds the right most position in the array it will take length number of bubblesorts to move the character to the left most position and vice versa.
