# Problem Statement
You have been given an array/List 'ARR' of length 'N' consisting of non-negative integers ARR1, ARR2,......,ARRN. The i'th integer denotes a point with coordinates (i,Arr[i]).'N' vertical lines are drawn such that the two endpoints of the i'th line are at (i,arr[i] and (i,0).
<br>
Your task is to find two lines, which, together with the x-axis, form a container, such that the container contains the most water. Return the maximum area of the container.

<br>

**NOTE**
<br>
`1. Consider the continer to be 2-dimensional for simplicity.`
<br>
`2. For any pair of sides ignore all the lines that lie inside that pair of sides.`
<br>
`3. You are not allowed to slant the container.`
<br>

**INPUT FORMAT:**
<br>
`The first line contains a single integer 'T' denoting the number of test cases.`
<br>
`The first line of each test cases contains a single integer 'N' denoting the number of elements in the  array/list.`
<br>
`The secound line of each test case contains 'N' single space-separated integers denoting the elements of the array/list.`
<br>

**OUTPUT FORAMT:**
<br>

`For each test case, return a single integer which denotes the maximum area of the container.`
<br>

**Sample Input1:**
<br>
2
<br>
5
<br>
2 4 7 0 3
<br>
3
<br>
7 5 9
<br>

**Sample Output1:**
<br>
9
<br>
14
<br>
![sample1-5830](https://user-images.githubusercontent.com/93486108/186842996-50e26835-a69d-4306-aa46-57524fc5ae9c.png)
